Banking System with Advanced Operations:
==============================================
You are required to design and implement a banking system that supports multiple types of banks and a range of banking operations, including withdrawals, deposits, transfers, and loans. Each bank has its specific business logic for these operations.

Classes and Methods:

Bank (Super Class)
=======================

Fields:
bankName: String: protected 
branchName: String: protected
ifscCode: String: public static
Constructor:
Develop a parameterized constructor to initialized all variable except ifscCode.

Methods:
withdraw(double amount):public: void:  method to be Overridden by subclasses for withdrawal logic.
deposit(double amount):public: void:   method to be Overridden by subclasses for deposit logic.
transfer(double amount, BankAccount fromAccount, BankAccount toAccount):public: boolean: method to be Overridden by subclasses for transfer logic.
double loan(double amount, int years):public: void: method to be Overridden by subclasses for loan logic.

Axis (Subclass of Bank)
==========================

Fields:
private: interestRate: double
Constructor:
Develop a parameterized constructor to initialized all variable including inherited variable.

Methods:
@Override : withdraw(double amount):
Logic: Validate the withdrawal amount. If the amount is greater than zero, proceed with the withdrawal.
Validation: Check if the amount is greater than zero.

@Override: deposit(double amount):
Logic: Validate the deposit amount. If the amount is greater than zero, proceed with the deposit.
Validation: Check if the amount is greater than zero.

@Override: transfer(double amount, BankAccount fromAccount, BankAccount toAccount):
Logic: Validate the transfer amount and ensure the fromAccount has sufficient balance. Perform the transfer if valid.
[totalPayable = amount + (amount * interestRate * years / 100);]
Validation: Check if the amount is greater than zero and if fromAccount has sufficient balance.

@Override: loan(double amount, int years):
Logic: Calculate the total payable amount using the interest rate and loan duration.
Validation: Check if the loan amount is greater than zero.

ICICI (Subclass of Bank)
==========================

Fields:
loanLimit: double: private

Constructor:
Develop a parameterized constructor to initialized all variable including inherited variable.

Methods:
@Override: withdraw(double amount):
Logic: Validate the withdrawal amount. If the amount is greater than zero, proceed with the withdrawal.
Validation: Check if the amount is greater than zero.

@Override: deposit(double amount):
Logic: Validate the deposit amount. If the amount is greater than zero, proceed with the deposit.
Validation: Check if the amount is greater than zero.

@Override: transfer(double amount, BankAccount fromAccount, BankAccount toAccount):
Logic: Validate the transfer amount and ensure the fromAccount has sufficient balance. Perform the transfer if valid.
Validation: Check if the amount is greater than zero and if fromAccount has sufficient balance.

@Override: loan(double amount):
Logic: Validate the loan amount. If the amount is within the loan limit, approve the loan.
Validation: Check if the loan amount is greater than zero and within the loan limit.

SBI (Subclass of Bank)
===========================

Fields:
minimumBalance: double: private

Constructor:
Develop a parameterized constructor to initialized all variable including inherited variable.

Methods:
@Override: withdraw(double amount):
Logic: Validate the withdrawal amount. If the amount is greater than zero, proceed with the withdrawal.
Validation: Check if the amount is greater than zero.

@Override: deposit(double amount):
Logic: Validate the deposit amount. If the amount is greater than zero, proceed with the deposit.
Validation: Check if the amount is greater than zero.

@Override: transfer(double amount, BankAccount fromAccount, BankAccount toAccount):
Logic: Validate the transfer amount and ensure the fromAccount has sufficient balance after maintaining the minimum balance. Perform the transfer if valid.
Validation: Check if the amount is greater than zero and if fromAccount has sufficient balance after maintaining the minimum balance.

@Override: loan(double amount):
Logic: Approve the loan if the amount is greater than zero.
Validation: Check if the loan amount is greater than zero.

Customer(BLC)
=================
Fields:
customerId: int: private  
name: String: private  
address: String : private 
phoneNumber: String: private  
bankAccount: BankAccount: private 

