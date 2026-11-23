import java.util.*;
public class Main {
    public static void main(String[] args) {
    String str="mam";
    String check="";
    for(int i=str.length()-1;i>=0;i--){
       check+=str.charAt(i);
    }
    if(check.equals(str)){
      System.out.println("yes it is palindrome");
    }
    else{
      System.out.println("no it is not palindrome");
    }
    }
}
