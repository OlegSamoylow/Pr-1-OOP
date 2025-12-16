package mobilebanking;

public class RiskAnalyst extends User implements Reviewable {

    public RiskAnalyst(String name) {
        super(name);
    }

    @Override
    public void reviewTransaction(Transaction transaction) {
        System.out.println("Аналітик перевіряє транзакцію: " + transaction.getAmount());
    }

    @Override
    public void performRole() {
        System.out.println("Аналітик аналізує ризики");
    }
}
