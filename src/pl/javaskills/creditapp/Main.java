package pl.javaskills.creditapp;

import pl.javaskills.creditapp.client.ConsoleReader;
import pl.javaskills.creditapp.core.CreditApplicationService;
import pl.javaskills.creditapp.core.model.CreditApplication;
import pl.javaskills.creditapp.core.model.Person;

public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService();
        CreditApplication creditApplication = new ConsoleReader().readInputParameters();

        String decision = service.getDecision(creditApplication);

        System.out.println(decision);
    }
}
