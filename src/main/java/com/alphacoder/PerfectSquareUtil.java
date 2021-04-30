package com.alphacoder;

public class PerfectSquareUtil {

    //Utility method to find if number is perfect square or not
    private boolean isPerfectSquare(int n){
        double sqrt= Math.sqrt(n);
        return sqrt== Math.floor(sqrt);
    }

    public int numSquares(int n) {
        if(n==0){
            return 0;
        }
        if(isPerfectSquare(n)){
            return 1;
        }
        if(n<=3){
            return n;
        }

        int result= n;

        for(int i=1; i*i<= n; i++){
            result= Math.min(result, 1+numSquares(n -(i*i)));
        }

        return result;
    }
}
