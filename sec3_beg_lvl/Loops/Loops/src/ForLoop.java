public class ForLoop {
    /**
     * For loop practice
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i ++) {
            System.out.println("Hello World!");
        }
        System.out.println("");
        String[] vegetables = {"Cucumber", "Tomato", "Potato", "Lettuce", "Onion"};


        // Iterate over all items in vegetables and print them out
        for (int i = 0; vegetables.length > i; i++) {
            System.out.println(vegetables[i] + " " + i);
            System.out.println();
        }

    }
}
