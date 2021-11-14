package pl.javaskills.creditapp.core.model;

public class Person {
    private final PersonalData personalData;
    private final ContactData contactData;
    private final PurposeOfLoan purposeOfLoan;

    public Person(PersonalData personalData, ContactData contactData, PurposeOfLoan purposeOfLoan) {
        this.personalData = personalData;
        this.contactData = contactData;
        this.purposeOfLoan = purposeOfLoan;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public ContactData getContactData() {
        return contactData;
    }
}
