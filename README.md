# Banking Account Management System — Java

A console-based **object-oriented programming (OOP)** exercise modeling savings, checking, and loan accounts.

## Features
- Create multiple accounts interactively.
- Record deposits and withdrawals over **three periods** in a 2D array.
- Calculate net balance from deposits minus withdrawals.
- Display account-specific status according to balance thresholds.

## Design
- `Account`: abstract superclass providing account owner, transactions, balance calculation, and a shared display method.
- `SavingsAccount`: saver tiers based on balance.
- `CheckingAccount`: healthy, low-funds, and overdrawn statuses.
- `LoanAccount`: cleared, manageable debt, and high-debt-risk statuses.
- `Main`: command-line input and account selection.

## Java concepts
**Abstraction**, **inheritance**, **method overriding**, **polymorphism**, constructors, `super`, arrays, loops, and `Scanner`.

## Run
Requires the JDK:
```bash
javac *.java
java Main
```

The program asks for account types and three pairs of deposit/withdrawal values per account.

> Educational simulation only. It does not connect to a bank or store real financial records. Input validation and automated tests are possible improvements.
