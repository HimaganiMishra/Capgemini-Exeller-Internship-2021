package Car;

public class Car {
	private int ModelNo;
	private String Carname;
    private int price;
    private float mileage;


   public String getCarname() {
	return Carname;
}
   public void setCarname(String carname) {
	Carname = carname;
}
   public int getPrice() {
	return price;
}
   public void setPrice(int price) {
	this.price = price;
}
   public float getMileage() {
	return mileage;
}
   public void setMileage(float mileage) {
	this.mileage = mileage;
}
   public void setModelNo(int modelNo) {
	ModelNo = modelNo;
}}

