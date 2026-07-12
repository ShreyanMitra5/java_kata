public class Kata {
  public static String firstNonRepeatingLetter(String s) {
    int[] cps = s.codePoints().toArray();

    for (int i = 0; i < cps.length; i++) {
        int cp = Character.toLowerCase(cps[i]);

        int count = 0;
        for (int j = 0; j < cps.length; j++) {
            if (Character.toLowerCase(cps[j]) == cp) {
                count++;
            }
        }

        if (count == 1) {
            return new String(Character.toChars(cps[i]));
        }
    }

    return "";
}
}