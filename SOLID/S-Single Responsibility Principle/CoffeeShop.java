class CoffeeShop {
    // Details of the Coffee Shop

    // Single class handling multiple responsibilities
    public void makeCoffee(String coffeeType) {
        System.out.println("Making " + coffeeType);
    }

    public double handleTransaction(double amount) {
        System.out.println("Processing transaction of $" + amount);
        return amount;
    }

    public void addCustomerRecord(String customerName) {
        System.out.println("Adding record for customer: " + customerName);
    }
}