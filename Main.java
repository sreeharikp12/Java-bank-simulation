import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        Account acc = new Account(name, initialBalance);

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double w = sc.nextDouble();
                    acc.withdraw(w);
                    break;

                case 3:
                    System.out.println("Current Balance: " + acc.getBalance());
                    break;

                case 4:
                    acc.showHistory();
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
