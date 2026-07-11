public class Kata {
    public static int findEvenIndex(int[] arr) {
      int leftSum = 0;
      int rightSum = 0;
      int index = 0;
      for (int i = 0; i < arr.length; i++){
        for (int j = i + 1; j < arr.length; j++){
          rightSum += arr[j];
          
        }
        
        for (int k = 0; k < i; k++){
            leftSum += arr[k];
        }
        
        System.out.println("Right Sum : " + rightSum + "\n Left Sum : " + leftSum + "\n Index : " + i);
        System.out.println();
        if (rightSum == leftSum){
          index = i;
          break; 
          }
        else{
          rightSum  =0;
          leftSum = 0;
        }
        
        }
      return index;
      }

      public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(findEvenIndex(arr));
      }
      
      
    }
  