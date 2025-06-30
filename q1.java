package test;
import java.util.*;
import java.util.stream.Collectors;

public class q1 {
       public static void main(String[] args) {
           List<String> list=new ArrayList<>(Arrays.asList("alex","is","from","newyork","usa","hello"));
           List<String> list2=list.stream().filter(name -> name.length()>=4).map(String::toUpperCase).collect(Collectors.toList());
           Collections.sort(list2,Collections.reverseOrder());
           System.out.println(list2);
       }
}
