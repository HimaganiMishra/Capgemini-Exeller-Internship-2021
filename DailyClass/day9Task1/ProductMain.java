package day9Task1;

import java.time.LocalDate;
import java.util.*;

public class ProductMain {
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		ProductMain m=new ProductMain();
		HashSet<Product>  set = new HashSet<>();
		Product p1 = new Product("HP-Laptop",2000, 1,LocalDate.of(2020,2,4));
		Product p2 = new Product("Dell-Laptop",1600,5,LocalDate.of(2020,5,17));
		Product p3 = new Product("Apple-Laptop",20000,3, LocalDate.of(2020,6,30));
		Product p4 = new Product("HP-Laptop",1000,4,LocalDate.of(2020,6,15));
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		Iterator<Product> itr=set.iterator();    
	    while(itr.hasNext()){  
	    	Product y=itr.next();
	    	y.print(y);
	          
	    }  
	    System.out.println("============================================");
	    do {
	    System.out.println("Enter your choice: \n1-->Cost Range\t2--->Rating Range");
	    int t=sc.nextInt();
	    System.out.println("Enter the  Range from");
		int a=sc.nextInt();
		System.out.println("TO");
		int b=sc.nextInt();
		switch(t) {
		case 1:
			m.displayByPrice(set, a, b);
			break;
		case 2:
			m.displayByRating(set, a, b);
			break;
		default: break;
	    }
		System.out.println("Press <0> to exit........<1> to cont......");
	    n=sc.nextInt();
	    }while(n!=0);
		
		sc.close();
		
	} 
	public void displayByPrice(HashSet<Product> set,int a,int b)
	{
		Iterator<Product> i=set.iterator(); 
    while(i.hasNext()){  
    	Product x=i.next();
    	if(x.getProductCost()>=a && x.getProductCost()<=b)
    	
    	x.print(x);
    	
          
    }  }	
	
	public void displayByRating(HashSet<Product> set,int a,int b)
	{Iterator<Product> i=set.iterator(); 
    while(i.hasNext()){  
    	Product x=i.next();
    	if(x.getStartRating()>=a && x.getStartRating()<=b)
    	
    	x.print(x);
    	
          
    }  }


}