Constructor:
Develop a parameterized constructor to initialized all variable including inherited variable.

Methods:
openAccount(Bank bank, double initialDeposit):public: void 
Logic: Open a new bank account with the given bank and initial deposit.
Validation: None.

closeAccount():public: void 
Logic: Close the existing bank account.
Validation: None.

getBankAccount():public: BankAccount 
Logic: Retrieve the associated bank account.
Validation: None.

checkBalance():public: double 
Logic: Check the balance of the associated bank account.
Validation: None.

BankAccount(BLC)
=================
Fields:
accountNumber: int: private
balance: double: private
bank: Bank: private

Constructor:
BankAccount(Bank bank, double initialDeposit)

Methods:
getAccountNumber():public: int 
Logic: Get the account number.
Validation: None.

getBalance():public: double 
Logic: Get the current balance.
Validation: None.

setBalance(double amount):public: void 
Logic: Set the balance to the given amount.
Validation: None.

withdraw(double amount):public: void 
Logic: Perform withdrawal using the bank's logic.
Validation: None.

withdraw(double amount, ATM atm):public: void 
Logic: Perform withdrawal using the ATM's logic.
Validation: None.

deposit(double amount):public: void 
Logic: Perform deposit using the bank's logic.
Validation: None.

deposit(double amount, ATM atm):public: void 
Logic: Perform deposit using the ATM's logic.
Validation: None.

transfer(double amount, BankAccount toAccount):public: boolean 
Logic: Perform transfer using the bank's logic.
Validation: None.

transfer(double amount, BankAccount toAccount, ATM atm):public: boolean 
Logic: Perform transfer using the ATM's logic.
Validation: None.

checkBalance():public: double 
Logic: Check the current balance.
Validation: None.

class ATM(BLC)
================
Methods:
withdraw(BankAccount account, double amount):public: static: void 
Logic: Perform withdrawal from the account.
Validation: None.
deposit(BankAccount account, double amount):public: static: void 
Logic: Perform deposit to the account.
Validation: None.

transfer(BankAccount fromAccount, BankAccount toAccount, double amount):public: static: boolean 
Logic: Perform transfer between accounts.
Validation: None.

class Main(ELC)
====================
Contains the main method to demonstrate the functionality with a user menu.
Instructions:
Initialize Banks:

Create instances of Axis, ICICI, and SBI banks with appropriate attributes.
Create Customer and Account:

Create a customer and open an account with an initial deposit in one of the banks.
Perform Operations:

Implement a user menu to perform the following operations:
// Main Menu
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit

Example of Menu Navigation in Console:
--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 

// If 1 is selected:
--- Select Bank ---
1. Axis Bank
2. ICICI Bank
3. SBI Bank
Select a bank: 
Enter initial deposit: 

// If 2 is selected:
--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 

// If 3 is selected:
--- ATM Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Back to Main Menu
Select an option: 

// If 4 is selected:
Confirm action to close the account.


SAMPLE INPUT OUTPUT
====================

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 1

--- Select Bank ---
1. Axis Bank
2. ICICI Bank
3. SBI Bank
Select a bank: 1
Enter initial deposit: 1000
Account opened successfully with initial deposit of 1000

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 2

--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 1
Your balance is: 1000.0

--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 2
Enter amount to withdraw: 200
Withdrawal of 200 from Axis bank successful.

--- Bank Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Loan
6. Back to Main Menu
Select an option: 1
Your balance is: 800.0

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 3

--- ATM Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Back to Main Menu
Select an option: 2
Enter amount to withdraw: 300
ATM withdrawal of 300 successful.

--- ATM Operations ---
1. Check Balance
2. Withdraw
3. Deposit
4. Transfer
5. Back to Main Menu
Select an option: 1
Your balance is: 500.0

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 4
Account closed successfully.

--- Main Menu ---
1. Open Account
2. Bank Operations
3. ATM Operations
4. Close Account
5. Exit
Select an option: 5
