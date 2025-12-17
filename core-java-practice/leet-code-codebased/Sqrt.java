public class Sqrt {
     public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x ;
           
        }
        int p = 1;
        int q = x;
        int r = -1;
        while(p <= q){
            r = p + (q - p) / 2;
            if(r * r > x){
                q = r - 1;
            }else if (r * r == x){
                return r;
            }else{
                p = r + 1;
            }
        }
        return Math.round(q);
        
    }
    
}
