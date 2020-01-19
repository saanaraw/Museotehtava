package fi.academy;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String menuteksti = "\nAnna vaihtoehto:\n"
            + "1: Lisää museo\n"
            + "2: Tulosta kaikki\n"
            + "0: Lopeta";
    private static ArrayList museot = new ArrayList<>();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println(menuteksti);
            String vastaus = scanner.nextLine().trim();
            if ("1".equals(vastaus)) {
                lisaaUusi(scanner);
            } else if ("2".equals(vastaus)) {
                tulostaMuseot();
            } else if ("0".equals(vastaus)) {
                break;
            } else {
                System.err.println(String.format("Tuntematon vaihtoehto: '%s'", vastaus));
            }
        }
    }


    private void tulostaMuseot() {


        for (int i = 0; i < museot.size(); i++) {
            System.out.println(museot.get(i));
        }


    }


    private void lisaaUusi(Scanner scanner) {


        while (true) {

            System.out.println("Syötä museon nimi: ");
            String nimi = scanner.nextLine();

            System.out.println("Syötä museon sijainti: ");
            String sijainti = scanner.nextLine();

            System.out.println("Syötä museon perustamisvuosi: ");
            Integer perustamisvuosi = Integer.valueOf(scanner.nextLine());

            fi.academy.Museo tiedot = new fi.academy.Museo(nimi, sijainti, perustamisvuosi);

            museot.add(tiedot);

            break;

        }

    }

    public static void main(String[] args) {
        new Main().run();
    }
}