package anuj;

import org.testng.annotations.Test;

public class Palindrome {
    static String FreshDesk_URL = "<a href='https://naukricom.freshdesk.com/a/tickets/X'>X</a>";


    @Test
    public void palinDromeNumber(){
        int num =111211;
        int og = num;
        int reversedNumber=0;
        while (num!=0){
            int last = num%10;
            reversedNumber = reversedNumber*10 +last;
            num=num/10;
        }
        if (reversedNumber == og){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not Palindrome Number");
        }
    }




    public int reversedNum(int num ,int reversed){
        if(num==0){
            return reversed;
        }
        reversed = (reversed*10) +num %10;

        return reversedNum(num/10, reversed);
    }

    @Test
    public void recursivePalindrom( ){
        int num =1;
        System.out.println(FreshDesk_URL.replaceAll("X","1"));




    }



}
