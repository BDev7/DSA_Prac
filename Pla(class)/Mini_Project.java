/**
 * Aug31
 */

import java.util.Scanner;

public class Mini_Project {
 
  public static void main(String[] args){
    
   //MINI PROJECT
   //To guess a number from user 
    
   Scanner sc = new Scanner(System.in);
   int myNumber = (int) (Math.random()*100);
   int userNumber = 0;

   do {
    System.out.println("Guess my number : ");
    userNumber = sc.nextInt();

    if(userNumber == myNumber) {
      System.out.println("WOHOO... CORRECT NUMBER");
      break;
    }
    else if(userNumber > myNumber ) {
      System.out.println("Your  umber is too large");
    }
    else {
      System.out.println("your number is too small");
    }
   }while(userNumber >= 0);

   System.out.println("My number was : ");
   System.out.println(myNumber);

   }
  }
