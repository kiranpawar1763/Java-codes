/*Bank Application
Objective:
Develop a Java program for a bank application that performs deposit, withdrawal, transfer, loan application, and balance check operations with proper input validation and error handling. The program should utilize a Bank interface, BankAccount and Customer classes, and an ATM class to demonstrate the application's functionality. Use custom exceptions, switch-case statements, try-with-resources, and multi-catch blocks for error handling.

Requirements:
Custom Exceptions:

class InsufficientFundsException(Checked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when there are not enough funds for a withdrawal or transfer.

class InvalidAmountException(Unchecked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when an invalid amount is entered for any transaction.

class AccountNotFoundException(Checked):
Methods:
Parameterized Constructor with String as parameter
Purpose: Thrown when an account is not found during a transfer.

class LoanNotAllowedException(Unchecked):
Methods:
Parameterized Constructor with String as parameter
Purpose:
Thrown when the loan amount exceeds the allowed limit.

Bank Interface:
-------------------
Methods:

Method name: deposit 
return type : void
parameters : double amount
throws InvalidAmountException
Deposits the specified amount into the account. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: withdraw 
return type : void
parameters : double amount
throws InsufficientFundsException, InvalidAmountException:
Withdraws the specified amount from the account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: transfer 
return type : void
parameters : (BankAccount toAccount, double amount) 
throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException: 
Transfers the specified amount to another account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws AccountNotFoundException if the target account is not found. Throws InvalidAmountException if the amount is less than or equal to zero.


Method name: applyForLoan 
return type : void
parameters : (double amount) 
throws LoanNotAllowedException, InvalidAmountException:
Applies for a loan of the specified amount(50000). Throws LoanNotAllowedException if the loan amount exceeds the allowed limit(50000) or if the balance is less than specified amount(50000). Throws InvalidAmountException if the amount is less than or equal to zero.

Method name: getBalance 
return type : double
Returns the current balance of the account.

BankAccount Class(BLC):
Attributes:
accountNumber: long: private
balance:double: private

Implements Bank interface.
Methods:
Implement all methods from the Bank interface.
deposit(double amount): Increases the account balance by the specified amount. Throws InvalidAmountException if the amount is less than or equal to zero.

withdraw(double amount): Decreases the account balance by the specified amount. Throws InsufficientFundsException if the amount is greater than the account balance. Throws InvalidAmountException if the amount is less than or equal to zero.

transfer(BankAccount toAccount, double amount): Transfers the specified amount to another account. Throws InsufficientFundsException if the amount is greater than the account balance. Throws AccountNotFoundException if the target account is not found(i,e if toAccount is null). Throws InvalidAmountException if the amount is less than or equal to zero.

applyForLoan(double amount): Allows the user to apply for a loan. Throws LoanNotAllowedException if the loan amount exceeds the allowed limit. Throws InvalidAmountException if the amount is less than or equal to zero.

getBalance(): Returns the current balance of the account.
Constructor to initialize account number and initial balance.


Customer Class(BLC):
Attributes:
name: String: private
account: BankAccount: private //HAS-A

Methods:
Constructor to initialize the customer's name and account.

getAccount(): Returns the customer's bank account.

ATM Class(ELC):
Contains the main method to demonstrate the application.
Uses switch-case for different operations (deposit, withdraw, transfer, loan application, check balance).
Uses try-with-resources and multi-catch blocks for error handling , use switch case to  display the oprations as menu
like : 
      Select an option :
           1. Deposit
           2. Withdraw
           3. Transfer
           4. Loan Application
           5. Check Balance
           6. Exit
      Enter your option : 1

Validates all inputs.

Test Cases for Bank Application
---------------------------------
Deposit Test Cases - 1:
Valid Deposit:
Action: Deposit 1000 into account.
Expected Output: Balance should increase by 1000.
Invalid Deposit Amount:
Action: Attempt to deposit -500.
Expected Output: Should throw InvalidAmountException with appropriate message.

Withdrawal Test Cases - 2:
Valid Withdrawal:
Action: Withdraw 500 from account balance of 1000.
Expected Output: Balance should decrease by 500.
Insufficient Funds:
Action: Attempt to withdraw 1500 from account balance of 1000.
Expected Output: Should throw InsufficientFundsException with appropriate message.
Invalid Withdrawal Amount:
Action: Attempt to withdraw -200.
Expected Output: Should throw InvalidAmountException with appropriate message.

Transfer Test Cases - 3:
Valid Transfer:
Action: Transfer 300 from one account to another with sufficient balance.
Expected Output: Sender's balance should decrease by 300, receiver's balance should increase by 300.
Insufficient Funds for Transfer:
Action: Attempt to transfer 1000 from account with balance 500.
Expected Output: Should throw InsufficientFundsException with appropriate message.
Account Not Found:
Action: Attempt to transfer to a null account.
Expected Output: Should throw AccountNotFoundException with appropriate message.
Invalid Transfer Amount:
Action: Attempt to transfer -200.
Expected Output: Should throw InvalidAmountException with appropriate message.


Loan Application Test Cases - 4:
Valid Loan Application:
Action: Apply for a loan of 30000 with account balance greater than 50000.
Expected Output: Loan should be approved, balance should increase by 30000.
Loan Amount Exceeds Limit:
Action: Apply for a loan of 60000 with account balance greater than 50000.
Expected Output: Should throw LoanNotAllowedException with appropriate message.
Invalid Loan Amount:
Action: Apply for a loan of -200.
Expected Output: Should throw InvalidAmountException with appropriate message.
Check Balance Test Cases:

Valid Check Balance - 5:
Action: Retrieve balance after performing transactions.
Expected Output: Balance should reflect all deposits, withdrawals, transfers, and loans correctly.*/


// bank application that performs deposit, withdrawal, transfer,
import java.util.Scanner;


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

class LoanNotAllowedException extends RuntimeException {
    public LoanNotAllowedException(String message) {
        super(message);
    }
}


interface Bank {
    void deposit(double amount) throws InvalidAmountException;
    void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
    void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
    void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;
    double getBalance();
}


class BankAccount implements Bank {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException {
        if (toAccount == null) {
            throw new AccountNotFoundException("Target account not found.");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Transfer amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for transfer.");
        }
        this.withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Loan amount must be greater than zero.");
        }
        if (amount > 50000 || balance < 50000) {
            throw new LoanNotAllowedException("Loan amount exceeds the limit or insufficient balance for loan approval.");
        }
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }
}


public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        BankAccount account1 = new BankAccount(12345L, 100000);
        BankAccount account2 = new BankAccount(67890L, 50000);

        Customer customer = new Customer("John Doe", account1);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Loan Application");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");

            int option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        customer.getAccount().deposit(depositAmount);
                        System.out.println("Deposit successful. New balance: " + customer.getAccount().getBalance());
                        break;

                    case 2: 
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        customer.getAccount().withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful. New balance: " + customer.getAccount().getBalance());
                        break;

                    case 3: 
                        System.out.print("Enter transfer amount: ");
                        double transferAmount = scanner.nextDouble();
                        customer.getAccount().transfer(account2, transferAmount);
                        System.out.println("Transfer successful. New balance: " + customer.getAccount().getBalance());
                        break;

                    case 4:
                        System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        customer.getAccount().applyForLoan(loanAmount);
                        System.out.println("Loan approved. New balance: " + customer.getAccount().getBalance());
                        break;

                    case 5:
                        System.out.println("Current balance: " + customer.getAccount().getBalance());
                        break;

                    case 6: 
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } catch (InsufficientFundsException | AccountNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InvalidAmountException | LoanNotAllowedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
