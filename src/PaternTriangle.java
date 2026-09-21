public class PaternTriangle {
    void triangle(){
        int i;
        for( i =1;i<=5;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PaternTriangle o = new PaternTriangle();
        o.triangle();
    }
}
