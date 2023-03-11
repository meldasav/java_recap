package car_dealership;

public class Dealership {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setName("Tom");
        customer1.setAddress("123 white St");
        customer1.setCashOnHand(12000);

        Vehicle vehicle = new Vehicle("Honda","Accord",15000);


        Employee emp = new Employee();
        customer1.purchaseCar(vehicle, emp, false);

        Vehicle car = new Vehicle("BMW","M3",20000);
        boolean value = car.equals(vehicle);
        System.out.println(value);

    }
}
