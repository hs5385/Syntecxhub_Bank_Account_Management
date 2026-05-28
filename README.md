# Bank Account Management System

A simple, Java-based Command Line Interface (CLI) application for managing bank accounts. This project demonstrates core Java concepts, including Object-Oriented Programming (OOP), the Collection Framework, and Maven project structure.

## 🚀 Features

- **Add Account**: Create new bank accounts with account number, holder name, initial balance, and account type (Savings/Current).
- **Display All Accounts**: View a complete list of all managed accounts.
- **Search Account**: Find specific account details using the account number.
- **Delete Account**: Remove an account from the system.
- **In-Memory Storage**: Uses Java's `ArrayList` for efficient management of account records during runtime.

## 🛠️ Technologies Used

- **Language**: Java 17
- **Build Tool**: Maven
- **Architecture**: MVC-inspired structure (Model, Service, Main)

## 📁 Project Structure

```text
E:\Projects\BankAccManagement\
├───src\
│   └───main\
│       └───java\
│           └───com\
│               └───bank\
│                   ├───Main.java          # Entry point and CLI logic
│                   ├───model\
│                   │   └───Account.java    # Data model for Bank Account
│                   └───service\
│                       └───AccountManager.java # Business logic and CRUD operations
└───pom.xml                                # Maven configuration
```

## ⚙️ Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher.
- Apache Maven installed.

### Installation & Running

1. **Clone the repository**:
   ```bash
   git clone https://github.com/hs5385/Syntecxhub_Bank_Account_Management.git
   cd BankAccManagement
   ```

2. **Build the project**:
   ```bash
   mvn clean compile
   ```

3. **Run the application**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.bank.Main"
   ```

## 📝 Usage

Follow the on-screen menu instructions to interact with the system:
1. Choose **1** to add a new account.
2. Choose **2** to see all existing accounts.
3. Choose **3** to search for a specific account.
4. Choose **4** to delete an account.
5. Choose **5** to exit the application.

## 🛣️ Roadmap

- [ ] Implement File I/O for data persistence.
- [ ] Add Deposit and Withdrawal functionality.
- [ ] Integrate Transaction History for each account.
- [ ] Add input validation and error handling.

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
