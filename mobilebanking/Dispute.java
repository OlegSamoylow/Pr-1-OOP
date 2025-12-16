package mobilebanking;

public class Dispute {
    private Transaction transaction;
    private boolean processed;

    public Dispute(Transaction transaction) {
        this.transaction = transaction;
        this.processed = false;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
        System.out.println("Заява оброблена");
    }
}
