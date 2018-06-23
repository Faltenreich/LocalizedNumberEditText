package com.faltenreich.localizednumberedittext;

public class LocalizedNumberEditTextUtils {

    public static int countOccurrences(String target, Character... characters) {
        int count = 0;
        for (Character targetCharacter : target.toCharArray()) {
            for (Character character : characters) {
                if (character.equals(targetCharacter)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int firstIndexOfOrLastIndex(String text, Character character) {
        int index = text.indexOf(character);
        return index >= 0 ? index : text.length() - 1;
    }
}
