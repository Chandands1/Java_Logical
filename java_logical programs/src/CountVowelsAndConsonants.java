public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "abcdefghi";
        checkVowelsConsonants(str);
    }
    public static void checkVowelsConsonants(String str){
      int  vowelCount =0;
      int consonantCount = 0;
      int len = str.length();
      str = str.toLowerCase();

      for(int i = 0;i<len;i++){
          char ch = str.charAt(i);

          if(Character.isLetter(ch)){
              if("aeiou".indexOf(ch) !=-1){
                  vowelCount++;
              }else {
                  consonantCount++;
              }
          }
      }
        System.out.println("The vowels count is: "+ vowelCount);
        System.out.println("The consonant count is: "+ consonantCount);

    }
}
