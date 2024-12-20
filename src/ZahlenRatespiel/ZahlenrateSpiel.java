package ZahlenRatespiel;

import java.util.Random;
import java.util.Scanner;

public class ZahlenrateSpiel {

    public static int benutzerEingabe(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void game(int r){
        int zaehler=0;
        while(zaehler < 5){
            int eingabe = benutzerEingabe();
            if(eingabe == r) {
                System.out.println("You won!");
                break;
            } else if (eingabe < r) {
                zaehler++;
                System.out.println("your input is too small");
            } else if (eingabe > r) {
                zaehler++;
                System.out.println("your input is too large");
            }
        }
        if(zaehler == 5){
            System.out.println("You have lost");
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(100);
        System.out.println("guess a number between 1 and 100");
        System.out.println("you have 5 attempts");
        game(random);
        }
}
