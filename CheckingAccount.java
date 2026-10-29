public class CheckingAccount extends Account {

   public CheckingAccount(String ownerName){
       super(ownerName);
   }
   @Override
    public String getAccountStatus(){
       double balance = calculateBalance();

       if (balance >= 500){
           return "Healthy Account";
       }else if (balance >= 0 && balance < 500){
           return "Low Funds";
       }else {
           return "Overdrawn -Fee Applied";
       }
   }
}
