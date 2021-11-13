package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.client.ConsoleReader;

public class CreditApplicationService {
    public String getDecision(Person person){

        PersonScoringCalculator calculator = new PersonScoringCalculator();
        String decision = calculator.calculate(person) < 300 ?
                ("Sorry " + person.getName() + " " + person.getLastName() + " decision is negative") :
                ("Congratulations " + person.getName() + " " + person.getLastName() + " decision is positive");


        return decision;
    }
}
