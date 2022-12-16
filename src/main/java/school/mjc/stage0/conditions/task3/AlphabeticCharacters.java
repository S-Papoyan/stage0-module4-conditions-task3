package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if (!Character.isAlphabetic(character) || character == 'ł') {
            System.out.println("wrong alphabet!");
        } else if (Character.isAlphabetic(character) && (character == 'A' || character == 'a' ||
                character == 'E' || character == 'e' ||
                character == 'I' || character == 'i' ||
                character == 'O' || character == 'o' ||
                character == 'U' || character == 'u')) {
            System.out.println("Vowel");
        } else if (Character.isAlphabetic(character)) {
            System.out.println("Consonant");
        }
    }
}
