

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Options(CreateMonth());
    }

    //Compares months and informs user fo results. Sending in the first month and the scanner object so I don't need to make a new scanner object.
    public static void Comparison(Month m, Scanner sc) {

        System.out.print("\nPlease type in the number of the second month: ");
        Month secondMonth = new Month(sc.nextInt());
        // If they're equal
        if (m.equals(secondMonth)) {
            System.out.print("\nThe months are equal.\n");
        }
        // If the second month is bigger.
        if (m.greaterThan(secondMonth)) {
            System.out.print("\nThe first month is smaller.\n");

        }
        // If the second month is smaller
        if (m.lessThan(secondMonth)) {
            System.out.print("\nThe first month is bigger.\n");
        }

    }

    // Create initial month for users.
    public static Month CreateMonth() {
        int choice;
        Month month = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to place in a month by name, number or leave as default(Feurary)?\n1.Name\n2.Number\n3.Default\nResponse: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Please type name of month: ");
                month = new Month(sc.next());
                break;
            case 2:
                System.out.print("Please type number of month: ");
                month = new Month(sc.nextInt() - 1);
                break;
            case 3:
                break;
        }
        return month;
    }

    // Give the user options to choose from.
    public static void Options(Month month) {
        // choice for options.
        int choice;
        Scanner sc = new Scanner(System.in);
        

    // ask the user what they want to do.
        do {
            System.out.print("\nThank you now choose one of the following options: \n1.Get month name\n2.Get month number\n3.Compare months\n4.Set new month number\n5.Exit\n");
            choice = sc.nextInt();
            switch (choice) {
                // get name
                case 1:
                    System.out.print(month.GetMonthName());
                    break;
                // get month number
                case 2:
                    System.out.print(month.GetMonthNumber());
                    break;
                // compare months
                case 3:
                    Comparison(month, sc);
                    break;
                // set up a new number for month.
                case 4:
                    System.out.print("Type new number to set:\n");
                    month.SetMonthNumber(sc.nextInt());
                    break;

            }

        } while (choice
                != 5);
    }
}
