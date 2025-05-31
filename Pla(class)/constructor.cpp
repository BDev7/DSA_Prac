#include <iostream>
#include <string>

class BankAccount {
private:
    std::string accountHolderName;
    std::string accountNumber;
    double balance;

public:
   
    BankAccount(const std::string& name, const std::string& number, double initialBalance) 
        : accountHolderName(name), accountNumber(number), balance(initialBalance) {}

    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            std::cout << "Withdrawal of $" << amount << " successful.\n";
        } else {
            std::cout << "Insufficient funds or invalid amount.\n";
        }
    }


    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            std::cout << "Deposit of $" << amount << " successful.\n";
        } else {
            std::cout << "Invalid amount for deposit.\n";
        }
    }

    void checkBalance() const {
        std::cout << "Account Holder Name: " << accountHolderName << "\n";
        std::cout << "Account Number: " << accountNumber << "\n";
        std::cout << "Current Balance: $" << balance << "\n";
    }
};

int main() {
    BankAccount myAccount("Brahm Dev", "1234567890", 1000.0);

    myAccount.checkBalance();
    myAccount.withdraw(500.0);
    myAccount.deposit(200.0);
    myAccount.checkBalance();

    return 0;
}

