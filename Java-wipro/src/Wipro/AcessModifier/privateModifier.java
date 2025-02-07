package Wipro.AcessModifier;

public class privateModifier {
	
	private int num1 = 30;
    private int num2 = 40;

    private int multiplyNumbers() {
        return num1 * num2;
    }

    // Public method to access the private variables and method
    public void accessPrivate() {
        System.out.println("Accessing private variables: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Multiplication result (private): " + multiplyNumbers());
    }
    
    public static void main(String[] args) {
        privateModifier Obj = new privateModifier();
        Obj.accessPrivate();
    }

}
