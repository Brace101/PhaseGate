public class CharacterCount {

    public static String countCharacters(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int index = 0; index < input.length(); index++) {

            if (index < input.length() - 1 && input.charAt(index) == input.charAt(index + 1)) {
                count++;
            } else {
                result.append(input.charAt(index)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }
}
