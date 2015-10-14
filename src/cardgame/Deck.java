package cardgame;

import java.util.Random;

public class Deck {
    Card[] deck = new Card[52];

    public void fill() {

//Suit fill sort
int count = 0;   
for (int suit = 0; suit < 4; suit ++){
//Rank fill sort
for (int rank = 0; rank < 13; rank++){
    deck[count] = new Card(suit,rank);
    count++;
    
}    
}

    
    }

    public void shuffle() {
        int RandomizeSlot = 53;
        while (RandomizeSlot > 1) {
            
            Random rand = new Random();
            
            int x = rand.nextInt(52);
            int y = rand.nextInt(52);
            Card shuffled = deck[x];
            deck[x] = deck [y];
            deck [y] = shuffled;
         
        RandomizeSlot = RandomizeSlot - 1;
                  
        }

    }
        public void printDeck(){
        for (int i=0;i<52;i++){
            deck[i].print();
        }
    }

public static void main(String[] args){
    Deck d = new Deck();
    d.fill();
    d.shuffle();
    d.printDeck();
    
}
        
}
