public class BankAccount {
    public static void main(String[] args){
    double balance = 1000.75;
    double amountToWithdraw = 250;
    //First, create a new double variable called updatedBalance, and store balance with amountToWithdraw subtracted from it.
    double updatedBalance =  balance - amountToWithdraw;

    //Create a double variable called amountForEachFriend that holds your updated balance divided by 3.
    double amountForEachFriend = updatedBalance / 3;

   //Your friends each want to buy a concert ticket with the money you’ve given them. The tickets cost 250!
   // Create a boolean called canPurchaseTicket and set it equal to whether or not amountForEachFriend is at least enough to purchase a concert ticket.
    boolean canPurchaseTicket = amountForEachFriend >=250;

  //Then, use System.out.println() to print canPurchaseTicket.
    System.out.println(canPurchaseTicket);

  //Use + and System.out.println() to print out:
    System.out.println("I gave each friend " + amountForEachFriend);
  }       
}
