package Question_86;

public class Vehicle {
    public void service() {
        System.out.println("Your car is under service now..!!");
    }

    class Car extends Vehicle{
        String brand;
        Car(String brand) {
            super();
            this.brand = brand;
        }

        public void service() {
            System.out.println("Your " + brand + " car is under service now..!!");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.service();

        Vehicle.Car fortuner = v.new Car("Fortuner");  // As Car inner class hence like this.
        fortuner.service();
        
    }
}

