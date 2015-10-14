package cardgame;

import java.util.Scanner;

/**
 * @param args the command line arguments
 */
public class CardGame { //extends JPanel {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pointVal1=0;
        int pointVal2=0;
        int pointVal3=0;
        int pointVal4=0;
        int pointVal5=0;
        System.out.println("welcome to blackjack");
        System.out.println("how many people want to play (5 max)");
        int playerCount = keyboard.nextInt();
        int run = 0;
        while (run == 0){
        if (playerCount <= 5 && playerCount >=1)
        { 
        System.out.println(playerCount+ " Players will be entered in this game");
        break;
                }
        if (playerCount >5){
            System.out.println("too many players");
            System.out.println ("Enter again: ");
            playerCount = keyboard.nextInt();
            if (playerCount <1){
            System.out.println("too few players");
            System.out.println ("Enter again: ");
            playerCount = keyboard.nextInt();    
            }
            }
        
        
        }
        do{
            System.out.println("P1's Cards:");
            
          if (pointVal1==21)  
              System.out.println("P1 got Blackjack");
          if (pointVal2==21)  
              System.out.println("P2 got Blackjack");
          if (pointVal3==21)  
              System.out.println("P3 got Blackjack");
          if (pointVal4==21)  
              System.out.println("P4 got Blackjack");
          if (pointVal5==21)  
              System.out.println("P5 got Blackjack");
        }while (pointVal1==21);
        //win
    }
}



