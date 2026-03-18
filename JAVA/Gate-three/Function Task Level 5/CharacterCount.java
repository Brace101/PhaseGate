public class CharacterCount {

    public static String countCharacters(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {

            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(input.charAt(i)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }
}
