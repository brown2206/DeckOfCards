import java.util.*;


public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Ace of Hearts",
                "2 of Hearts",
                "3 of Hearts",
                "4 of Hearts",
                "5 of Hearts",
                "6 of Hearts",
                "7 of Hearts",
                "8 of Hearts",
                "9 of Hearts",
                "10 of Hearts",
                "Jack of Hearts",
                "Queen of Hearts",
                "King of Hearts",
                "Ace of Diamonds",
                "2 of Diamonds",
                "3 of Diamonds",
                "4 of Diamonds",
                "5 of Diamonds",
                "6 of Diamonds",
                "7 of Diamonds",
                "8 of Diamonds",
                "9 of Diamonds",
                "10 of Diamonds",
                "Jack of Diamonds",
                "Queen of Diamonds",
                "King of Diamonds",
                "Ace of Clubs",
                "2 of Clubs",
                "3 of Clubs",
                "4 of Clubs",
                "5 of Clubs",
                "6 of Clubs",
                "7 of Clubs",
                "8 of Clubs",
                "9 of Clubs",
                "10 of Clubs",
                "Jack of Clubs",
                "Queen of Clubs",
                "King of Clubs",
                "Ace of Spades",
                "2 of Spades",
                "3 of Spades",
                "4 of Spades",
                "5 of Spades",
                "6 of Spades",
                "7 of Spades",
                "8 of Spades",
                "9 of Spades",
                "10 of Spades",
                "Jack of Spades",
                "Queen of Spades",
                "King of Spades"
        };

        String[] ranks = new String[52];

        for (int i = 0; i < ranks.length; i++)
        {
            if (i == 0 || i == 13 || i == 26 || i == 39) {
                ranks[i] = "Ace";
            } else if (i == 1 || i == 14 || i == 27 || i == 40) {
                ranks[i] = "2";
            } else if (i == 2 || i == 15 || i == 28 || i == 41) {
                ranks[i] = "3";
            } else if (i == 3 || i == 16 || i == 29 || i == 42) {
                ranks[i] = "4";
            } else if (i == 4 || i == 17 || i == 30 || i == 43) {
                ranks[i] = "5";
            } else if (i == 5 || i == 18 || i == 31 || i == 44) {
                ranks[i] = "6";
            } else if (i == 6 || i == 19 || i == 32 || i == 45) {
                ranks[i] = "7";
            } else if (i == 7 || i == 20 || i == 33 || i == 46) {
                ranks[i] = "8";
            } else if (i == 8 || i == 21 || i == 34 || i == 47) {
                ranks[i] = "9";
            } else if (i == 9 || i == 22 || i == 35 || i == 48) {
                ranks[i] = "10";
            } else if (i == 10 || i == 23 || i == 36 || i == 49) {
                ranks[i] = "Jack";
            } else if (i == 11 || i == 24 || i == 37 || i == 50) {
                ranks[i] = "Queen";
            } else {
                ranks[i] = "King";
            }
            //System.out.println(ranks[i]);
        }
        // System.out.println(Arrays.toString(suits));
        // System.out.println(Arrays.toString(ranks));

        // Create a HashMap object called deck
        HashMap<String, String> deck = new HashMap<String, String>();
        for (int i=0; i < ranks.length; i++) {
            deck.put(suits[i], ranks[i]);
        }

        // Print HashMap as list
        // System.out.println(Arrays.asList(deck));
        shuffle(deck);

        Scanner scan = new Scanner(System.in);

        String answer;

        do {
            deal(deck);
            System.out.println("Would you like another card? Yes or No");
            answer = scan.nextLine();
        }
        while (answer.equals("Yes"));

    }

    public static void shuffle(HashMap deck) {
         Set<Map.Entry<String, String>> rearrange = deck.entrySet();

         System.out.println(rearrange);

         for (Map.Entry<String, String> next : rearrange) {
            System.out.println(next.getKey() + " ==> " + next.getValue());
        }


        //Object randomName = deck.keySet().toArray() [new Random().nextInt(deck.keySet().toArray().length)];
        //System.out.println(randomName.toString() + " -> " + deck.get(randomName));
    }

    public static void deal(HashMap deck) {
        Object randomName = deck.keySet().toArray() [new Random().nextInt(deck.keySet().toArray().length)];
        System.out.println("\nYou've been dealt a: " + randomName.toString() + " -> " + deck.get(randomName));
    }

}
