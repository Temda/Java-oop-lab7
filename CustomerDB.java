import java.util.Scanner;

public class CustomerDB
{
    private Customer[] customers;
    private int count;

    public CustomerDB() {
        this.customers = new Customer[10];
        this.count = 0;
    }

    public void addCustomer(Customer customer) {
        if (count < 10) {
            this.customers[count++] = customer;
        } else {
            System.out.println("Database is full!");
        }
    }

    public void showAllCustomers() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "." + customers[i].toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerDB db = new CustomerDB();

        while (true) {
            System.out.println("===Main menu of Customer Database===");
            System.out.println("[1] Add new customer");
            System.out.println("[2] Show all customers");
            System.out.print("Your option [1,2] : ");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("===Add new customer===");
                    System.out.print("First Name: ");
                    String fName = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String lName = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();

                    System.out.print("Mobile Phone: ");
                    String mPhone = scanner.next();
                    db.addCustomer(new Customer(fName, lName, age, mPhone));
                    break;

                case 2:
                    System.out.println("===Show all customers===");
                    db.showAllCustomers();
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }    
}
