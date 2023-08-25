class task4_3_3 {
    static int sumUp(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum +=i; // sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(sumUp(n));
    }
}

