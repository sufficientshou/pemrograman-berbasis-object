import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang : ");
        int jmlItem = input.nextInt();

        String[] kode = new String[jmlItem];
        String[] namaBarang = new String[jmlItem];
        int[] harga = new int[jmlItem];
        int[] jumlahBeli = new int[jmlItem];
        int[] jumlahBayar = new int[jmlItem];

        for (int i = 0; i < jmlItem; i++) {
            System.out.println("Data ke " + (i + 1));

            System.out.print("Masukkan Kode        : ");
            kode[i] = input.next();

            System.out.print("Masukkan jumlah Beli : ");
            jumlahBeli[i] = input.nextInt();

            switch (kode[i]) {
                case "a001":
                case "A001":
                    namaBarang[i] = "Buku  ";
                    harga[i] = 3000;
                    break;
                case "a002":
                case "A002":
                    namaBarang[i] = "Pensil";
                    harga[i] = 4000;
                    break;
                case "a003":
                case "A003":
                    namaBarang[i] = "Pulpen";
                    harga[i] = 5000;
                    break;
                default:
                    namaBarang[i] = "Invalid";
                    harga[i] = 0;
                    break;
            }

            jumlahBayar[i] = harga[i] * jumlahBeli[i];
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("******************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga   Jumlah Beli  Jumlah Bayar");
        System.out.println("=================================================================");

        int totalBayar = 0;

        for (int i = 0; i < jmlItem; i++) {
            System.out.println((i + 1) + "   " + kode[i] + "         " + namaBarang[i] + "       " + harga[i] + "    " + jumlahBeli[i] + "            " + jumlahBayar[i]);

            totalBayar += jumlahBayar[i];
        }

        System.out.println("=================================================================");
        System.out.println("Total Bayar                                        " + totalBayar);
        System.out.println("=================================================================");
    }
}