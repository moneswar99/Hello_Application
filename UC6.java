public class UC6 {
    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to append names with delimiter
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        if (nameBuilder.length() > 0) {
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);
            System.out.println("Hello, " + result + "!");
        }
    }
}