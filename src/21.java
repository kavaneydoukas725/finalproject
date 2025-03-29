public class FinalProject {
    public static void main(String[] args) {
        // Example of user input with default values
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
        
        // Additional code for demonstration purposes
        
        System.out.println("Do you want to continue? (yes/no)");
        String answer = sc.nextLine().toLowerCase();
        if ("yes".equals(answer)) {
            // Continue with the main method
            System.out.println("Main loop started...");
            continue;
        } else {
            // Exit the program
            System.out.println("Goodbye!");
            exitApplication();
        }
    }

    private static void exitApplication() {
        System.exit(0);
    }
}
