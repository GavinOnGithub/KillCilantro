public class KillCilantro {

   public static String killCilantro(String word) {
      int wordLength = 0;
      String fullWord = "";
      String currentLetter = "";
      int currentNum = 0;
      String testCilantro = "";
      
      wordLength = word.length();
      
      while(currentNum < wordLength) {
         currentLetter = "";
         currentLetter = word.substring(currentNum, currentNum + 1);
         if (currentLetter.equals("c")) {
            if (currentNum + 7 > wordLength) {
               fullWord += currentLetter;
               
            } else {
               testCilantro = word.substring(currentNum, currentNum + 7);
               if (testCilantro.equals("cilantro")) {
                  currentNum += 7;
                  fullWord += "parsley";
                  
               } else {
                  fullWord += word.substring(currentNum, currentNum + 1);
               }
            } 
         } else {
            fullWord += currentLetter;
         }
         currentNum += 1;
      }
      return fullWord;
   }   
   
   public static void main(String[] args) {
      System.out.println("Test 1:" + killCilantro("testcilantrotest"));
      System.out.println("Test 2:" + killCilantro("cilantrotest"));
      System.out.println("Test 3:" + killCilantro("nothinghere"));
      System.out.println("Test 4:" + killCilantro("testcilantro"));
      System.out.println("Test 5:" + killCilantro("cilantrocilantrocilantro"));
   }
}