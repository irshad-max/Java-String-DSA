import java.util.*;
public class Main {
    public static void main(String[] args) {
      String name="irshad";
      String reversed="";
      int n=name.length()-1;
      for(int i=n ;i>=0;i--){
        reversed+=name.charAt(i);
      }
      System.out.println(reversed);
    }
}
