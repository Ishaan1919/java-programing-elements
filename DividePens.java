public class DividePens{
    public static void main(String[] args){
        int pens = 14;
        int students = 3;
        int penPerStudent = pens/students;
        int remainingPens = pens%students;
        System.out.print("The Pen Per Student is " + penPerStudent +" and the remaining pen not distributed is " + remainingPens);
    }
}