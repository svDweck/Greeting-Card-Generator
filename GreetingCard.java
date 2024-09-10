import java.util.*;

public class GreetingCard {
    int t;          // Indicates the type of card
    String p;       // Card recipient's name

    public GreetingCard(int t, String p){
        this.t = t;
        this.p = p;
    }

    public int getT(){
        return t;
    }

    public String getP(){
        return p;
    }

    // Creates a card in the form of a String
    public String generateCard(int t, String p){

        String str = "";    // The String that will be returned as the card

        // Checks to see if t is within the card options
        if(t<1 || t>3){
            str = "Please choose valid card option.";
        }

        switch (t) {
            case 1:         // Loss card
                str = "Sorry for your loss " + p;
                break;

            case 2:         // Birthday card
                str = "Happy Birthday " + p;
                break;

            case 3:         // Marriage card
                str = "Congratulations on your marriage " + p;
                break;

            default:
                break;

        }

        return str;
    }
}