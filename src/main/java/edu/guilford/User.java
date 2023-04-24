package edu.guilford;


import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


/**
 * Hello world!
 *
 */
public class User 
{
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for user information
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        System.out.print("Enter your username: ");
        String username = input.nextLine();

        // Generate password
        String password = generatePassword(input);

        // Print out user information and generated password
        System.out.println("\nHello " + firstName + " " + lastName + "!");
        System.out.println("Your email is: " + email);
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + password);
    }
    public static String askForInput(Scanner input, String message) {
        System.out.println(message);
        return input.nextLine();
    }

    public static String generatePassword(Scanner input) {
        System.out.println("\nLet's create a password!");
        String petName = askForInput(input, "What is the name of your favorite pet?");
        String favColor = askForInput(input, "What is your favorite color?");
        String birthday = askForInput(input, "What is your birthday (MMDDYYYY)?");

        String password = petName.substring(0, 2) + favColor.substring(0, 2) + birthday.substring(0, 4); // creates a password based on the user responses

        //return password;
        String secretKey = "SecretKey"; // Replaced the return password line with the following code
        String encryptedPassword = AES.encrypt(password, secretKey); // to use the encrypt method from the AES class
        return encryptedPassword; // and return the encrypted password

    }
    

    public static class AES {

        private static SecretKeySpec secretKey;
        private static byte[] key;
    //Mehtod to set the encryption key based on given string
        public static void setKey(String myKey) {
            MessageDigest sha = null;
            try {
                key = myKey.getBytes("UTF-8"); // convert the string to bytes
                sha = MessageDigest.getInstance("SHA-1");
                key = sha.digest(key);
                key = Arrays.copyOf(key, 16); //use only the first 16 bytes as the key
                secretKey = new SecretKeySpec(key, "AES"); // create a secret key based on the key bytes
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    
        public static String encrypt(String strToEncrypt, String secret) { //method to encrypt a string using the given secret key
            try {
                setKey(secret); // set the encryption key 
                Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
                return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8"))); // encrypt the string and return the encrypted string
            } catch (Exception e) {
                System.out.println("Error while encrypting: " + e.toString());
            }
            return null;
        }
    
        public static String decrypt(String strToDecrypt, String secret) { // method to decrypt the string using the given secret key
            try {
                setKey(secret); // set the encryption key
                Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
                cipher.init(Cipher.DECRYPT_MODE, secretKey);
                return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))); // decrypt the input string and return it as a plain string
            } catch (Exception e) {
                System.out.println("Error while decrypting: " + e.toString());
            }
            return null;
        }
    }
}


