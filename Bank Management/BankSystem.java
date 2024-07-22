import java.util.*;

public class BankSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User();
        do {
            System.out.println("Options:");
            System.out.println("1. Add details");
            System.out.println("2. View details");
            System.out.println("3. Deposit amount");
            System.out.println("4. Withdraw amount");
            System.out.print("Enter your option: ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    input.nextLine();
                    String accountName = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    if (age >= 18) {
                        System.out.print("Enter account number: ");
                        String accountNumber = input.next(); 
                        System.out.print("Enter initial balance: ");
                        double initialBalance = input.nextDouble();
                        System.out.println("Enter pin: ");
                        String pin = input.next();
                        user.addAccount(new Account(accountName, age, accountNumber, initialBalance,pin));
                        System.out.println("Account added successfully.");
                    } 
                    else {
                        System.out.println("Account holder should be more than 18 years old.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String accountNumberView = input.next(); 
                    Account accountcheck = user.getAccount(accountNumberView);
                    
                    if(accountcheck != null){
                        System.out.println("Enter pin: ");
                        String pintoview = input.next();
                        if(accountcheck.getPin().equals(pintoview)){
                            accountcheck.printDetails();
                        }
                        else{
                            System.out.println("incorrect pin");
                        }
                    }
                    else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String accountNumberDeposit = input.next(); 
                    System.out.print("Enter deposit amount: ");
                    double amountDeposit = input.nextDouble();
                    double accountdepositcheck = user.depositAmount(accountNumberDeposit,amountDeposit);
                    if (accountdepositcheck != -1){
                        System.out.println("account not found");
                       
                    }
                    else {
                        System.out.println("updated " );
                    }
                    
                    break;

            
                    case 4:
                    System.out.println("Enter account number: ");
                    String accountNumberwithdraw = input.next();
    
    
                    Account account = user.getAccount(accountNumberwithdraw);
                    if (account != null) {
                        System.out.println("Enter pin: ");
                        String amountWithdrawPin = input.next();

                        if (account.getPin().equals(amountWithdrawPin)) {
                            System.out.print("Enter withdraw amount: ");
                            double amountWithdraw = input.nextDouble();

                            double accountWithdraw = user.withdrawAmount(accountNumberwithdraw, amountWithdraw);
                            if (accountWithdraw != -1) {
                                System.out.println("Withdrawal successful. Updated balance: " + accountWithdraw);
                            
                                System.out.println("Insufficient funds");
                            }
                        } else {
                            System.out.println("Invalid PIN.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                    


            } 
        } while (true); 

    }
}
