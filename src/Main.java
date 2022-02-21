import java.lang.String;
import java.util.Scanner;

public class Main {
    public static String 			key;
    public static String 			input_word;
    public static int               sw;

    public static void main(String[] args) {
        for (;;) {
            Scanner word = new Scanner(System.in);
            System.out.println("Enter the message: ");
            input_word = word.nextLine();
            System.out.println("Enter the key: ");
            key = word.nextLine();
            System.out.println("Would You like to decode or code the message?");
            System.out.println("For decoding massage enter 0\nFor coding message enter 1");
            sw = word.nextInt();
            switch (sw){
                case 0:
                    Decoder decode = new Decoder(input_word, key);
                    break;
                case 1:
                    Scrambler scrambler = new Scrambler(input_word, key);
                    break;
                default:
                    break ;
            }
        }
    }

}
