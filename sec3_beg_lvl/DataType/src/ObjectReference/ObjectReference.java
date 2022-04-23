package ObjectReference;

/**
 * Practice of Java Primitive data types
 * @author Tareq Judeh
 *
 * */
public class ObjectReference {
    /**
     * Main class
     * @param args
     */
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        int price = 14999;
        Long registrationNumber = 12312321L;
        Float fuelConsumption = 15.5F;
        Double fuelPrecise = 15.2132;
        Boolean isDamaged = true;
        Character energyEfficiency = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 392");

        System.out.println("Price int: " + price);
        System.out.println("Price Double: " + (double) price);
        System.out.println("Car model Upper: " + carModel.toUpperCase());

    }
}
