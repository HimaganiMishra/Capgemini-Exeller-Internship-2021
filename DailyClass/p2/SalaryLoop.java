package p2;

import java.util.Scanner;

public class SalaryLoop {
	
public static void main(String[] args) {
	
		double basicSalary, hra, da, tax=0, totalSalaryMonthly, totalSalaryAnnual, finalAnnualSalary;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<10;i++) {
			
			System.out.println("Please enter the Basic Salary (Monthly) for Employee #"+(i+1));
			
			basicSalary = sc.nextDouble();
			
			hra = 0.4 * basicSalary;
			da = 0.6 * (basicSalary + hra);
			totalSalaryMonthly = basicSalary + hra + da;
			totalSalaryAnnual = totalSalaryMonthly * 12;
			
			if(totalSalaryAnnual < 200000) {
				tax = 0;
			}
			else if(totalSalaryAnnual >= 200000 && totalSalaryAnnual <=600000) {
				tax = 0.1 * totalSalaryAnnual;
			}
			else if(totalSalaryAnnual > 600000) {
				tax = 0.2 * totalSalaryAnnual;
			}
			finalAnnualSalary = totalSalaryAnnual - tax;
			
			
			System.out.print("The Annual Take-Home Salary for Employee #"+(i+1)+" is: " + finalAnnualSalary + 
					"\nThe Annual Salary (Before Tax Reduction) is: " + totalSalaryAnnual +
					"\nThe Annual Tax is: " + tax + 
					"\nThe Monthly Salary (Before Tax Reduction) is: " + totalSalaryMonthly +
					"\nThe HRA is: " + hra +
					"\nThe DA is: " + da + "\n");
		}
		sc.close();
}
}