import SRP.Barista;
import SRP.Cashier;
import SRP.Manager;

public class MainClass {
    public static void main(String[] args) {
        // Create instances of each class
        Barista barista = new Barista();
        Cashier cashier = new Cashier();
        Manager customerServiceManager = new Manager();

        // Use the barista to make a coffee
        barista.makeCoffee("Espresso");

        // Use the cashier to process a transaction
        cashier.processTransaction(4.99);

        // Use the customer service manager to add a customer record
        customerServiceManager.addCustomerRecord("John Doe");
    }
    
}
