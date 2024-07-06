package uas_pbo1_2210010188_syifasalsabila;

import java.util.Scanner;

public class RokokTampilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RokokMetode[] rokokArray = new RokokMetode[2];

        for (int i = 0; i < rokokArray.length; i++) {
            boolean validInput = false;

            while (!validInput) {
                System.out.println("Input data stok rokok ke-" + (i + 1));

                System.out.print("Masukkan Nama Rokok: ");
                String namaRokok = scanner.nextLine();

                System.out.print("Masukkan Isi Rokok: ");
                String isiRokok = scanner.nextLine();

                System.out.print("Masukkan Stok Masuk Rokok: ");
                String stokRokok = scanner.nextLine();

                // Cek nilai isiRokok
                int isiRokokInt = Integer.parseInt(isiRokok);
                if (isiRokokInt == 12 || isiRokokInt == 16 || isiRokokInt == 20) {
                    rokokArray[i] = new RokokMetode(namaRokok, isiRokok, stokRokok);
                    validInput = true; // Set validasi input ke true jika input valid
                } else {
                    System.out.println("Isi Rokok harus 12, 16, atau 20. Silakan ulangi input.");
                }
                

                System.out.println();
            }
        }

        System.out.println("Detail rokok:");
        for (RokokMetode rokokDetail : rokokArray) {
            System.out.println(rokokDetail.displayInfo());
            System.out.println();
        }

        scanner.close();
    }
}
