public class Account {
    private String name;
    private int age;
    private String accountNumber;
    private double balance;
    private String pin;
    public Account(String name,int age,String accountNumber,double balance,String pin){
        this.name = name;
        this.age = age;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.pin = pin;
    }    

    public String getName(){
        return name;   
    }

    public int getAge(){
        return age;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getPin(){
        return pin;
    }


    public void setBalance(double balance){
        this.balance=balance;
    }

    public void printDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+getBalance());

    }
    
}

