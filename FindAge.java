import java.util.Scanner;

public class FindAge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int currentYear = 2024;
		int age = currentYear - year;
		System.out.print("Harry's age in 2024 is " + age);
	}
}