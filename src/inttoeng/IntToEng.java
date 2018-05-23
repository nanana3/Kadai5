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
       String[] teen = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
       String[] tens = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
       int one = n%10;
       int ten = (n/10)%10;
       int handred = (n/100)%10;
       if(valLen>=3){
    	   
           if(handred==1) s=s+ones[1];
           else if(handred==2) s=s+ones[2];
           else if(handred==3) s=s+ones[3];
           else if(handred==4) s=s+ones[4];
           else if(handred==5) s=s+ones[5];
           else if(handred==6) s=s+ones[6];
           else if(handred==7) s=s+ones[7];
           else if(handred==8) s=s+ones[8];
           else if(handred==9) s=s+ones[9];
    	   s=s+" handred";
    	   n=n-handred*100;
       }
       if(valLen>=2){
    	   if(valLen>2&&ten!=0) s = s + " ";
           if(ten==1){
               if(n==10) s=s+teen[0];
               else if(n==11) s=s+teen[1];
               else if(n==12) s=s+teen[2];
               else if(n==13) s=s+teen[3];
               else if(n==14) s=s+teen[4];
               else if(n==15) s=s+teen[5];
               else if(n==16) s=s+teen[6];
               else if(n==17) s=s+teen[7];
               else if(n==18) s=s+teen[8];
               else if(n==19) s=s+teen[9];
           } else {
               if(ten==2) s=s+tens[0];
               else if(ten==3) s=s+tens[1];
               else if(ten==4) s=s+tens[2];
               else if(ten==5) s=s+tens[3];
               else if(ten==6) s=s+tens[4];
               else if(ten==7) s=s+tens[5];
               else if(ten==8) s=s+tens[6];
               else if(ten==9) s=s+tens[7];
           }   
            
       }
       if(valLen>=1&&ten!=1){
           if(valLen>1&&one!=0) s = s + " ";
           if(n==0) s=ones[0];
           else if(one==1) s=s+ones[1];
           else if(one==2) s=s+ones[2];
           else if(one==3) s=s+ones[3];
           else if(one==4) s=s+ones[4];
           else if(one==5) s=s+ones[5];
           else if(one==6) s=s+ones[6];
           else if(one==7) s=s+ones[7];
           else if(one==8) s=s+ones[8];
           else if(one==9) s=s+ones[9];
       }
       return s;
    } 

}
