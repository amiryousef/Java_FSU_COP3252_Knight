/*
Yousef, Amir
COP-3252
Assignment2
Class Knight
1/30/2014
*/

import java.util.Scanner; 	// import class Scanner

public class Knight	
{
  // main method begins the execution 
  public static void main(String[] args)
  {
  String name;
  int age;
  int health;
  int battles;
  int gold;
  int average;
  
  // create Scanner object to obtain input from the user
  Scanner input = new Scanner(System.in);

  // prompt the user to enter the Knight's name and read it
  System.out.print("\nEnter Knight Name: "); 
  name = input.nextLine(); 
  
  // prompt the user to enter the Knight's Age and read it
  System.out.print("\nEnter Knight Age: "); 
  age = input.nextInt(); 
  
  // prompt the user to enter the Knight's health and read it
  System.out.print("\nEnter Knight Health (1 to 10): "); 
  health = input.nextInt(); 
  
  // prompt the user to enter the Knight's Number of Battles and read it
  System.out.print("\nEnter Knight Number of Battles: "); 
  battles = input.nextInt(); 
  
  // prompt the user to enter the Knight's Amount of Gold Procured from Pillaging and read it
  System.out.print("\nEnter Knight Amount of Gold Procured: "); 
  gold = input.nextInt(); 
  
  // calculate the average gold accumulated per battle
  average = gold / battles;
  
  // output Knight's information on the screen
  System.out.printf("\n\n%s%s\n\n%s%d\n\n%s%d\n\n%s%d\n\n%s%d\n\n%s%d\n", "The Knight's Name is ", name, "The Knight's Age is ", age,
  "The Knight's Health Scale is ", health, "The Knight's Number of Battles is ", battles,  "The Knight's Amount of Gold Procured is ", gold, 
  "The Knight's Average Gold Accumulated per Battle is ", average);  
  
  } // end main method 
} // end class Knight
  

  
  
  
