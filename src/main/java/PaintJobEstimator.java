
import java.util.Scanner;
/**
 *
 * @author Caleb
 */
public class PaintJobEstimator {
   public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many rooms need painted?");
        int numberOfRooms = Integer.parseInt(keyboard.nextLine());
        System.out.println("How much is your paint per gallon?");
        double paintPrice = Double.parseDouble(keyboard.nextLine());
        double totalSquareFeet = 0;

        for(int i = 1; i <= numberOfRooms; i++){
            System.out.println("What is the square feet of wall space of room " + i);
            String roomSqFt = keyboard.nextLine();
            totalSquareFeet = totalSquareFeet + Double.parseDouble(roomSqFt);
        }
        double gallonsOfPaint = paintRequired(totalSquareFeet);
        double laborRequired = laborHoursRequired(totalSquareFeet);
        double totalPaintCost = totalPaintCost(gallonsOfPaint, paintPrice);
        double totalLaborCost = totalLaborCost(laborRequired);
        double totalJobCost = totalJobCost(totalPaintCost, totalLaborCost);

        System.out.println("Gallons of paint: " + gallonsOfPaint);
        System.out.println("Labor hours: " + laborRequired);
        System.out.println("Total paint cost: $" + totalPaintCost);
        System.out.println("Total labor cost: $" + totalLaborCost);
        System.out.println("Total job cost: $" + totalJobCost);


    }

    public static double paintRequired(double totalSquareFeet){
        return totalSquareFeet / 115;
    }    
    public static double laborHoursRequired(double totalSquareFeet){
        return totalSquareFeet / 115 * 8;
    }
    public static double totalPaintCost(double gallonsOfPaint, double paintPrice){
        return gallonsOfPaint * paintPrice;
    }
    public static double totalLaborCost(double laborHours){
        return laborHours * 18;
    }
    public static double totalJobCost(double totalPaint, double totalLabor){
        return totalPaint + totalLabor;
    }
    
    

   
}
