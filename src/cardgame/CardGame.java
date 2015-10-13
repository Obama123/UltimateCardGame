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
        if (playerCount > 5) { 
        System.out.println("too many players");
    }
}
}

