public class ControlFlow {
    /**
     * If Else and Switch statements practice
     * @param args
     */
    public static void main(String[] args) {
        boolean isDamaged = true;
        String carColor = "red";
        char carCategory = 'Z';

        // Check if car is damaged:
        if (isDamaged) {
            System.out.println("Car is damaged");
        }
        else {
            System.out.println("Car is in a good shape!");
        }

        // Check car color
        if (carColor == "green") {
            System.out.println("Car color is green");
        }
        else if (carColor == "red") {
                System.out.println("Car color is red");
        }
        else {
            System.out.println("Car color is: " + carColor);
        }
        System.out.println("");
        switch (carCategory) {
            case 'G':
                System.out.println("Car Category is G");
                break;
            case 'C':
                System.out.println("Car Category is C");
                break;
            case 'B':
                System.out.println("Car Category is B");
                break;
            case 'H':
                System.out.println("Car Category is H");
                break;
            default:
                System.out.println("Car Category is not available.");
        }
    }
}
