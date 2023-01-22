public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20.000);

        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {

                try {
                    bankAccount.withDraw(600);
                } catch (LimitException ex) {
                    throw new RuntimeException("На карте не осталось денег");
                }
                bankAccount.getAmount(0.0);
                
            }
            break;
        }



    }
}