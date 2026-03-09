package org.example;


public class uc7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character
         * @param pattern 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     * @param patterns array of CharacterPatternMap objects
     * @param ch character to search
     * @return pattern of the character
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patternMap = {

                new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),

                new CharacterPatternMap('P', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        "*      ",
                        "*      ",
                        "*      "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                })
        };

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = getCharacterPattern(patternMap, ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}