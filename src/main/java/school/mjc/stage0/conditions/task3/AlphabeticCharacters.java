package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char lowercaseChar = Character.toLowerCase(character);

        if (lowercaseChar >= 'a' && lowercaseChar <= 'z') {
            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' ||
                    lowercaseChar == 'o' || lowercaseChar == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
