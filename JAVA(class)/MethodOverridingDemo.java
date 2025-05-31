class Parent {
    // Static method in the parent class
    public static void staticMethod() {
        System.out.println("Static method in Parent");
    }
    
    // Non-static method in the parent class
    public void instanceMethod() {
        System.out.println("Instance method in Parent");
    }
}

class Child extends Parent {
    // Static method in the child class
    public static void staticMethod() {
        System.out.println("Static method in Child");
    }
    
    // Non-static method in the child class
    @Override
    public void instanceMethod() {
        System.out.println("Instance method in Child");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent parentRefToParent = new Parent();
        Parent parentRefToChild = new Child();
        Child childRefToChild = new Child();
        
        // Static method calls
        System.out.println("Static method calls:");
        parentRefToParent.staticMethod(); // Calls Parent's static method
        parentRefToChild.staticMethod();  // Calls Parent's static method (based on reference type)
        childRefToChild.staticMethod();   // Calls Child's static method
        
        // Non-static (instance) method calls
        System.out.println("\nInstance method calls:");
        parentRefToParent.instanceMethod(); // Calls Parent's instance method
        parentRefToChild.instanceMethod();  // Calls Child's instance method (based on object type)
        childRefToChild.instanceMethod();   // Calls Child's instance method
    }
}

