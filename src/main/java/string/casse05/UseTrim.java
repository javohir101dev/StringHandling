package string.casse05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UseTrim {

    public static void main(String[] args)
            throws IOException {
//// create a BufferedReader using System.in
//        String str;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 'stop' to quit.");
//        System.out.println("Enter State: ");
//        do {
//            str = scanner.nextLine();
//            str = str.trim(); // remove whitespace
//            if (str.equals("Illinois"))
//                System.out.println("Capital is Springfield.");
//            else if (str.equals("Missouri"))
//                System.out.println("Capital is Jefferson City.");
//            else if (str.equals("California"))
//                System.out.println("Capital is Sacramento.");
//            else if (str.equals("Washington"))
//                System.out.println("Capital is Olympia.");
//// ...
//        } while (!str.equals("stop"));



//        TODO CASE 1 STRIP
//        System.out.println("     AAAAAA \n    ");
//        System.out.println(" \t  AAAAAA \n    ".strip());
//        System.out.println(" \t  AAAAAA \n    ".trim());
//        System.out.println("     AAAAAA \n    ");


        System.out.println("     AAAAAA     ".stripTrailing());
        System.out.println("     AAAAAA     ".stripTrailing());

    }
}

