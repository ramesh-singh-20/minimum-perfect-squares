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

    public int numSquaresDp(int n){
        if(n== 0){
            return 0;
        }
        if(isPerfectSquare(n)){
            return 1;
        }

        if(n<= 3){
            return n;
        }

        int [] dp= new int[n+1];

        dp[0]= 0;
        dp[1]= 1;
        dp[2]= 2;
        dp[3]= 3;

        for(int i=4; i<= n; i++){
            dp[i]= i;

            for(int j=1; j<= Math.ceil(Math.sqrt(i)); j++){
                int temp= j*j;
                if(temp> i){
                    break;
                }else {
                    dp[i] = Math.min(dp[i], 1 + dp[i - temp]);
                }
            }
        }

        return dp[n];
    }
}
