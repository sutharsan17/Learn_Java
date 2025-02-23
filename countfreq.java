import java.util.*;
public class countfreq {
    public static void main(String[] args) {
        System.out.println("Hello World");
        HashMap<Character,Integer>map = new HashMap<>();
        String s="sutharsan";
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
       map.forEach((key,value) -> System.out.println(key+"+"+value));


    }
}

      

    

