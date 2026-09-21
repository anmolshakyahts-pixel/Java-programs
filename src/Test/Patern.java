package Test;

public class Patern {
    public static void main(String[] args){
        char a ='A';
        for(int i = 0; i< 4;i++){
            for(int j =0;j<4-i;j++){
                System.out.print(a);
                a++;
            }
            for (int z = 0; z<i*2;z++){
                System.out.print(" ");
            }
            for(int c = 0; c<4-i;c++){
                a--;
                System.out.print(a);
            }

            System.out.println();
        }
    }
}
