package org.example.After;

//Delegate

/**
 * Kelas ini penyimpanan data
 */
public class Menu {
    //    Introduce Constant
    private static final String[] MENU_MAKANAN = new String[]{"CROISANT", "SPAGETI", "CHESSCAKE", "CAVIAR", "RICA-RICA SALAMENDER"};
    private static final int[] HARGA_MAKANAN = new int[]{1500, 1200, 2000, 1800, 1000};

    private static final String[] MENU_MINUMAN = new String[]{"ICE DEGAN", "KOPI", "SUSU", "VODKA", "ICE TEA"};
    private static final int[] HARGA_MINUMAN = new int[]{15, 12, 20, 18, 10};

//    Encapsulation

    /**
     * Digunakan untuk mengambil data Menu Makanan
     * @return
     */
    public static String[] getMenuMakanan() {
        return MENU_MAKANAN;
    }

    /**
     * Digunakan untuk Mengambil data Harga Makanan
     * @return
     */
    public static int[] getHargaMakanan() {
        return HARGA_MAKANAN;
    }

    /**
     * Digunakan untuk mengambil data Menu Minuman
     * @return
     */
    public static String[] getMenuMinuman() {
        return MENU_MINUMAN;
    }

    /**
     * Digunakan untuk mengambil data Harga Minuman
     * @return
     */
    public static int[] getHargaMinuman() {
        return HARGA_MINUMAN;
    }
}