package proje1_manav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Secimler {
    public static double toplamFiyat = 0.0;
    public static List<String> sepet = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int secim;

    public static void secim() {
        System.out.println("Lütfen kategori seçiniz\n"
                + "1 Manav\n" + "2 Sarkuteri\n" + "3 Market\n" + "4 Odeme\n" + "5 Cikis");
        secim = scan.nextInt();
        if (secim == 1) {
            Manav.urunler();
        } else if (secim == 2) {
            Sarkuteri.urunler();
        } else if (secim == 3) {
            Market.urunler();
        } else if (secim == 4) {
            Odeme.odeme();
        } else if (secim == 5) {
            cikis();
        } else {
            System.out.println("Lutfen gecerli bir deger giriniz");
            secim();
        }
    }

    private static void cikis() {
        System.out.println("Cikis yapiyorsununz. Tekrar bekleriz");

    }
}