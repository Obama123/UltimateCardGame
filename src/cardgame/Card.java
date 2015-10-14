/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author 066956210
 */
public class Card {

    int cardSuite;
    int cardRank;
    //public static void main(String[] args) {

    public Card(int suit, int rank) {
       
        cardSuite = suit+1;
        cardRank = rank+1;
    }

    public void print() {
//////////////////        //Hearts 
        if ((cardSuite == 1) && (cardRank == 1))
        System.out.println("Ace of Hearts");
        if ((cardSuite == 1) && (cardRank == 2))
        System.out.println("Two of Hearts");
        if ((cardSuite == 1) && (cardRank == 3))
        System.out.println("Three of Hearts");
        if ((cardSuite == 1) && (cardRank == 4))
        System.out.println("Four of Hearts");
        if ((cardSuite == 1) && (cardRank == 5))
        System.out.println("Five of Hearts");
        if ((cardSuite == 1) && (cardRank == 6))
        System.out.println("Six of Hearts");
        if ((cardSuite == 1) && (cardRank == 7))
        System.out.println("Seven of Hearts");
        if ((cardSuite == 1) && (cardRank == 8))
        System.out.println("Eight of Hearts");
        if ((cardSuite == 1) && (cardRank == 9))
        System.out.println("Nine of Hearts");
        if ((cardSuite == 1) && (cardRank == 10))
        System.out.println("Ten of Hearts");
        if ((cardSuite == 1) && (cardRank == 11))
        System.out.println("Jack of Hearts");
        if ((cardSuite == 1) && (cardRank == 12))
        System.out.println("Queen of Hearts");
        if ((cardSuite == 1) && (cardRank == 13))
        System.out.println("King of Hearts");
//////////////////        //Diamonds
        if ((cardSuite == 2) && (cardRank == 1))
        System.out.println("Ace of Diamonds");
        if ((cardSuite == 2) && (cardRank == 2))
        System.out.println("Two of Diamonds");
        if ((cardSuite == 2) && (cardRank == 3))
        System.out.println("Three of Diamonds");
        if ((cardSuite == 2) && (cardRank == 4))
        System.out.println("Four of Diamonds");
        if ((cardSuite == 2) && (cardRank == 5))
        System.out.println("Five of Diamonds");
        if ((cardSuite == 2) && (cardRank == 6))
        System.out.println("Six of Diamonds");
        if ((cardSuite == 2) && (cardRank == 7))
        System.out.println("Seven of Diamonds");
        if ((cardSuite == 2) && (cardRank == 8))
        System.out.println("Eight of Diamonds");
        if ((cardSuite == 2) && (cardRank == 9))
        System.out.println("Nine of Diamonds");
        if ((cardSuite == 2) && (cardRank == 10))
        System.out.println("Ten of Diamonds");
        if ((cardSuite == 2) && (cardRank == 11))
        System.out.println("Jack of Diamonds");
        if ((cardSuite == 2) && (cardRank == 12))
        System.out.println("Queen of Diamonds");
        if ((cardSuite == 2) && (cardRank == 13))
        System.out.println("King of Diamonds");
//////////////////        //Clubs
        if ((cardSuite == 3) && (cardRank == 1))
        System.out.println("Ace of Clubs");
        if ((cardSuite == 3) && (cardRank == 2))
        System.out.println("Two of Clubs");
        if ((cardSuite == 3) && (cardRank == 3))
        System.out.println("Three of Clubs");
        if ((cardSuite == 3) && (cardRank == 4))
        System.out.println("Four of Clubs");
        if ((cardSuite == 3) && (cardRank == 5))
        System.out.println("Five of Clubs");
        if ((cardSuite == 3) && (cardRank == 6))
        System.out.println("Six of Clubs");
        if ((cardSuite == 3) && (cardRank == 7))
        System.out.println("Seven of Clubs");
        if ((cardSuite == 3) && (cardRank == 8))
        System.out.println("Eight of Clubs");
        if ((cardSuite == 3) && (cardRank == 9))
        System.out.println("Nine of Clubs");
        if ((cardSuite == 3) && (cardRank == 10))
        System.out.println("Ten of Clubs");
        if ((cardSuite == 3) && (cardRank == 11))
        System.out.println("Jack of Clubs");
        if ((cardSuite == 3) && (cardRank == 12))
        System.out.println("Queen of Clubs");
        if ((cardSuite == 3) && (cardRank == 13))
        System.out.println("King of Clubs");
//////////////////        //Spades
        if ((cardSuite == 4) && (cardRank == 1))
        System.out.println("Ace of Spades");
        if ((cardSuite == 4) && (cardRank == 2))
        System.out.println("Two of Spades ");
        if ((cardSuite == 4) && (cardRank == 3))
        System.out.println("Three of Spades");
        if ((cardSuite == 4) && (cardRank == 4))
        System.out.println("Four of Spades");
        if ((cardSuite == 4) && (cardRank == 5))
        System.out.println("Five of Spades");
        if ((cardSuite == 4) && (cardRank == 6))
        System.out.println("Six of Spades");
        if ((cardSuite == 4) && (cardRank == 7))
        System.out.println("Seven of Spades");
        if ((cardSuite == 4) && (cardRank == 8))
        System.out.println("Eight of Spades");
        if ((cardSuite == 4) && (cardRank == 9))
        System.out.println("Nine of Spades");
        if ((cardSuite == 4) && (cardRank == 10))
        System.out.println("Ten of Spades");
        if ((cardSuite == 4) && (cardRank == 11))
        System.out.println("Jack of Spades");
        if ((cardSuite == 4) && (cardRank == 12))
        System.out.println("Queen of Spades");
        if ((cardSuite == 4) && (cardRank == 13))
        System.out.println("King of Spades");
    }

}
