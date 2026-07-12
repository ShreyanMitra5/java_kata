public class Kata {
    public static String expandedForm(int num) {
      int count = 0;
      
      String answer = "";
      
        while (num != 0){
          double v = (num % 10) * Math.pow(10, count);
          
          if (answer.equals("")){
            answer = Double.toString(v);
          }
          else{
            answer = v + " + " + answer;
          }
          num /= 10;
          count++;
          
        }
      
        return answer;
    }

    public static void main(String[] args) {
      System.out.println(expandedForm(411));
    }
}