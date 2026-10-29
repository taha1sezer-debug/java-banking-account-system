abstract class Account {
  protected String ownerName;
  protected double[][] transactions = new double[3][2];

   public Account(String ownerName){
      this.ownerName= ownerName;

   }
   public  double calculateBalance(){
      double totalDeposits =0;
      double totalWithdrawals =0;

      for(int i=0; i< transactions.length; i++) {
          totalDeposits += transactions[i][0];
          totalWithdrawals += transactions[i][1];
      }
      return totalDeposits - totalWithdrawals;
   }

   public abstract String getAccountStatus();

   public void displayInfo(){
       System.out.println("Name:" + ownerName);
       System.out.println("Total Balance:" + calculateBalance());
       System.out.println("Account Status:" + getAccountStatus());
   }











}