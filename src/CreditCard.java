

public class CreditCard {

    private int account;
    private double currentAmount;

    public CreditCard(int account, double currentAmount) {
        this.account = account;
        this.currentAmount = currentAmount;
        System.out.println("Информация о карте без движения денег: ");
        this.getInformation();
    }

    public CreditCard() {}

    public void addAmount (double addingAmount) {
        if (addingAmount > 0) {
            currentAmount += addingAmount;
            System.out.println("Зачислено: " + addingAmount);
            getInformation();
        } else {
            System.out.println("Введена некорректная сумма!");
            getInformation();
        }
    }

    public void withdrawAmount (double withdrawCash) {
        if (withdrawCash > 0) {
            currentAmount -= withdrawCash;
            System.out.println("Снято: " + withdrawCash);
            getInformation();
        } else {
            System.out.println("Введена некорректная сумма!");
            getInformation();
        }
    }

    public void getInformation () {
        System.out.println("Номер счёта: " + account + "\nТекущая сумма: " + currentAmount + "\n=================");
    }
}
