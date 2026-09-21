public class PaternPraymid {
    void pyramid() {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PaternPraymid o = new PaternPraymid();
        o.pyramid();
    }
}
