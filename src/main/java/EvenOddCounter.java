/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Caleb
 */
public class EvenOddCounter {
     public static void main(String[] args) {
        Random random = new Random();
        int evenCounter = 0;
        int oddCounter = 0;

        for(int i = 1; i <= 100; i++){
            int ranNum = random.nextInt();

            if(isEven(ranNum)){
                evenCounter++;
            }else{
                oddCounter++;
            }
        }
        System.out.println("Even numbers generated: " + evenCounter);
        System.out.println("Odd numbers generated: " + oddCounter);

    }

    public static boolean isEven(int testNum){

        if(testNum % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
