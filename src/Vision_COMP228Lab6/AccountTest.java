package Vision_COMP228Lab6;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        Account sharedAccount = new Account(1000.0); // Initial balance
        ArrayList<Transaction> transactions = new ArrayList<>();

        // Add transactions
        transactions.add(new Transaction(sharedAccount, true, 200.0));  // Deposit
        transactions.add(new Transaction(sharedAccount, false, 500.0)); // Withdraw
        transactions.add(new Transaction(sharedAccount, false, 800.0)); // Withdraw
        transactions.add(new Transaction(sharedAccount, true, 100.0));  // Deposit

        // ExecutorService to handle threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (Transaction transaction : transactions) {
            executor.execute(transaction);
        }

        executor.shutdown();
    }
}
