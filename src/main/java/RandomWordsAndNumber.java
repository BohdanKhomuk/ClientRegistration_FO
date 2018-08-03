import java.security.SecureRandom;


public class RandomWordsAndNumber {

    static final String AB = "АБВГҐДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЬЮЯ";
    static final String ab = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюя";
    static SecureRandom rnd = new SecureRandom();

    public static String[] randomNumber(int min, int max) {
        int random_number = min + (int) (Math.random() * max);
        String b = String.valueOf(random_number);
        return new String[]{b};
    }

    String randomStringBig(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    String randomStringLittle(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(ab.charAt(rnd.nextInt(ab.length())));
        return sb.toString();
    }
}
