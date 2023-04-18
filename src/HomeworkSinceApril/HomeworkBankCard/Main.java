package HomeworkSinceApril.HomeworkBankCard;

public class Main {
    public static void main(String[] args) {
        Business card1 = new Business("Petros Petrosyan", 2025, 150000, CardType.BUSINESS, "123456789123");
        card1.depositMoney(150000);
        card1.onlineShopping(30000);
        System.out.println(card1.getBalance());
        System.out.println(card1.toString());

        Gold card2 = new Gold("Aram Aramyan", 2024, 300000, CardType.GOLD, "456456456456");
        card2.withdrawMoney(10000);
        card2.withdrawMoney(10000);
        card2.withdrawMoney(10000);
        card2.withdrawMoney(10000);
        card2.withdrawMoney(10000);
        System.out.println(card2.getBonusQuantity());
        System.out.println(card2.toString());

    }
}
