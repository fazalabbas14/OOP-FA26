public class Account {
    private int balance=0;


    public Account(){
        System.out.println("Running Constructor with no argument....");
    }

    public void depositAmount(int amount){
        balance += amount;
        System.out.println(amount+" rupees deposited successfully.");
    }

    public void getBalance(){
        System.out.println("Current balance is: "+ balance);
    }

    public void withdrawAmount(int amount){
        if (balance > 0 && balance > amount){
            System.out.println("Your amount "+amount+"PKR has withdraw successfully.");
            balance = balance - amount;
            System.out.println("Your current balance is RS."+balance);
        }
        else{
            System.out.println("Sorry! can not withdraw. Your current balance is Rs."+balance);
        }

    }

}
