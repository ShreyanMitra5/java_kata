public class Kata {
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static String getMiddle(String word) {
        int length = word.length();
        int middle = length / 2;
        return length % 2 == 0 ? word.substring(middle - 1, middle + 1) : word.substring(middle, middle + 1);
    }

    public static int opposite(int number) {
        return -number;
    }

    public static String repeatStr(int repeat, String string) {
        return string.repeat(Math.max(0, repeat));
    }

    public static String booleanToString(boolean value) {
        return String.valueOf(value);
    }
}
