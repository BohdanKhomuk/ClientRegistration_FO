import java.io.*;
import java.security.SecureRandom;
import java.util.*;

public class RandomWords {

    static final String AB = "АБВГҐДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЬЮЯ";
    static final String ab = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюя";
    static SecureRandom rnd = new SecureRandom();


    public String Name() throws FileNotFoundException {
        Scanner sc = new Scanner (new File(RandomWords.class.getResource( "/Name.txt").getFile()), "cp1251");
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            sb.append(sc.nextLine());
        }
        sc.close();

        String str1 = sb.toString().replaceAll( "\"", "");
        String[] str = str1.toString().split(", ");

        int n = (int) Math.floor( Math.random() * str.length );

        return str[n];
        //System.out.println(str[n]);
    }

    public String Sourname() throws FileNotFoundException {
        Scanner sc = new Scanner (new File(RandomWords.class.getResource( "/Sourname.txt").getFile()), "cp1251");
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            sb.append(sc.nextLine());
        }
        sc.close();

        String str1 = sb.toString().replaceAll( "\"", "");
        String[] str = str1.toString().split(", ");

        int n = (int) Math.floor( Math.random() * str.length );

        return str[n];
        //System.out.println(str[n]);
    }

    public String Patronymic() throws FileNotFoundException {
        Scanner sc = new Scanner (new File(RandomWords.class.getResource( "/Patronymic.txt").getFile()), "cp1251");
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            sb.append(sc.nextLine());
        }
        sc.close();

        String str1 = sb.toString().replaceAll( "\"", "");
        String[] str = str1.toString().split(", ");

        int n = (int) Math.floor( Math.random() * str.length );

        return str[n];
        //System.out.println(str[n]);
    }

//    public static String[] generateRandomWords(int numberOfWords)
//    {
//        String[] randomStrings = new String[numberOfWords];
//        Random random = new Random(  );
//        for(int i = 0; i < numberOfWords; i++)
//        {
//            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
//            for(int j = 0; j < word.length; j++)
//            {
//                word[j] = (char)('a' + random.nextInt(26));
//            }
//            randomStrings[i] = new String(word);
//        }
//        return randomStrings;
//    }

    public static String[] randomNumber(int min, int max) {

        int random_number = min + (int) (Math.random() * max);
        String b = String.valueOf(random_number);

        return new String[]{b};
    }

    String randomStringBig( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    String randomStringLittle( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( ab.charAt( rnd.nextInt(ab.length()) ) );
        return sb.toString();
    }


}
