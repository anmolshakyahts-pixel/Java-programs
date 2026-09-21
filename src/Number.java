public class Number {
    void number(){
        String a = " ",b=" ",c=" ";
        for(int i =1;i<=100;i++){
            if(i%3==0){
                a += i +", ";
            }
            if(i%5==0){
                b += i +", ";
            }
            if(i%3==0&&i%5==0){
                c += i +", ";
            }
        }
        System.out.println("Number Divisible by 3: "+ a);
        System.out.println("Number Divisible by 5: "+ b);
        System.out.println("Number Divisible by 3 and 5 both : "+ c);
    }
    public static void main(String[] args){
        Number o = new Number();
        o.number();
    }
}
