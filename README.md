# java-bank-account-management
This Java project implements a simple bank account management system. It includes abstract classes representing different types of bank accounts and allows users to perform actions such as depositing money, withdrawing money, and viewing account details.
# Key Features
 # Classes:
* Abstract Account Class: Provides a common interface for managing bank accounts. It includes methods for depositing money, withdrawing money, displaying account details, and displaying account balance. 
* Final Savings Account (SB_Account): Subclass of the Account class, represents a savings account. 
* It includes additional functionality for calculating interest based on the number of months the account has been active. 
* Final Current Account (Current_Account): Subclass of the Account class, represents a current account.
 # Methods:
* Deposit and Withdrawal: Users can deposit money into their accounts and withdraw money from their accounts.
* DispalyDetails : Display the User details as per the UserInput [Using Scanner class].
* The system performs appropriate balance checks to ensure that withdrawals do not exceed the account balance. 
* Implemented the run-time polymorphism by creating base class variable and derived class object,function overriding by having deposit and withdraw functions and perform the required action accordingly.

# Usage
Compile and Run: Compile the Java files using a Java compiler and run the Uesr class to start the program. 
Choose Account Type: When prompted, enter the type of account (Savings or Current) that you want to create. 
Enter Account Details: Provide the account number and account holder name as requested. 
Perform Actions: Deposit money, withdraw money, or display account details and balance as needed.
