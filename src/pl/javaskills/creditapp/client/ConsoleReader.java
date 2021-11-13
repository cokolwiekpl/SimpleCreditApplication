package pl.javaskills.creditapp.client;

import pl.javaskills.creditapp.core.Person;

import java.util.Scanner;

public class ConsoleReader {

    public Person readInputParameters() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("Enter your last name");
        String lastName = scanner.next();

        System.out.println("Enter your mothers maiden name");
        String mothersMaidenName = scanner.next();

        System.out.println("Enter total monthly income in PLN");
        double income = scanner.nextDouble();

        System.out.println("Are you married");
        boolean married = scanner.nextBoolean();

        System.out.println("Enter number of family dependants (including applicant):");
        int numOfDependant = scanner.nextInt();

        return new Person(name, lastName, mothersMaidenName, income, married, numOfDependant);
    }
}
