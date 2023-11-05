package StudentMarks;

public class CalculateMarks {
	
	int physics;
	int chemistry;
	int math;
	int arts;
	String Name;
	
	// variable declaration 
			int total;
			int avg;
	
	void TotalMarks()
	{
		// logic inside method
		total = physics+chemistry+math+arts;
		System.out.println("Total Marks = " + total);
		
	}
	void Average()
	{
		
		avg = (physics+chemistry+math+arts)/4;
		System.out.println("Average Marks = " + avg);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// class name obj name = new class name()
		
		CalculateMarks s1=new CalculateMarks();
		s1.physics = 32;
		s1.chemistry =85;
		s1.math =78;
		s1.arts =45;
		System.out.println("Student 1");
		s1.TotalMarks(); 
		s1.Average();
		System.out.println("\n");
		
		
		CalculateMarks s2=new CalculateMarks();
		s2.physics = 90;
		s2.chemistry =80;
		s2.math =26;
		s2.arts =99;
		System.out.println("Student 2");
		s2.TotalMarks(); 
		s2.Average();
		System.out.println("\n");
		
		CalculateMarks s3=new CalculateMarks();
		s3.physics = 39;
		s3.chemistry =35;
		s3.math =66;
		s3.arts =32;
		System.out.println("Student 3");
		s3.TotalMarks(); 
		s3.Average();
		System.out.println("\n");
		
		CalculateMarks s4=new CalculateMarks();
		s4.physics = 67;
		s4.chemistry =89;
		s4.math =12;
		s4.arts =23;
		System.out.println("Student 4");
		s4.TotalMarks(); 
		s4.Average();
		System.out.println("\n");
		

	}

}
