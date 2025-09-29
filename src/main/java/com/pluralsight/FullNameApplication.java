package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name\nFirst name: ");
        String firstName = input.nextLine();

        System.out.print("Middle name: ");
        String middleName = input.nextLine();

        System.out.print("Last name: ");
        String lastName = input.nextLine();

        System.out.print("Suffix: ");
        String suffix = input.nextLine();

        /*String fullName = firstName.trim() + " " + lastName.trim();

        if (middleName.isEmpty()) {
            System.out.println("Full name: " + fullName + ", " + suffix);
        } else if (suffix.isEmpty()) {
            fullName = firstName.trim() + " " + middleName.trim() + " " + lastName.trim();
            System.out.println("Full name: " + fullName);
        } else {
            fullName = firstName.trim() + " " + middleName + " " + lastName.trim();
            System.out.println("Full name: " + fullName + ", " + suffix);
        }*/

        String fullName = firstName.trim();

        if (!middleName.isEmpty()) {
            fullName += " " + middleName.charAt(0) + "."; // Refactored using solution
        }

        fullName += " " + lastName.trim(); // Refactored using solution

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix.trim();
        }

        System.out.println("Full name: " + fullName);

    }
}
