package org.example.After;
import java.util.Scanner;

/**
 *  Kelas ini digunakan untuk Memproses makanan dan tempat dijalankan pertama kali
 */
public class MenuPemesananMakanan {
    public static void main(String[] args) {

        int TotalHarga;
        Scanner scanner = new Scanner(System.in);
//      Ekstrak Method
        tampilkanMenu(Menu.getMenuMakanan(), Menu.getHargaMakanan(),Menu.getMenuMinuman(),Menu.getHargaMinuman());
        System.out.print("Pilihan Makanan Anda : ");
        int pilihanMakanan = scanner.nextInt();
        System.out.print("Pilihan Minuman Anda : ");
        int pilihanMinuman= scanner.nextInt();
        prosesPesanan(pilihanMakanan,pilihanMinuman);
        scanner.close();
    }

    /**
     * Digunakan untuk proses Menangani Proses Pesanan
     * @param pilihanMakanan Dengan Parameter Pilihan
     */
    private static void prosesPesanan(int pilihanMakanan, int pilihanMinuman) {
        if (pilihanMakanan >= 1 && pilihanMakanan <= Menu.getMenuMakanan().length) {
//            Introduce Variabel
            String NamaMakanan = Menu.getMenuMakanan()[pilihanMakanan - 1];
            System.out.println("=======================================================");
            System.out.println("Anda memesan Makanan " + NamaMakanan);
            System.out.println("Harga: $" + Menu.getHargaMakanan()[pilihanMakanan - 1]);//Inline Variable

        } else {
            System.out.println("Pilihan tidak valid");
        }

        if (pilihanMinuman >= 1 && pilihanMinuman <= Menu.getMenuMinuman().length) {
//            Introduce Variabel
            String namaMinuman = Menu.getMenuMinuman()[pilihanMinuman - 1];
            System.out.println("=======================================================");
            System.out.println("Anda memesan Minuman " + namaMinuman);
            System.out.println("Harga: $" + Menu.getHargaMinuman()[pilihanMinuman - 1]);//Inline Variable

        } else {
            System.out.println("Pilihan tidak valid");
        }

       int Total =  getTotal(Menu.getHargaMakanan()[pilihanMakanan - 1],Menu.getHargaMinuman()[pilihanMinuman - 1]);
        System.out.println("=======================================================");
        System.out.println("Total dari Pemesanan : $ "+Total);

        getDiskonResto(Total);
    }

    /**
     * Method untuk Mendapatkan sebuah diskon
     * @param Total
     */
    private static void getDiskonResto(int Total) {
        String pilihan;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah anda memiliki diskon (Y/N) :");
        pilihan = scanner.next();


        if (pilihan.equalsIgnoreCase("y")){
//          Total *= 0.75;
            Total *= 0.5;
            System.out.println("Biaya yang harus dibayar setelah didiskon 25% : "+Total);
        } else if (pilihan.equalsIgnoreCase("n")) {
            System.out.println("Biaya yang harus dibayarkan : "+Total);
        }else {
            System.out.println("Inputan Eror");
            getDiskonResto(Total);
        }
    }

    /**
     *  Untuk Menghitung TOtal
     * @param HargaMakanan
     * @param HargaMinuman
     * @return
     */
    private static int getTotal(int HargaMakanan, int HargaMinuman) {
        return HargaMakanan+HargaMinuman;
    }


    /**
     * Method untuk menampilkan sebuah Makanan dan Minuman
     * @param menuMakanan
     * @param hargaMakanan
     * @param menuMinuman
     * @param hargaMinuman
     */
    private static void tampilkanMenu(String[] menuMakanan, int[] hargaMakanan,String[] menuMinuman, int[] hargaMinuman) {
        System.out.println("Menu Pemesanan Makanan:");
        System.out.println("=======================================================");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i] + " - $" + hargaMakanan[i]);
        }
        System.out.println("Menu Pemesanan Minuman:");
        System.out.println("=======================================================");
        for (int i = 0; i < menuMinuman.length; i++) {
            System.out.println((i + 1) + ". " + menuMinuman[i] + " - $" + hargaMinuman[i]);
        }
    }
}