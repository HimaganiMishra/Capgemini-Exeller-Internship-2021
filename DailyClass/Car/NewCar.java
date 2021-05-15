package Car;

public class NewCar {
	public static void main(String[]args) {
		Car audi= new Car();
		 Car bmw = new Car();
		 Car Mercedes = new Car();
		 
		 audi.setCarname("Audi r8");
		 audi.setMileage(22);
		 audi.setModelNo(8);
		 System.out.println(audi.getCarname());
	}
 
}
