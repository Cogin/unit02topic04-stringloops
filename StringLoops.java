import java.util.Arrays;

public class StringLoops {

  // static methods go here
  public static String reverseCharacters(String s) {
    String result = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      result += s.charAt(i);
    }
    return result;
  }

  public static int[] indexesOfAll(String s, String c) {
    int[] indexarrayuncut = new int[s.length()];
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c.charAt(0)) {
      indexarrayuncut[count] = i;
      count++;
      }
    }

    int[] indexarray = new int[count];
    for (int i = 0; i < count; i++) {
      indexarray[i] = indexarrayuncut[i];
    }
    return indexarray;
  }

  public static boolean hasRepeatedConsecutives(String s) {
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) return true;
    }
    return false;
  }

  public static String reverseWords(String s) {
    String[] names = s.split(" ");
    String result = "";
    for (int i = names.length - 1; i >= 0 ; i--) {
      result += names[i] + " ";
    }
    return result;
  }

  public static void main(String[] args) {

    // test reverseCharacters
    System.out.println(reverseCharacters("academy"));


    System.out.println(Arrays.toString(indexesOfAll("attack", "a")));
    // test indexesOfAll

    // test hasRepeatedConsecutives
    System.out.println(hasRepeatedConsecutives("abca"));

    // test name
    System.out.println(reverseWords("the quick brown fox"));

  }
}