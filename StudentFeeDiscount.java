import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + discountedFee);
    }
}
