package e260420;

import e260420.dll.Card;

public class CardExample {
    public static void main(String[] args) throws Exception {
        Card c1 = new Card("HEART", 3);
        try {
            Class obj = c1.getClass();
            System.out.println(obj);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
