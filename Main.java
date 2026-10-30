import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter the number of accounts:");
        int accountsNum = inputs.nextInt();
        inputs.nextLine();

        Account[] accounts = new Account[accountsNum];

        for (int i = 0; i < accountsNum; i++) {

            System.out.println("Enter owner name:");
            String name = inputs.nextLine();

            System.out.println("Account type - (1) Savings, (2) Checking, (3) Loan?");
            int accType = inputs.nextInt();

            if (accType == 1) {
                accounts[i] = new SavingsAccount(name);
            } else if (accType == 2) {
                accounts[i] = new CheckingAccount(name);
            } else {
                accounts[i] = new LoanAccount(name);
            }

            System.out.println("Enter transactions for 3 months (Deposit and Withdrawal");
            for (int m = 0; m < 3; m++) {
                accounts[i].transactions[m][0] = inputs.nextDouble();
                accounts[i].transactions[m][1] = inputs.nextDouble();
            }
            inputs.nextLine();
            accounts[i].displayInfo();
        }
    }
}