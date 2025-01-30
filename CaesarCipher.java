import java.util.Scanner;

public class CaesarCipher {

    // Method to encrypt the text using Caesar Cipher
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        // Loop through each character in the original text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Encrypt uppercase letters
            if (Character.isUpperCase(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'A' + shift) % 26) + 'A');
                encryptedText.append(encryptedChar);
            }
            // Encrypt lowercase letters
            else if (Character.isLowerCase(currentChar)) {
                char encryptedChar = (char) (((currentChar - 'a' + shift) % 26) + 'a');
                encryptedText.append(encryptedChar);
            }
            // Non-alphabetic characters remain unchanged
            else {
                encryptedText.append(currentChar);
            }
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for text and shift value
        System.out.print("Enter text to encrypt: ");
        String text = scanner.nextLine();

        System.out.print("Enter shift value: ");
        int shift = scanner.nextInt();

        // Encrypt the text using Caesar Cipher
        String encryptedText = encrypt(text, shift);

        // Display the encrypted text
        System.out.println("Encrypted text: " + encryptedText);

        scanner.close();
    }
}