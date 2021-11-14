package pl.javaskills.creditapp.core;

import pl.javaskills.creditapp.core.model.Person;

public class CreditApplicationService {

    public String getDecision(Person person) {
        PersonScoringCalculator calculator = new PersonScoringCalculator();
        String decision;

        if (calculator.calculate(person)< 300) {
            decision = "Sorry " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", decision is negative";

        }
        else if (calculator.calculate(person) >= 300 && calculator.calculate(person) <= 400){
            decision= "Sorry " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", bank req...";

        }
        else {
            decision= "Congratulations " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", decision is positive";
        }
        return decision;
    }
}
