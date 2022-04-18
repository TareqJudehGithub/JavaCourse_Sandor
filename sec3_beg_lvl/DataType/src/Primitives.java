public class Primitives {

    public static void main(String[] args) {
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 2133214321423L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;
        double fuelConsumptionPreciseAverage = 15.3243243;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("Car Damaged: " + isDamaged);
        System.out.println("Cubic capacity " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + " kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + "g/km");
        System.out.println("Emission sticker: " + emissionSticker + " ( Energy: " + energyEfficiencyCategory);
        System.out.println(" Urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km");
        System.out.println("Number of door " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("\nConversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The values of new number of seats: " + newNumberOfSeats);

        byte newPower = (byte) power;
        System.out.println("The value of new Power = " + newPower + "kW");

    }
}
