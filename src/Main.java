public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount account = new BankAccount(15000);
        System.out.println("Текущий баланс: " + account.getAmount());

        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Снято 6000 сом. Текущий остаток: " + account.getAmount());
            } catch (LimitException e) {

                System.out.println("Недостаточно средств для снятия. Снимаем остаток: " + e.getRemainingAmount());

                account.withDraw((int) e.getRemainingAmount());
                System.out.println("Снято: " + e.getRemainingAmount() + ". Остаток: " + account.getAmount());
                break;
            }
        }
    }
}