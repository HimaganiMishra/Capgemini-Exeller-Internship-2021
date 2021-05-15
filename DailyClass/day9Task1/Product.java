package day9Task1;
import java.time.LocalDate;
class Product
{
     String productName;
     int productCost;
     
     int startRating;
     LocalDate  manifacturingDate;
	public Product(String productName, int productCost, int startRating, LocalDate manifacturingDate) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.startRating = startRating;
		this.manifacturingDate = manifacturingDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getStartRating() {
		return startRating;
	}
	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}
	public LocalDate getManifacturingDate() {
		return manifacturingDate;
	}
	public void setManifacturingDate(LocalDate manifacturingDate) {
		this.manifacturingDate = manifacturingDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void print(Product p)
	{
		System.out.println(p.getProductName()+" "+p.getProductCost()+" "+p.getStartRating()+" "+p.getManifacturingDate());
	}


     
     
}