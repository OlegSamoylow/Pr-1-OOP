package mobilebanking;

public class Consultant extends User {

    public Consultant(String name) {
        super(name);
    }

    public void assistDispute(Dispute dispute) {
        System.out.println("Консультант супроводжує заявку");
        dispute.setProcessed(true);
    }

    @Override
    public void performRole() {
        System.out.println("Консультант допомагає клієнту");
    }
}
