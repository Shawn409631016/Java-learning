public class Account {
    
    private String name;
    private double balance;
    
    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0 ){
            this.balance = balance;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println("Your account name is: " + name);
    }

    public void getBalance(){
        System.out.println("Your account balance is: " + balance);
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount <= balance){
            balance = balance - withdrawAmount;
            System.out.println("Withdraw:" + withdrawAmount);
            System.out.println("Your account balance After withdraw:" + balance);
        }else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }

}
