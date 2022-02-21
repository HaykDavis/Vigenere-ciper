public class Scrambler {
    public Scrambler(){}

    public Scrambler(String input_word, String key) {
        int i = 0;
        int l;

        System.out.print("Encrypted message: ");
        for (int z = 0; z < input_word.length(); z++) {
            if (i == key.length())
                i = 0;
            l = srch_indx(input_word.charAt(z)) + srch_indx(key.charAt(i));
            if (l >= 54)
                l = l % 54;
            System.out.print(srch_letter(l));
            i++;
        }
        System.out.println();
    }

    char srch_letter(int letter_index) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ. ";

        return (alphabet.charAt(letter_index));
    }

    int srch_indx(char letter)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ. ";

        for (int i = 0; i < 54; i++) {
            if (alphabet.charAt(i) == letter)
                return (i);
        }
        return (0);
    }
}