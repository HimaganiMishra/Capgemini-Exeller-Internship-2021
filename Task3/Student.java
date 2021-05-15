package Task3;
public class Student {
		
		// add property of student
		private int rollno;
		private String studentName;
		private double obtainedmarks;
		private int fees;
		private int updatedfees;
		private String studentGender;
		private String batchName;
		private int nosub;
		
		
		private double percent;
		private double p;
		
		
		




		public Student(String name, String gender, String batch,
				int roll, double marks, int sub, int f)
		{
			super();
			studentName=name;
			studentGender=gender;
			batchName=batch;
			rollno=roll;
			obtainedmarks=marks;
			nosub=sub;
			fees=f;
			calculateFees();
		}
		
		
		
		
		
		// add getters and setters
		
		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public double getObtainedmarks() {
			return obtainedmarks;
		}

		public void setObtainedmarks(int obtainedmarks) {
			this.obtainedmarks = obtainedmarks;
		}

		public int getFees() {
			return fees;
		}

		public void setFees(int fees) {
			this.fees = fees;
		}

		public String getStudentGender() {
			return studentGender;
		}

		public void setStudentGender(String studentGender) {
			this.studentGender = studentGender;
		}

		public String getBatchName() {
			return batchName;
		}

		public void setBatchName(String batchName) {
			this.batchName = batchName;
		}

		public int getnosub() {
			return nosub;
		}

		public void setnosub(int nosub) {
			this.nosub = nosub;
		}
		
		public int getUpdateFees() {
			return updatedfees;
		}
		
		
		public double getP() {
			return p;
		}

		public void setP(int p) {
			this.p = p;
		}
		
		public double getPercent() {
			return percent;
		}

		public void setPercent(int percent) {
			this.percent = percent;
		}


		public int getUpdatedfees() {
			return updatedfees;
		}


		public void setUpdatedfees(int updatedfees) {
			this.updatedfees = updatedfees;
		}


		public int getNosub() {
			return nosub;
		}


		public void setNosub(int nosub) {
			this.nosub = nosub;
		}


		public void setPercent(double percent) {
			this.percent = percent;
		}


		public void setP(double p) {
			this.p = p;
		}





		public int calculateMarks()// percent value remaining 0
		{
			// ......
			percent=obtainedmarks/nosub;
			return (int)percent;
		}

		/*  trigger
		 *  if student marks is less than 50 
		 *  ---->> fees += 50%
		 * */
		public void calculateFees()
		{
			p=calculateMarks();
			if (p!=50.0 && p<50.0)
				{
					updatedfees=fees+((50*fees)/100);
					
				}	
		}
	}

