public class DiscountCalculator {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double discountFee = fee - discount;
        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + discountFee);
    }
}
