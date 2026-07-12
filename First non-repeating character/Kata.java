import java.util.HashMap;

public class Kata {
  public static String firstNonRepeatingLetter(String s) {
    HashMap<String, Integer> letterCount = new HashMap<>();

    for (int i = 0; i < s.length(); i++){
      String c = s.substring(i, i + 1);
      if (c.matches("[a-zA-Z]")){
          c = c.toLowerCase();
      }
      if (letterCount.containsKey(c)){
        letterCount.put(c, letterCount.get(c) + 1);
      }
      else{
        letterCount.put(c, 1);
      }
    }

    for (int i = 0; i < s.length(); i++){
      if (letterCount.get(s.substring(i, i + 1)) == 1){
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