import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame{
    public static void main(String[] args){
       Random  randomNumber=new Random();
       int attempts=0;
       int guess=0;
       Scanner sc =new Scanner(System.in);
       int min=0;
       int max=100;
       int number=randomNumber.nextInt(min,max+1);
       System.out.println("Number Guessing Game:");
       do{
        System.out.println("Enter number between 1 and 100:");
        guess=sc.nextInt();
        attempts++;
          if(guess<number){
            System.out.println("Your guess is low! Try Again.");
          }else if(guess>number){
            System.out.println("your guess is high! Try Again.");
          }else{
            System.out.println("Perfect Match");
            System.out.print("Total number of attempts are:" +attempts);
          }
        }while(guess!=number);
        sc.close();

    }
}
