# 💳 ATM Management System

A simple **ATM Management System** built using **Core Java**, demonstrating key **Object-Oriented Programming (OOP)** concepts and the **Collections Framework**.  
It simulates real-world ATM operations such as **balance inquiry**, **cash deposit**, **withdrawal**, and **mini statement**.

## 🧾 Features

- 🔐 **User Authentication** (via console)
- 💰 **Cash Deposit** and **Withdrawal**
- 🏦 **Balance Inquiry**  
- 📋 **Mini Statement** – displays recent transactions  
- 🔁 **Multiple Transactions** in a single session  

## 🧠 Core Concepts Used

- **Object-Oriented Programming** (Encapsulation, Abstraction, Inheritance, Polymorphism)  
- **Java Collections Framework** (`ArrayList`, `HashMap`)  
- **Interfaces and Classes** for modular structure  
- **Exception Handling** and **User Input Validation**  


## 📂 Project Structure

ATM-Management-System/
│
├── Atm.java # Main class that runs the ATM application
├── AtmInterface.java # Interface defining ATM operations
├── AtmOperation.java # Implements all banking functionalities
├── UserInterface.java # Handles user interaction and input
└── README.md # Project documentation


## ⚙️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Thahaseen-Shaik/ATM-Management-System.git
2. Open the project in your favorite Java IDE (like IntelliJ IDEA, Eclipse, or VS Code).
3. Compile and run the Atm.java file.
4. Follow the console menu to perform operations like deposit, withdrawal, and balance check


💻 Sample Output

ENTER THE ATM NUMBER:
123456
ENTER THE ATM PIN:
123
 1.viewAvailable
 2.withdrawAmount
 3.DepositAmount
 4.viewMinistatement
 5.exit
Enter  the option
3
Enter the amount to be deposit: 
1000
depositedAmount is:1000.0
AvailableBalance:1000.0
 1.viewAvailable
 2.withdrawAmount
 3.DepositAmount
 4.viewMinistatement
 5.exit
Enter  the option:
2
Enter the amount to withdraw:
200
Enter the amount in terms of 500
 1.viewAvailable
 2.withdrawAmount
 3.DepositAmount
 4.viewMinistatement
 5.exit
Enter  the option:
5
collect your  Atm card
 thank you for visiting


🌟 Future Enhancements

Add PIN-based authentication
Save transaction data using file handling or databases
Add a GUI version using Java Swing or JavaFX

👩‍💻 Author
Thahaseen Shaik

