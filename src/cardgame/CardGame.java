package cardgame;

import java.util.Scanner;

/**
 * @param args the command line arguments
 */

            

            

public class CardGame { 
    
//extends JPanel {
Deck [] deck = new Deck [1];
    public static void main(String[] args) {
        //  Deck d1 = new Deck();
        Scanner keyboard = new Scanner(System.in);
        int pointVal1=0;
        int pointVal2=0;
        int pointVal3=0;
        int pointVal4=0;
        int pointVal5=0;
        String P1DraworStand = null;
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
        if (playerCount > 5){
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
           Deck d = new Deck();
            d.fill();
    d.shuffle();
           Card[] P1cards = new Card[5];
           Card[] P2cards = new Card[5];
         //  P1cards[0] = d.draw();
         //  P1cards[1] = d.draw();
           
                do{
            System.out.println("P1 draw or stand");
             P1DraworStand = keyboard.nextLine();
            if (P1DraworStand.equals("s") || P1DraworStand.equals ("S")) {
                System.out.println("stand");
                System.out.println(pointVal1);
              
            }
            if (P1DraworStand.equals("d") || P1DraworStand.equals ("D")){
                System.out.println("Draw");
            //   P1cards [2] = d.draw();
                if (pointVal1 > 21);
                System.out.println("Player 1 broke");
            
            }
            
           // if (!P1DraworStand.equals("d") || !P1DraworStand.equals ("D")&&(!P1DraworStand.equals("s") || !P1DraworStand.equals ("S"))){
             // System.out.println("Invalid input. Enter again: ");
               // P1DraworStand = keyboard.nextLine();
           //} 
                }while(!P1DraworStand.equals ("s") );
   do{
    
    
          System.out.println("P1's Cards:" );
            
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
        
        }while (pointVal1 != 21);
        //win
    }

public static void cardSort(){
Card[] P1cards = new Card[2];
System.out.println (P1cards);
}
}


