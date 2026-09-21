public  class Prime {
    void prime() {
        for (int i = 2; i <=20; i++) {
            boolean isPrime= true;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Prime o = new Prime();
        o.prime();
    }
}