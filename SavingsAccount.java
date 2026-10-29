public class SavingsAccount extends Account {

    public SavingsAccount(String ownerName) {
        super(ownerName);
    }

    @Override
    public String getAccountStatus() {
        double balance = calculateBalance();

        if (balance >= 5000) {
            return "Premium Saver";
        } else if (balance >= 1000) {
            return "Regular Saver";
        } else if (balance >= 0) {
            return "Low Balance";
        } else {
            return "Over Drawn";
        }
    }
}


