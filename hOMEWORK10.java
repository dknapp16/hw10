import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hOMEWORK10 {
    public static void main(String[] argos) {

        HashMap<String, List> cardDeck = new HashMap<>();
        ArrayList<Integer> cardValues = new ArrayList();
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        for (String suit : suits) {
            cardDeck.put(suit, cardValues);
        }
        for (Integer i = 1; i < 14; i++) {
            cardValues.add(i);
        }
        for (Map.Entry<String, List> suit : cardDeck.entrySet()) {
            for (Object card : suit.getValue()) {
                System.out.print(suit.getKey() + " - " + card);
            }
        }
    }
}

