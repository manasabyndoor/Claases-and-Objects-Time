import java.util.Scanner;

public class TimeTest {
	public static void main(String args[]) {
		Time time1=new Time();
		Time time2=new Time();
		Time time3=new Time();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter hours of first number");
		time1.hours=scanner.nextInt();	
		
		
		System.out.println("Enter minutes part of first number");
		time1.minutes=scanner.nextInt();
		

		System.out.println("Enter hours of first number");
		time2.hours=scanner.nextInt();
		
		System.out.println("Enter minutes part of first number");
		time2.minutes=scanner.nextInt();
		
		time1.display();
		time2.display();
		
		int finalhours=time3.add(time1.hours, time2.hours);
		int finalminutes=time3.add(time1.minutes, time2.minutes);
		time3.validate(finalhours,finalminutes);
		
		System.out.print("Hours="+finalhours);
		System.out.print(":"+finalminutes);

}
}
