package HomeworkSinceApril.HomeworkBankCard;

public class Business extends Standard {
    private boolean increaseMoney = true;

    public Business(String cardHolder, int expirationDate, int balance, CardType cardtType, String cardNumber) {
        super(cardHolder, expirationDate, balance, cardtType, cardNumber);
    }

    public void increaseBalance() {
        if (increaseMoney) {
            depositMoney(1000000);
            increaseMoney = false;
        }
    }

    @Override
    public void onlineShopping(int price) {
        super.onlineShopping(price);
        int cashback;
        cashback = price * 10 / 100;
        depositMoney(cashback);
    }

    @Override
    public String toString() {
        return getCardHolder() + " " + getCardNumber() + " " + getExpirationDate() + " " + getCardType();
    }
}
