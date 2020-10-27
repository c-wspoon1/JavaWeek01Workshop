package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
  public static void main(String[] args) {
        

    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name? ");
    String input = scanner.next();
   // System.out.println("Your name is " + input);
   // TODO If the user's name is not "Hakim" or "Rasheeda" say "I dont know you cuz, what hood you stay, where yo grandma, where yo familiy say??"
    
    if (input.equalsIgnoreCase("Hakim") || input.equalsIgnoreCase("rasheeda")){
    System.out.printf("Hello, %s!\n", input);
   } else {
       System.out.print("I'm gon' ask you one more time, homie. Where is you from? Or it is a problem.");
   }
   
        
  }  
}













         // Console console = System.console();
        // String string = "What's your name? ";
        // String input = console.readLine(string);
        // console.printf("Hello %s!%n ", input);

  //  }  