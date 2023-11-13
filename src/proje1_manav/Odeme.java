package proje1_manav;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Odeme {
    public static void odeme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nasıl ödemek istersiniz?\n"
                + "1 Kapıda nakit\n" + "2 Kredi kartı");
        int odeme = scan.nextInt();


    }
}
