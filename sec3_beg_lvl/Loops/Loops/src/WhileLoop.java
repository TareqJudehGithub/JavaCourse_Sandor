public class WhileLoop {

    /**
     * While loop practise
     * @param args
     */
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("BEING RIGHT SUCKS!");
            System.out.println(i);
            i++;
        }
        System.out.println("");
        int number = 5;
        while (number > 0) {
            System.out.println(number);
            number--;
            if (number == 0) {
                System.out.println("READY, STEADY, GO!");
            }
        }
    }
}
