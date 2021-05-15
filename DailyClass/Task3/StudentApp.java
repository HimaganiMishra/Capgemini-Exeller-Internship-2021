package Task3;

import java.util.*;

public class StudentApp {
		
		Student s;
		
		public static void main(String[] args) {
			

			Scanner sc=new Scanner(System.in);
			StudentApp o=new StudentApp();
			sc.close();
			
			
			
			Student ab=new Student("MTS MBS","F","WE TI 17",77,245.0,6, 5398);
			Student st=new Student("RTS TAR","M","WE TO 17",97,530.0,6, 5780);
			
			o.display(ab);
			o.display(st);
			
		}
		
		
		
		
		public void display(Student s)
		{
			System.out.println("Student Details:\n"+s.getStudentName()
			+"\nRoll no: "+s.getRollno()+"\nGender: "+s.getStudentGender()
			+"\nMarks Obtained: "+s.getObtainedmarks()+" out of "+
			(s.getnosub()*100));
			if(s.getUpdateFees()==s.getFees())
				System.out.println("\nStudent has passed. "
						+ "No changes in fees viz "+s.getFees());
			else
				System.out.println("Student has failed. Previous fees: "
						+s.getFees()+" Updated Fees: "+s.getUpdateFees());
			
			
			System.out.println(s.getP()+" "+s.getPercent()+"\n\n");
			
		}
	}


