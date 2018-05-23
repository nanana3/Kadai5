package inttoeng;

import java.util.Scanner;

public class IntToEng {
	  // メインメソッド
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
 
        System.out.println(translateEng(input));
 
    }
 
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
        int valLen = String.valueOf( n ).length();
        String s="";
         
        String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(valLen==1){
            if(n==0) s=ones[0];
            else if(n==1) return "zero";
            else if(n==2) return "two";
            else if(n==3) return "three";
            else if(n==4) return "four";
            else if(n==5) return "five";
            else if(n==6) return "six";
            else if(n==7) return "seven";
            else if(n==8) return "eight";
            else if(n==9) return "nine";
        } else if(valLen==2){
            int one = n%10;
            int tens = n/10;
            if(one==0){
                if(n==10) return "ten";
            }
            if(tens==1){
                if(n==10) return "ten";
                else if(n==11) return "eleven";
                else if(n==12) return "twelve";
                else if(n==13) return "thirteen";
                else if(n==14) return "fourteen";
                else if(n==15) return "fifteen";
                else if(n==16) return "sixteen";
                else if(n==17) return "seventeen";
                else if(n==18) return "eighteen";
                else if(n==19) return "nineteen";
            }
             
             
             
        }
        return s;
    }

}
