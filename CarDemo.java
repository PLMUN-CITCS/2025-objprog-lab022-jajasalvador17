public class CarDemo {

    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Assign values to the attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the displayInfo method
        myCar.displayInfo();
    }
}

class Car {
    // Attributes (data fields)
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}