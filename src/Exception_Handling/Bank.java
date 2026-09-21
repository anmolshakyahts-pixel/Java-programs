import java.util.Scanner;

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    private static Account[] accounts = new Account[100];
    private static int accountCount = 0;

    private static Account findAccount(String accNum) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accNum)) {
                return accounts[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu Options:");
        System.out.println("1: Create Account (Usage: 1 <accNum> <name> <balance>)");
        System.out.println("2: Deposit        (Usage: 2 <accNum> <amount>)");
        System.out.println("3: Withdraw       (Usage: 3 <accNum> <amount>)");
        System.out.println("4: Check Balance  (Usage: 4 <accNum>)");
        System.out.println("5: Exit");
        System.out.println("----------------------------------------------");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] tokens = line.split("\\s+");
            int option;

            try {
                option = Integer.parseInt(tokens[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-5).");
                continue;
            }

            switch (option) {
                case 1: // Create Account (Requires 4 arguments)
                    if (tokens.length < 4) {
                        System.out.println("Error: Usage is -> 1 <accNum> <name> <balance>");
                        break;
                    }
                    String accNum = tokens[1];
                    String name = tokens[2];
                    double initialBalance = Double.parseDouble(tokens[3]);
                    accounts[accountCount++] = new Account(accNum, name, initialBalance);
                    System.out.println("Account created successfully for " + name + " (Account: " + accNum + ").");
                    break;

                case 2: // Deposit (Requires 3 arguments)
                    if (tokens.length < 3) {
                        System.out.println("Error: Usage is -> 2 <accNum> <amount>");
                        break;
                    }
                    accNum = tokens[1];
                    double depositAmount = Double.parseDouble(tokens[2]);
                    Account depAcc = findAccount(accNum);
                    if (depAcc != null) {
                        depAcc.deposit(depositAmount);
                        System.out.println("Deposited " + (int) depositAmount + " into account " + accNum + ".");
                    } else {
                        System.out.println("Account " + accNum + " not found.");
                    }
                    break;

                case 3: // Withdraw (Requires 3 arguments)
                    if (tokens.length < 3) {
                        System.out.println("Error: Usage is -> 3 <accNum> <amount>");
                        break;
                    }
                    accNum = tokens[1];
                    double withdrawAmount = Double.parseDouble(tokens[2]);
                    Account withAcc = findAccount(accNum);
                    if (withAcc != null) {
                        if (withAcc.getBalance() >= withdrawAmount) {
                            withAcc.withdraw(withdrawAmount);
                            System.out.println("Withdrew " + (int) withdrawAmount + " from account " + accNum + ".");
                        } else {
                            System.out.println("Insufficient balance in account " + accNum + ".");
                        }
                    } else {
                        System.out.println("Account " + accNum + " not found.");
                    }
                    break;

                case 4: // Check Balance (Requires 2 arguments)
                    if (tokens.length < 2) {
                        System.out.println("Error: Usage is -> 4 <accNum>");
                        break;
                    }
                    accNum = tokens[1];
                    Account balAcc = findAccount(accNum);
                    if (balAcc != null) {
                        int finalBalance = (int) balAcc.getBalance();
                        System.out.println("Balance for account " + accNum + ": " + finalBalance);
                    } else {
                        System.out.println("Account " + accNum + " not found.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Enter a number between 1 and 5.");
                    break;
            }
        }

        scanner.close();
    }
}