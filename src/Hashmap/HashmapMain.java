package Hashmap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Program untuk mengidentifikasi dan menghitung frekuensi kemunculan warna pada sebuah gambar
 * serta menentukan warna yang paling dominan.
 *
 * <p>
 * Program ini meminta pengguna untuk memasukkan path gambar, kemudian membaca gambar tersebut
 * dan menghitung frekuensi setiap warna yang ada dalam gambar. Warna yang paling sering muncul
 * akan ditampilkan sebagai warna dominan. Pengguna dapat memilih untuk memproses gambar lain
 * setelahnya.
 * </p>
 *
 * @version 1.0
 * @since 2024-05-20
 * @see java.awt.Color
 * @see java.awt.image.BufferedImage
 * @see java.util.HashMap
 * @see javax.imageio.ImageIO
 *
 * author RamaMajid
 */
public class HashmapMain {

    /**
     * Metode utama yang menjalankan program.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path;

        do {
            try {
                // 1. Membaca gambar dari file
                System.out.print("Masukkan path gambar: ");
                path = scanner.nextLine();
                BufferedImage image = ImageIO.read(new File(path));

                if (image == null) {
                    System.out.println("Error: File tidak dapat dibaca sebagai gambar. Pastikan format file benar (misalnya JPEG atau PNG).");
                    continue;
                }

                // 2. Membuat HashMap untuk menyimpan frekuensi warna
                Map<String, Integer> colorFrequency = new HashMap<>();

                // 3. Iterasi melalui setiap pixel pada gambar
                for (int x = 0; x < image.getWidth(); x++) {
                    for (int y = 0; y < image.getHeight(); y++) {
                        // Mendapatkan warna pixel
                        Color color = new Color(image.getRGB(x, y));
                        String hexColor = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue()).toUpperCase();

                        // Menambahkan frekuensi warna ke HashMap
                        colorFrequency.put(hexColor, colorFrequency.getOrDefault(hexColor, 0) + 1);
                    }
                }

                // 4. Mencari warna dominan
                Map.Entry<String, Integer> dominantColor = null;
                for (Map.Entry<String, Integer> entry : colorFrequency.entrySet()) {
                    if (dominantColor == null || dominantColor.getValue() < entry.getValue()) {
                        dominantColor = entry;
                    }
                }
                

                // 5. Menampilkan warna dominan dan frekuensinya
                System.out.println("WARNA DOMINAN PADA GAMBAR ADALAH: " + dominantColor.getKey());
                System.out.println("JUMLAH FREKUENSI WARNA " + dominantColor.getKey() + ": " + dominantColor.getValue() + " PIXEL");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Apakah Anda ingin mengulang dengan gambar lain? (y/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));
    }
}