package HomeworkSinceApril.HomeworkBankCard;

public class Gold extends Standard {
    private int extraAccount = 100000;
    private int bonusQuantity;

    public Gold(String cardHolder, int expirationDate, int balance, CardType cardType, String cardNumber) {
        super(cardHolder, expirationDate, balance, cardType, cardNumber);
    }

    public int getBonusQuantity() {
        return bonusQuantity;
    }

    public void setBonusQuantity(int bonusQuantity) {
        this.bonusQuantity = bonusQuantity;
    }

    public void payForLunch(int payment) {
        if (extraAccount < payment) {
            System.out.println("Not enough money");
            System.exit(2);
        } else {
            extraAccount -= payment;
        }
    }

    @Override
    public void withdrawMoney(int quantity) {
        super.withdrawMoney(quantity);
        bonusQuantity += 2;
    }

    @Override
    public String toString() {
        return getCardHolder() + " " + getCardNumber() + " " + getExpirationDate() + " " + getCardType();
    }
}
