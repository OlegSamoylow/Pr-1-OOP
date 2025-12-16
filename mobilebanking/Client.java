package mobilebanking;

public class Client extends User {
    private Card card;

    public Client(String name, Card card) {
        super(name);
        this.card = card;
    }

    public void blockCard() {
        card.setStatus(CardStatus.BLOCKED);
        System.out.println("Картку заблоковано клієнтом");
    }

    @Override
    public void performRole() {
        System.out.println("Клієнт ініціює блокування картки");
    }
}
