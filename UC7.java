public class UC7 {
    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Case 2: Join all names with ", "
            String result = String.join(", ", args);
            System.out.println("Hello, " + result + "!");
        }
    }
}