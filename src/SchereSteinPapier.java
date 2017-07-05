/**
 * Created by user on 03.07.17.
 */

import java.util.Random;
import java.util.Scanner;

    public class SchereSteinPapier {

    static int spieler_1;
    static int spieler_2;

    static int spieler_1_Runde;
    static int spieler_2_Runde;


    public static void gewonneneSpiele () {

        if (spieler_1_Runde > spieler_2_Runde );
        System.out.println(spieler_1_Runde+ "\n  spieler_1 gewonnene Spiele\n");
        if (spieler_1_Runde < spieler_2_Runde );
        System.out.println(spieler_2_Runde+ " \n  spieler_2 gewonnene Spiele\n");

    }



    public static void Hallo (){

        System.out.println("Wähle eine Zahl zwischen 1 & 3.");
        System.out.println(" 1 = Schere, 2 = Stein, 3 = Papier \n");
        System.out.println(" Dein Gegner ist Spieler_2 ");

}
    public static void beenden () {
        int auswahl;
        auswahl = 4;
        if (auswahl == 4) {
            System.out.println("Das Spiel wird beendet");
            System.exit(0);
            System.out.println("nach exit");
        }
    }
    public static void neuesSpiel() {



        Random random = new Random();

        //int=eine Zahl
        spieler_2 = random.nextInt(3);
        //random wird zufällig ausgewählt

        spieler_2 = spieler_2 + 1;
        System.out.printf("Dein Gegner wählt: %d  ", spieler_2);
        //printf = Zahlen zu string

        if (spieler_1 == spieler_2) {
            System.out.println("unentschieden \n");

        }
        if (spieler_1 == 2 & spieler_2 == 3) {
            System.out.println("spieler_2 hat gewonnen \n");
             spieler_2_Runde ++;
        }
        if (spieler_1 == 1 & spieler_2 == 2) {
            System.out.println("spieler_2 hat gewonnen \n");
            spieler_2_Runde ++;
        }
        if (spieler_1 == 3 & spieler_2 == 1) {
            System.out.println("spieler_2 hat gewonnen \n");
            spieler_2_Runde ++;
        }

        if (spieler_1 == 3 & spieler_2 == 2) {
            System.out.println("spieler_1 hat gewonnen \n");
            spieler_1_Runde ++;
        }
        if (spieler_1 == 2 & spieler_2 == 1) {
            System.out.println("spieler_1 hat gewonnen \n");
            spieler_1_Runde ++;
        }
        if (spieler_1 == 1 & spieler_2 == 3) {
            System.out.println("spieler_1 hat gewonnen \n");
            spieler_1_Runde ++;
        }



            }




        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Du bist Spieler_1.");

        do {

            Hallo();
            spieler_1 = scanner.nextInt();
            neuesSpiel();


        } while (spieler_1 != 4);


    gewonneneSpiele();
    beenden();


    }


}//end of class


// while true = unendliche Schleife