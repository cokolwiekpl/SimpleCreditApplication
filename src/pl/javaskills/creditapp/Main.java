package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.Person;
import pl.javaskills.creditapp.core.PersonScoringCalculator;

public class Main {

    public static void main(String[] args) {

        Person person = new ConsoleReader().readInputParameters();
        CreditApplicationService creditApplicationService = new CreditApplicationService();
        System.out.println("Hello " + person.getName() + " " + person.getLastName());
        System.out.println(creditApplicationService.getDecision(person));




    }
}
