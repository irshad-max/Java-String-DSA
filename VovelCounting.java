import java.util.*;

public class Main {
    public static void main(String[] args) {
     String name="irshad";
     int consonent=0;
     int vovel=0;
     for(int i=0;i<name.length();i++){
     char ch=Character.toLowerCase(name.charAt(i));
     if(ch>='a' && ch<='z'){
      if("aeiou".indexOf(ch)!=-1){
        vovel+=1;
      }
      else{
        consonent+=1;
      }
     }
     }
     System.out.print("vovel :"+vovel+" "+"consonent :"+" "+consonent);
    }
}
