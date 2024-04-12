package harry.DSA;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DSA_001 {

    @Test
    public void trailingZeroFactorial(){
        int n = 10;
        int res =0;
        for(int i =5;i<=n;i=i*5){
            res = res + n/i;
        }
        System.out.println(res);


    }

    @Test
    public void stringer(){
        String a ="hello";
        String b =new String("hello");
        String c = new String(a);
        String d = new String(b);
        String e =a;
        String f = b;
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==d);
        System.out.println(d==e);
        System.out.println(e==f);
        System.out.println(f==a);

    }

    @Test
    public void javaSet(){
        String temp = "abs";
        HashSet<String> subset  =new HashSet<String>();

//        for ( char temp: temp.toCharArray()) {
//
//
//        }

    }

//    public void RecursivTrailingZer(int n,int res){
//        res = res +n/5;
//        RecursivTrailingZer(n,res);
//
//    }


}
