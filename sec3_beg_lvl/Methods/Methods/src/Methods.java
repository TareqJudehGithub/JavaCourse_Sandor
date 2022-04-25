public class Methods {
    /**
     * Methods Practice
     */
    public static void main(String[] args) {
        // Call your function/method here

        greetUser("goldie75"); // calling greetUser

        double firstDiscount = discountDouble(100); // calling discountDouble
        int secondDiscount = discountInt(100);      // calling discountInt
        System.out.println(firstDiscount);
        System.out.println(secondDiscount);

        countDown(5); // calling countDown
    }

    public static double discountDouble(double price) {
        return price * 0.10;
    }
    public static int discountInt(int price) {
        return price * 5;
    }

    // A procedure that does not return any value
    static void greetUser(String username) {
        System.out.println("Hello, " + username);
    }

    // Countdown function
    static void countDown(int counter) {
        for (int i = 0; i < counter; counter-- ) {
            System.out.println(counter);
        }
    }
}
