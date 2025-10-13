// Grabbed ConsoleHelper from previous projects:
package com.pluralsight;

import java.time.LocalDate;

import java.util.Scanner;

public class ConsoleHelper {

    private static Scanner scanner = new Scanner(System.in);

    public static String promptForString(String prompt) {
        System.out.println(prompt + ": ");
        return scanner.nextLine();
    }

    public static int promptForInt(String prompt) {
        System.out.println(prompt + ": ");
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static LocalDate promptForDate(String prompt){

        while(true){
            try{
                System.out.print(prompt + ": ");
                String dateAsString = scanner.nextLine();
                return LocalDate.parse(dateAsString);
            }
            catch(Exception ex){
                System.out.println("Invalid Entry, please enter a valid date (YYYY-MM-DD)");
            }
        }
    }

    public static float promptForFloat(String prompt) {
        System.out.println(prompt + ": ");
        float result = scanner.nextFloat();
        scanner.nextLine();
        return result;
    }

    public static long promptForLong(String prompt) {
        System.out.println(prompt + ": ");
        long result = scanner.nextLong();
        scanner.nextLine();
        return result;
    }

    public static double promptForDouble(String prompt) {
        System.out.println(prompt + ": ");
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }


}
    

