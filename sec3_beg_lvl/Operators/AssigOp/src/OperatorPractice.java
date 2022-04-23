public class OperatorPractice {
    /**
     * Operators practice
     * @param args
     */
    public static void main(String[] args) {
    String carModel = "Dodge Challenger";
    int price = 14999;
    int moneyInBank = 100000;
    boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": " + price);
        int increasedPrice = price + 1000; // addition
        System.out.println("The increased price of a " + carModel + ": $" + increasedPrice);

        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a " + carModel + ": $" + decreasedPrice);

        int twoCarsPrice = price * 2;
            System.out.println("Two " + carModel + ": $" + twoCarsPrice);

        int carsYouCanBuy = moneyInBank / price;

        System.out.println("From the money we have in bank we can buy " + carsYouCanBuy + " " + carModel);

        int moneyRemaining = moneyInBank % price;
        System.out.println("Money remaining after buying " + carsYouCanBuy + " " + carModel + "$: " + moneyRemaining);
        System.out.println("Is damaged: " + !isDamaged);
        // instanceof checks whether an instance of part of a class or not, by returning a true/false boolean value.
        System.out.println("instanceof: " + (carModel instanceof String));

        // Ternary Operator:
        String damagedText = isDamaged ? "Car is damaged!" : "Car is knew";
        System.out.println(damagedText);
    }
}
