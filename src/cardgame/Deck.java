package cardgame;

import java.util.Random;

public class Deck {
    Cards[] deck = new Cards[52];

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
    public void printDeck(){
        for (int i=0;i<52;i++){
            deck[i].print();
        }
    }

    public void shuffle() {
        int RandomizeSlot = 53;
        while (RandomizeSlot > 1) {
            Random rand = new Random();
            int x =rand.nextInt(53);
            
           deck[x] = new Card()
        RandomizeSlot = RandomizeSlot - 1;
                  
        }

        System.out.println("Shuffling......");
        
//        Deck[0] = ("");
//        Deck[1] = ("");
//        Deck[2] = ("");
//        Deck[3] = ("");
//        Deck[4] = ("");
//        Deck[5] = ("");
//        Deck[6] = ("");
//        Deck[7] = ("");
//        Deck[8] = ("");
//        Deck[9] = ("");
//        Deck[10] = ("");
//        Deck[12] = ("");
//        Deck[13] = ("");
//        Deck[14] = ("");
//        Deck[15] = ("");
//        Deck[16] = ("");
//        Deck[17] = ("");
//        Deck[18] = ("");
//        Deck[19] = ("");
//        Deck[20] = ("");
//        Deck[21] = ("");
//        Deck[22] = ("");
//        Deck[23] = ("");
//        Deck[24] = ("");
//        Deck[25] = ("");
//        Deck[26] = ("");
//        Deck[27] = ("");
//        Deck[28] = ("");
//        Deck[29] = ("");
//        Deck[30] = ("");
//        Deck[31] = ("");
//        Deck[32] = ("");
//        Deck[33] = ("");
//        Deck[34] = ("");
//        Deck[35] = ("");
//        Deck[36] = ("");
//        Deck[37] = ("");
//        Deck[38] = ("");
//        Deck[39] = ("");
//        Deck[40] = ("");
//        Deck[41] = ("");
//        Deck[42] = ("");
//        Deck[43] = ("");
//        Deck[44] = ("");
//        Deck[45] = ("");
//        Deck[46] = ("");
//        Deck[48] = ("");
//        Deck[49] = ("");
//        Deck[50] = ("");
//        Deck[51] = ("");
//        Deck[52] = ("");
    }
public static void main(String[] args){
    Deck d = new Deck();
    d.fill();
    d.printDeck();
    
}
        
}
