import java.util.*;
public class Main {
    public static void main(String[] args) {
      String check="aabbc";
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<check.length();i++){
        map.put(check.charAt(i), map.getOrDefault(check.charAt(i),0)+1);
      }
      System.out.println(map);
    }
}
