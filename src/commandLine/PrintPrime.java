package commandLine;
public class PrintPrime{
void prime() {
    for (int j = 3; j <=30; j++) {
        boolean Prime1= true;
        for (int z = 2; z <=Math.sqrt(j); z++) {
            if (j % z == 0) {
                Prime1  = false;
                break;
            }
        }
        if(Prime1){
            System.out.println(j);
        }
    }
}
public static void main(String[] args) {
    PrintPrime o = new PrintPrime();
    o.prime();
}
}
