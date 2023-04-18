package HomeworkSinceApril.HomeworkBankCard;

public class Standard {
    private String cardHolder;
    private int expirationDate;
    private int balance;
    private CardType cardType;
    private String cardNumber;

    public Standard(String cardHolder, int expirationDate, int balance, CardType cardType, String cardNumber) {
        setCardHolder(cardHolder);
        setExpirationDate(expirationDate);
        setBalance(balance);
        setCardType(cardType);
        setCardNumber(cardNumber);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdrawMoney(int quantity) {
        if (quantity > balance) {
            System.out.println("Not enough amount in your balance");
            System.exit(2);
        } else {
            balance -= quantity;
        }
    }

    public void depositMoney(int quantity) {
        balance += quantity;
    }

    public void onlineShopping(int price) {
        withdrawMoney(price);
    }
}
