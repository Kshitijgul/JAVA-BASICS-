public class Scopes_in_java {
    // Class/Static scope variable
    static int staticVar = 100;

    // Instance scope variable
    int instanceVar = 50;

    public static void main(String[] args) {
        // Local scope variable within main method
        int localVar = 20;

        Scopes_in_java obj = new Scopes_in_java();
        obj.method(30);
    }

    void method(int paramVar) {
        // Local scope variable within method
        int methodVar = 40;

        // Accessing all variables from different scopes
        System.out.println("Static variable: " + staticVar);
        System.out.println("Instance variable: " + instanceVar);
//        System.out.println("Local variable (main method): " + localVar); // Error: localVar is not within scope
        System.out.println("Method parameter variable: " + paramVar);
        System.out.println("Local variable (method): " + methodVar);
    }
}
