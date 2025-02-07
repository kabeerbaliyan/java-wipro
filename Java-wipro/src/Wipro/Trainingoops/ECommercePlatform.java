/*Polymorphism Scenario:
You are working on an application for an eCommerce platform. The platform has a feature to calculate discounts for various user types (e.g., Regular Customer, Premium Customer, and Employee). The discount calculation logic varies based on the user type.
Question:
How would you design a solution using polymorphism to calculate discounts for different user types?
Hint for Answer:
Use a base class Customer with a method calculateDiscount().
Create subclasses RegularCustomer, PremiumCustomer, and Employee that override the calculateDiscount() method.
Use polymorphism to call the appropriate implementation at runtime.*/


package Wipro.Trainingoops;


class Customer {

 public double calculateDiscount(double amount) {
     return 0.0; 
 }
}


class RegularCustomer extends Customer {

 public double calculateDiscount(double amount) {
    //Regular Customer get a 5% discount
     return amount * 0.05;
 }
}


class PremiumCustomer extends Customer {

 public double calculateDiscount(double amount) {
     // Premium customers get a 15% discount
     return amount * 0.15;
 }
}

class EmployeE extends Customer {
 
 public double calculateDiscount(double amount) {
     // Employees get a 25% discount
     return amount * 0.25;
 }
}


public class ECommercePlatform {
 public static void main(String[] args) {
     
     Customer regularCustomer = new RegularCustomer();
     Customer premiumCustomer = new PremiumCustomer();
     Customer employee = new EmployeE();

    
     

     // Calculate and display discounts
     System.out.println("Regular Customer Discount: INR  " + regularCustomer.calculateDiscount(20000));
     System.out.println("Premium Customer Discount: INR  " + premiumCustomer.calculateDiscount(20000));
     System.out.println("Employee Discount: INR  " + employee.calculateDiscount(20000));
 }
}

