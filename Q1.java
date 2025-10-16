public class Q1 {
    public static void main(String[] args) {
        int p = 1;
        for(int i = 1 ; i < 3 ; i++){
            int m = tavan(i);
            p = p + ( i/m );
            System.out.println( p );
        }
    } 
    public static int tavan(int n){
        int a = 3;
        for(int i = 1 ; i < n ; i++)
            a *= 3;
        return a;    
    }
    }
