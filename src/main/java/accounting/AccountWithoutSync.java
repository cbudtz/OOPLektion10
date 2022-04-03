package accounting;

public class AccountWithoutSync {

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Balance" + account.getBalance());
        for (int i = 0; i < 5; i++) {
            new Thread(()->{

                try {
                    double balance = account.getBalance();
                    Thread.sleep(10);
                    account.setBalance(balance+1);
                    System.out.println("Balance" + account.getBalance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }).start();
        }



    }




}
