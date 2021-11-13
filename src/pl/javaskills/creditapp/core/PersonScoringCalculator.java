package pl.javaskills.creditapp.core;


import java.math.BigDecimal;

public class PersonScoringCalculator {

    public int calculate(Person person){


        int score;
        boolean married = person.isMarried();
        BigDecimal income = new BigDecimal(person.getTotalMonthlyIncomeInPln());
        int numOfFamilyDependants = person.getNumOfFamilyDependants();


        BigDecimal divide = income.divide(new BigDecimal(numOfFamilyDependants)); // dochód przez członkó rodziny
        score = divide.intValue();
        score = score/1000;
        score = score * 100;
        score = person.isMarried() == true ? score + 100 : score + 0;



        return score;
    }

}
