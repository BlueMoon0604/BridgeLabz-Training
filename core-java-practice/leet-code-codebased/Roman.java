import java.util.HashMap;
import java.util.Map;

public class Roman {
     public int romanToInt(String s) {
        int n = 0 , prev = 0 ; 
        Map<Character, Integer> roman = new HashMap<>();
        
        roman.put('I' , 1);
        roman.put('V' , 5);
        roman.put('X' , 10);
        roman.put('L' , 50);
        roman.put('C' , 100);
        roman.put('D' , 500);
        roman.put('M' , 1000);

        for(int i = s.length() - 1 ;i >= 0 ; i--){
            int current = roman.get(s.charAt(i));
            if(current < prev ){
                n = n - current ;
            }else{
                n = n + current;
               
            }
            prev = current ; 

        }
        return n;
        
    }
    
}
