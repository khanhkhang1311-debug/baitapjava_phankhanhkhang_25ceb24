public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Alice", 'f');

        Account account = new Account(101, customer, 1000);

        System.out.println("Initial Account Details: " + account.toString());

        account.deposit(500);
        System.out.println("After depositing $500: " + account.toString());

        account.withdraw(200);
        System.out.println("After withdrawing $200: " + account.toString());

        account.withdraw(1500);
        System.out.println("After attempting to withdraw $1500: " + account.toString());

        System.out.println("Customer's name: " + customer.getName());
        System.out.println("Customer's discount: " + customer.getId() + "%");
    }
}
