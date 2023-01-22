public class BankAccount {

    private double amount;
    private double Random;

    public double getAmount(double v) {
        return amount;
    }
    public double  deposit(double sum){
        return sum + Random;
    }
    public double withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка. Сумма не может быть больше чем: ", 3.500);
        }
        return sum - Random;
    }


}
