public class UC4 {

    public static void main(String[] args) {

        String greeting;

        if (args.length > 0) {
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}