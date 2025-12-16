package mobilebanking;

public class Main {
    public static void main(String[] args) {

        Card card = new Card();
        Client client = new Client("Олег", card);
        Consultant consultant = new Consultant("Консультант");
        RiskAnalyst analyst = new RiskAnalyst("Аналітик");

        Transaction transaction = new Transaction(5000);
        Dispute dispute = new Dispute(transaction);

        client.blockCard();
        analyst.reviewTransaction(transaction);
        consultant.assistDispute(dispute);
    }
}
