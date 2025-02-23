package dp_practice;
import java.util.*;

public class fibo_memo {
    public static int f(int[] dp,int n){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        else{
            return dp[n]=f(dp,n-1)+f(dp,n-2);
            
        }
        
        
    }
    public static void main(String[]args){
        int n = 5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(dp,n));

    }
    
}
