package pl.javaskills.creditapp.client;
import pl.javaskills.creditapp.core.Person;
import java.util.Scanner;

public class ConsoleReader {

    public Person readInputParameters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter you last name:");
        String lastName = scanner.next();
        System.out.println("Enter your mother’s maiden name:");
        String mothersMaidenName = scanner.next();



        return new Person(name,lastName, mothersMaidenName);
    }


}
