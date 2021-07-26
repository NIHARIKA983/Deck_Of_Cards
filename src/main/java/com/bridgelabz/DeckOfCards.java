package com.bridgelabz;


public class DeckOfCards {
    public static void main(String[] args) {
        deckOfCard();
    }

    public static void deckOfCard() {
        String[] suits = {"Clubs", "Diamonds", "hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
       // String array[][] = new String[4][13];

        // Initializing the deck
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " " + suits[j];
            }
        }
        for(int i=0;i<deck.length;i++)
        {
            System.out.println(deck[i]);
        }

    }
}
