public class Main {
    public static void main(String[] args) {
        System.out.println("Jenkins Java Program Running");

        if (args.length >= 2) {
            System.out.println("Parameter 1: " + args[0]);
            System.out.println("Parameter 2: " + args[1]);
        } else {
            System.out.println("No parameters received");
        }
    }
}
