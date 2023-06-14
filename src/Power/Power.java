package Power;

class Power {
 
    // Function to calculate N raised to the power P
    static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int N = 10;
        int P = 5;
 
        System.out.println(power(N, P));
    }
}