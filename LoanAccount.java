public class LoanAccount extends Account  {

    public LoanAccount(String ownerName){
        super(ownerName);
    }
    @Override
    public String getAccountStatus(){
        double balance = calculateBalance();

        if (balance >= 0){
            return "Loan Cleared";
        }else if (balance >= -3000 && balance < 0){
            return "Manageable Debt";
        }else {
            return "High Debt Risk";
        }
    }
}