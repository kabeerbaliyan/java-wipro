
//Base class

class Customer {

 // Method to calculate discount, default logic for generic customers

 public double calculateDiscount(double amount) {

     return 0.0; // No discount by default

 }

}



//Subclass for Regular Customer

class RegularCustomer extends Customer {

 @Override

 public double calculateDiscount(double amount) {

     // Regular customers get a 5% discount

     return amount * 0.05;

 }

}



//Subclass for Premium Customer

class PremiumCustomer extends Customer {

 @Override

 public double calculateDiscount(double amount) {

     // Premium customers get a 15% discount

     return amount * 0.15;

 }

}



//Subclass for Employee

class Employee extends Customer {

 @Override

 public double calculateDiscount(double amount) {

     // Employees get a 25% discount

     return amount * 0.25;

 }

}



//Main class to test the solution

public class kabeer {

 public static void main(String[] args) {

     // Create instances of each user type

     Customer regularCustomer = new RegularCustomer();

     Customer premiumCustomer = new PremiumCustomer();

     Customer employee = new Employee();



     // Example purchase amount

     double purchaseAmount = 1000.0;



     // Calculate and display discounts

     System.out.println("Regular Customer Discount: $" + regularCustomer.calculateDiscount(purchaseAmount));

     System.out.println("Premium Customer Discount: $" + premiumCustomer.calculateDiscount(purchaseAmount));

     System.out.println("Employee Discount: $" + employee.calculateDiscount(purchaseAmount));

 }

}