import java.util.*;

public class Main {
    public static void main(String[] args) {
      String  str="irshad mustafa";
      String ws="";
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' ')
        continue;
        ws+=str.charAt(i);
      }
      System.out.println("String with space :"+str);
      System.out.print("String without space :"+ws);
    }
}
