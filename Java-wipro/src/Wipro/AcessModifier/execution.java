package Wipro.AcessModifier;

public class execution {
	public static void main(String[] args) {
        // PublicModifier usage
        publicModifier publicObj = new publicModifier();
        System.out.println("PublicModifier: num1 = " + publicObj.num1 + ", num2 = " + publicObj.num2);
        System.out.println("Addition result (public): " + publicObj.addNumbers());

        // PrivateModifier usage
        privateModifier privateObj = new privateModifier();
        privateObj.accessPrivate();

        // ProtectedModifier usage
        protectedModifier Obj = new protectedModifier();
    
      
    }

}
