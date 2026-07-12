import java.util.HashMap;

public class Kata {
  public static String firstNonRepeatingLetter(String s) {
    HashMap<Character, Integer> letterCount = new HashMap<>();

  for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (Character.isLetter(c)) {
          c = Character.toLowerCase(c);
      }

      if (letterCount.containsKey(c)) {
          letterCount.put(c, letterCount.get(c) + 1);
      } else {
          letterCount.put(c, 1);
      }
  }

  for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (Character.isLetter(c)) {
          c = Character.toLowerCase(c);
      }

      if (letterCount.get(c) == 1) {
          return s.substring(i, i + 1);
      }
  }
  return "";
  }

  public static void main(String[] args) {
      System.out.println(firstNonRepeatingLetter("streSS"));
      System.out.println(firstNonRepeatingLetter("s"));
      System.out.println(firstNonRepeatingLetter("moon-men"));
  }
}