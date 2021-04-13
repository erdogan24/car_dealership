package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer ();
		cust1.setName("Erdoðan");
		cust1.setAddress("123 Anything St.");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("BMW","M3",2000);
		
		
		Employee emp = new Employee();
				
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW","M3",2000);
		
		boolean value =car.equals(vehicle);
		System.out.println(value);
		
		
	}

}
