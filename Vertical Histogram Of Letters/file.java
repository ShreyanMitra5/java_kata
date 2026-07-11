
import java.util.ArrayList; 

class Main {
    
    
  public static void verticalHistogramOf(String s){
      
      ArrayList<String> Letter = new ArrayList<>();
      ArrayList<Integer> LetterCount = new ArrayList<>();
      
      //coding and coding..
      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
      for (int i = 0; i < alphabet.length(); i++){
        int counter = 0;
        for (int j = 0; j < s.length(); j++){
          if (alphabet.substring(i, i + 1).equals(s.substring(j, j + 1))){
              if (!Letter.contains(alphabet.substring(i, i + 1))){
                  Letter.add(alphabet.substring(i, i + 1));
              }
            counter++;
          }
        }
        if (counter != 0)
        LetterCount.add(counter);
        
        // for (String letter : Letter){
        //     System.out.println(letter);
        // }
        
        // for (Integer lc : LetterCount){
        //     System.out.println(lc);
        // }
        
        
        // System.out.println("Letter " + alphabet.substring(i, i + 1) + " : " + counter);
        
        //Letter --> {A, B, C, X, Y, Z}
        //LetterCount --> {3, 2, 1, 2, 3, 6}
        
      }
      
        int max = LetterCount.get(0);
        for (int k = 1; k < LetterCount.size(); k++){
            if (LetterCount.get(k) > max){
                max = LetterCount.get(k);
            }
        }
        
        for (int l = max; l >= 1; l--){
            for (int i = 0; i < LetterCount.size(); i++){
                if (LetterCount.get(i) >= l){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        for (int i = 0; i < Letter.size(); i++){
            System.out.print(Letter.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        verticalHistogramOf("XXY YY ZZZ123ZZZ AAA BB C");
    }
}