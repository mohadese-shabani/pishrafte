public class Q1 {
    int number;
    public static void main(String[] args) {
        for(int num = 0 ; num < 20 ; num++){
            if(isPrim(num))
                System.out.println(num);
        }
    }
     static boolean isPrim(int numebr){
    if(number < 2)
        return false;
    for(int i = 2 ; i < number ; ++i){
        if( number % i == 0)
            return false;

        return true;    
    }    
}
}