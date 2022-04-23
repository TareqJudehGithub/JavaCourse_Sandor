public class Task {
    /**
     * Control Flow Task - Who wants to be a millionaire
     */
    public static void main(String[] args) {
        // Correct answer
        String answer = "Tomas Edison";

        // Solution using an If statement
        if (answer == "Tomas Edison") {
            System.out.println("Your answer is correct!");
        }
        else {
            System.out.println("Wrong answer. Keep trying");
        }

        // Solution using a While loop
        while (answer != "Tomas Edison") {
            System.out.println("That's the wrong answer! Try again!");
            continue;
        }
        System.out.println("Correct!");
    }
}
