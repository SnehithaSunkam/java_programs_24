//9.Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and  'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
// Abstract class Bank
abstract class Bank {
    // Abstract method to get balance
    abstract int getBalance();
}

// BankA class that extends Bank
class BankA extends Bank {
    private int balance = 100;

    @Override
    int getBalance() {
        return balance;
    }
}

// BankB class that extends Bank
class BankB extends Bank {
    private int balance = 150;

    @Override
    int getBalance() {
        return balance;
    }
}

// BankC class that extends Bank
class BankC extends Bank {
    private int balance = 200;

    @Override
    int getBalance() {
        return balance;
    }
}

// Main class to test the implementation
public class MainBank {
    public static void main(String[] args) {
        // Create objects for each bank
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        // Display the balances of each bank
        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}
