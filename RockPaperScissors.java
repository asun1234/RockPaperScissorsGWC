//*******************************************************************
// Dear CompileJava users,
//
// CompileJava has been operating since 2013 completely free. If you
// find this site useful, or would otherwise like to contribute, then
// please consider a donation (link in 'More Info' tab) to support
// development of the new CompileJava website (stay tuned!).
//
// Most sincerely, Z.
//*******************************************************************

import java.util.Scanner;
import java.util.Random;
 

// one class needs to have a main() method
public class RockPaperScissors
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    String playerPlay = "";
    String computerPlay = "";
    
    Random rand = new Random();
    int computerInt = rand.nextInt(3) + 1;//this provides you with the numbers 1, 2, and 3
    
      if(computerInt == 1){
        computerPlay = "Rock";
      }else if (computerInt == 2){
		computerPlay = "Paper";
      }else if(computerInt == 3){
        computerPlay = "Scissors";
      }
  
 	Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Rock Paper Scissors!");
    System.out.println("Please enter your move:");
                       
    
    playerPlay = scan.next();
    
      if(playerPlay == computerPlay){
		System.out.print("It's a tie!");
                         
      }else if (playerPlay == "Rock"){
        if(computerPlay == "Paper"){
          System.out.print("Paper beats Rock, Computer wins!");
        }else{
          System.out.print("Rock beats Scissors, You(Player) wins!");
        }
        
      }else if(playerPlay == "Paper"){
        if(computerPlay == "Rock"){
          System.out.print("Paper beats Rocks, You(Player) wins!");
        }else{
          System.out.print("Scissors beats Paper, Computer wins!");
        }
        
      }else if(playerPlay == "Scissors"){
        if(computerPlay == "Rock"){
        	System.out.print("Rock beats Scissors, Computer wins!");
        }else{
        	System.out.print("Scissors beats Paper, You(Player) wins!");
        }
      }else{
      
        System.out.print("Invalid input, please try again");
        scan.next();
      } 
                         
                         
    
	}
}

// you can add other public classes to this editor in any order

