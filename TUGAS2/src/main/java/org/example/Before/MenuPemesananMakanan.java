package org.example.Before;
import java.util.Scanner;

public class MenuPemesananMakanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Ayam Bakar", "Soto Ayam", "Gado-gado"};
        int[] harga = {15000, 12000, 20000, 18000, 10000};

        System.out.println("Menu Pemesanan Makanan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("Pilih nomor menu: ");
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= menu.length) {
            System.out.println("Anda memesan " + menu[pilihan - 1]);
            System.out.println("Harga: Rp" + harga[pilihan - 1]);
        } else {
            System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}