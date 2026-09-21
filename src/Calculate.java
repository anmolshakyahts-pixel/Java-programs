public class Calculate {
    int sum(){
        int sum1 = 0;
        for( int i=1; i<=10;i++){
            sum1 = sum1 + i;
        }
        return sum1;
    }
    public static void main(String[] args){
        Calculate r = new Calculate();
        int i = r.sum();
        System.out.println("Sum of first 10 natural number: "+ i);

    }

}

