package StudentMarks;
import java.util.*;

public class CalculateMarksScanner {
	int physics;
	int chemistry;
	int math;
	int arts;
	int total;
	
	void TotalMarks()
	{
		// variable declaration and logic
		
		total = physics+chemistry+math+arts;
		System.out.println("Total Marks = " + total);
		
	}
	void Average()
	{
		int avg;
		avg = total /4;
		System.out.println("Average Marks = " + avg);
		
	}
	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter the student name=");
		String studentName = scan.nextLine();
		
		CalculateMarksScanner student = new CalculateMarksScanner();
		
		System.out.println("Enter the marks for physics=");
		student.physics = scan.nextInt();
		System.out.println("Enter the marks for chemistry=");
		student.chemistry = scan.nextInt();
		System.out.println("Enter the marks for math=");
		student.math = scan.nextInt();
		System.out.println("Enter the marks for arts=");
		student.arts = scan.nextInt();
		System.out.println("Total and Average marks for " +studentName);
		System.out.println("============================================");
		student.TotalMarks();
		student.Average();
		System.out.println("============================================");
			
	
	}


}
