package OOP;

public class Wallet {
    private User user;
   private double baLanCe;
   public   Wallet(double baLance,User user){
       this.baLanCe=baLanCe;
       this.user=user;
   }
    public double getBalance() {
        return baLanCe;
    }

    public void setBalance(double baLanCe) {
        this.baLanCe = baLanCe;
    }
    public User getUser(){
       return user;
    }
    public void setUser(User user){
       this.user=user;
    }
    //if you want to put money int the wallet.
    //The amount parameter is the amount of money to be added.
    public void addFunds(double amount){
       this.baLanCe+=amount;
    }
    // It is used deduct money from the wallet balance.
    // The method first check if the balance is greater than or equal to the amount.
    // If it is, then the amount is subtracted from the balance and the method returns true.
    //Otherwise, the method returns false.
    public Boolean deductFunds(double amount){
       if(this.baLanCe>=amount){
           this.baLanCe-=amount;
           return true;
       }
       else {
           return false;
       }
    }

}

