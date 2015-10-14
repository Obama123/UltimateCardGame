package cardgame;

import java.util.Scanner;

/**
 * @param args the command line arguments
 */
public class CardGame { //extends JPanel {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("welcome to blackjack");
        System.out.println("how many people want to play (5 max)");
        int playerCount = keyboard.nextInt();
        int run = 0;
        while (run == 0){
        if (playerCount <= 5 && playerCount >=1) { 
        System.out.println(playerCount+ " Players will be entered in this game");
        break;
                }
        else{
            System.out.println("too many players");
            
            
            }
        
        
        }
    }
}



