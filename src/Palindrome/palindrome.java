package Palindrome;

import java.util.Scanner;

public class palindrome {

    public static boolean palindrome(String s)
    {
        boolean b = false;
        int zaehler = 0;
        for(int i=0; i<s.length()/2; i++)
        {
            if(s.charAt(i) == s.charAt(s.length()-1-zaehler))
            {
                zaehler++;
            }
        }
        if(zaehler!=s.length()/2)
        {
            return b;
        }
        b = true;
        return b;
    }
    public static void main(String[] args)
    {
        System.out.println("Gebe ein Wort ein um zu testen, ob das Wort ein palindrom ist.");
        System.out.println("Gebe zum beenden des Programms 'stop' ein");
        while(true){
            Scanner scanner = new Scanner(System.in);
            String eingabe = scanner.nextLine();
            if(eingabe.equals("stop"))
            {
                break;
            }
            if(palindrome(eingabe))
            {
                System.out.println("Ihre Eingabe ist ein Palindrom");
            }
            else
            {
                System.out.println("Ihre Eingabe ist kein Palindrom");
            }
        }
    }
}
