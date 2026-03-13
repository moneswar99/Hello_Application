public class UC3 {

    public static void main(String[] args) {

        // Assign name based on whether argument is provided
        String name = (args.length > 0) ? args[0] : "World";

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}