/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Caleb
 */
public class isPrimeMethod {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to see if it is a prime number");
        int inputNumber = Integer.parseInt(keyboard.nextLine());

        if(isPrime(inputNumber)){
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }

    }
    public static boolean isPrime(int testNumber){
        if(testNumber <=1){
            return false;
        }
        for(int i = 2; i < testNumber; i++){
            if(testNumber % i == 0){
                return false;
            }
        }
        return true;

    }


    
}
