
public class SumIntegers {
    void sum(){
        int a = 0;
        for (int i = 101; i<200; i++){
            if (i%7==0){
                a+= i;
            }
        }
        System.out.println("Sum of all integers greater than 100 and less than 200 that are divisible by 7: "+ a);
    }
    public static void main(String[] args){
        SumIntegers o = new SumIntegers();
        o.sum();
    }
}
