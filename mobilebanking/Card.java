package mobilebanking;

public class Card {
    private CardStatus status;

    public Card() {
        this.status = CardStatus.ACTIVE;
    }

    public final void setStatus(CardStatus status) {
        this.status = status;
        System.out.println("Статус картки: " + status);
    }

    public CardStatus getStatus() {
        return status;
    }
}
