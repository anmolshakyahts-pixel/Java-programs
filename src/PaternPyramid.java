public class PaternPyramid {
    void pyramid() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= i*2-1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PaternPyramid o = new PaternPyramid();
        o.pyramid();
    }
}
