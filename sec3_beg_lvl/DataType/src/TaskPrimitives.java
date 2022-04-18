public class TaskPrimitives {
    public static void main(String[] args) {
        // New User credentials

        int userID = 1264;
        String firstName = "John";
        char initial = 'M';
        String lastName = "Smith";
        String email = "john.smith@gmail.com";
        int mobile = +117894561;
        String address = "5812 Maple street, Oak Forrest";
        String city = "New Jersey";
        String country = "USA";

        System.out.println(
                "User credentials:\n" +
                "ID: " + userID + "\n" +
                "Name: " + firstName + " " + initial + "" + lastName + "\n" +
                "Email: " + email + "\n" +
                "Mobile: " + mobile + "\n" +
                "Address " + address + "\n" +
                "City: " + city + "\n" +
                "Country: " + country
        );

    }
}
