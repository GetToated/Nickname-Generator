public class Generator {
    public static String nickname(String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        String fourLetters = name.substring(0, 4);
        char thirdletter = fourLetters.charAt(2);
        if (vocal(thirdletter)) {
            return fourLetters;
        } else {

            return fourLetters.substring(0, 3);
        }
    }
    private static boolean vocal(char letter) {
        return "aeiou".indexOf(letter) != -1;
    }
    public static void main(String[] args) {
        System.out.println(nickname("Lucas"));
        System.out.println(nickname("Pau"));
        System.out.println(nickname("Jose"));
        System.out.println(nickname("Asyra"));
        System.out.println(nickname("Juanjo"));
        System.out.println(nickname("Ramon"));
    }
}