package test;
import java.util.*;
public class q2 {
          public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              String str=sc.nextLine();
              HashMap<Character,Integer> map=new HashMap<>();
              for(char c:str.toCharArray()){
                  if(map.containsKey(c)){
                      map.put(c,map.get(c)+1);
                  }else{
                      map.put(c,1);
                  }
              }
              System.out.println(map);
          }
}
