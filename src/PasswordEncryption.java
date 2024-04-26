import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Kelas PasswordEncryption berisi metode untuk mengenkripsi password.
 *
 * @author RamaMajid
 */

public class PasswordEncryption {

    /**
     * Metode ini menerima sebuah string sebagai parameter dan mengembalikan string yang telah dienkripsi.
     * Proses enkripsi dilakukan dalam tiga langkah:
     * 1. Mengubah setiap karakter menjadi 5 karakter setelahnya dalam alfabet.
     * 2. Menukar tiga karakter pertama dan tiga karakter terakhir.
     * 3. Membalik urutan seluruh karakter dalam string.
     *
     * @param input String yang akan dienkripsi.
     * @return String hasil enkripsi.
     */
    public static String shiftCharacters(String input) {
        // Cek jika panjang password memenuhi syarat
        if (input.length() < 8 || input.length() > 15) {
            return "Invalid password length!";
        }

        // Langkah 1: Mengubah 5 karakter huruf sesudah
        StringBuilder shiftedInput = new StringBuilder();
        for (char c : input.toCharArray()) {
            shiftedInput.append((char) ((c - 'A' + 5) % 26 + 'A'));
        }
        System.out.println("Hasil Langkah 1: " + shiftedInput.toString());

        // Langkah 2: Menukar 3 huruf pertama dan 3 huruf terakhir
        Queue<Character> charQueue = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            charQueue.add(shiftedInput.charAt(i));
        }
        String middle = shiftedInput.substring(3, shiftedInput.length() - 3);
        String lastThree = shiftedInput.substring(shiftedInput.length() - 3);

        StringBuilder shiftedStringBuilder = new StringBuilder();
        shiftedStringBuilder.append(lastThree);
        shiftedStringBuilder.append(middle);
        while (!charQueue.isEmpty()) {
            shiftedStringBuilder.append(charQueue.poll());
        }
        System.out.println("Hasil Langkah 2: " + shiftedStringBuilder.toString());

        // Langkah 3: Balik urutan seluruh karakter
        String reversedString = new StringBuilder(shiftedStringBuilder.toString()).reverse().toString();
        System.out.println("Hasil Langkah 3: " + reversedString);

        return reversedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String input = scanner.nextLine();
        String output = shiftCharacters(input);
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
