import java.util.ArrayList;

public class User {
    public ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public Account getAccount(String accountNumber){
        for (Account account:accounts){
            if(account.getAccountNumber().equals(accountNumber)){
               
                return account;
            }
        }
        return null;
    }

    public Account getPin(String pin){
        for (Account account : accounts ){
            if (account.getPin().equals(account)){
                return account;
            }   
        }
        return null;

    }
    public double depositAmount(String accountNumberDeposit, double depositAmount){
        for (Account account:accounts){
            if(account.getAccountNumber().equals(accountNumberDeposit))
            {
            double initial = account.getBalance();
            initial += depositAmount;
            account.setBalance(initial);
            }
        }
        return -1;
    }  

    public double withdrawAmount(String accountNumberWithdraw, double withdrawAmount){
        for (Account account:accounts){
            if(account.getAccountNumber().equals(accountNumberWithdraw)){
                double balance = account.getBalance();
                balance -= withdrawAmount;
                account.setBalance(balance);
                return balance;
            }
        }
        return -1;
    }

    }

