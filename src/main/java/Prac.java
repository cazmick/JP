import  org.testng.annotations.Test;

import java.util.*;
import java.util.stream.IntStream;

public class Prac {

    @Test
    public void tagRemover(){
        String a ="<h1>Nayeem loves counseling</h1>\n" +
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>\n" +
                "<Amee>safat codes like a ninja</amee>\n" +
                "<SA premium>Imtiaz has a secret crush</SA premium>";
        for (int i =0 ;i<a.length();i++) {
            int j=i;
            if(a.charAt(i) == '<'){

                while (a.charAt(j)!='>'){
                    j++;
                }
                a=a.replace(a.substring(i,j+1),"").trim();
            }


        }
        System.out.println(a);

    }


    @Test
    public void isPalindrone(){
        String alpha="aaasaaa";
        String rev="";
        boolean isPalindrome= false;
        for (int i = alpha.length() -1;i>=0;i--){
            rev = rev+ alpha.charAt(i);
        }
        if(alpha.equals(rev)){
            isPalindrome=true;

        }
        System.out.println("isPalindrone : "+ isPalindrome);
    }

    public boolean recusivePalindrome(String a){
        if(a.length()==1){
            return true ;
        }
        if(a.charAt(0) == a.charAt(a.length()-1)){
            a= a.substring(1,a.length()-1);

            return true && recusivePalindrome(a);
        }else {
            return false;

        }

    }

    @Test
    public void checkRecursivePalindrome(){
//        System.out.println(recusivePalindrome("aaasaaa"));
//        System.out.println(recusivePalindrome("baasaaa"));
//        System.out.println(Factionrail(4));
//        fibonacci(10);
//        System.out.println(fibonacciRecursive(3));
        int first =0;
        int second =1;
        System.out.print(first+" "+second);//printing 0 and 1

        int count=10;
        fibonacciRecursive(count-2,first,second);
    }

    public int Factionrail(int i){
        if(i<2){
            return 1;
        }
        return i *Factionrail(i-1);
    }


    @Test
    public void sortArray(){
        int array[] = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
        for (int i=0;i< array.length;i++){
            if(array[i]<array[i+1]){
                int tmp = array[i];
                array[i]=array[i+1];
                array[i+1]=tmp;
                i=-1;
            }
        }
        System.out.println(array);

    }

    public void  fibonacci(int n){
        int first =0;
        System.out.println(first);
        int second =1;
        System.out.println(second);
        int rest=0;
        while(n-2>0){
            rest=first +second;
            System.out.println(rest);
            first=second;
            second=rest;
            n--;
        }

    }

    @Test
    public void elementOccurence(){
        String dumpper = "dfvdvfjvsdhjfvhsdvf";
        SortedMap<Character,Integer> mapper = new TreeMap<>();
        List<String> lister = new ArrayList<String>();
        Set<String> charsOrder = new LinkedHashSet<>();
        int val =-1;
        for(char tem : dumpper.toCharArray()){
            if(mapper.containsKey(tem)){
                mapper.put(tem,mapper.get(tem)+1);

                String listeee = lister.get(lister.indexOf(tem+"_"+mapper.get(tem)));

                String tempo = charsOrder.toString();
                if(charsOrder.toString().contains(tem+"_"+String.valueOf(mapper.get(tem)-1))){
                    charsOrder.remove(tem+"_"+String.valueOf(mapper.get(tem)-1));
                    charsOrder.add(String.valueOf(tem+"_"+mapper.get(tem)));
                };
            }else {
                mapper.put(tem,1);
                charsOrder.add(tem + "_"+"1" );
                lister.add(tem+"_1");

            }
        }
//        val=mapper.size()-1;

//        sortMap(mapper);
        System.out.println(mapper);
        System.out.println("-------------");
        System.out.println(charsOrder.toString());

//
//        for(int i=0; i<mapper.size() && val>-1;i++){
//
//
//        }



    }
    public void sortMap(Map<Character,Integer> integerMap){


        List<Map.Entry<Character,Integer>> entries = new ArrayList<>(integerMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<Character,Integer> entry:entries
             ) {
            System.out.println( "Key : "+entry.getKey() +" Val : "+entry.getValue()  );
        }






    }

    @Test
    public void StringLogics(){
        String a= "hello";
        String b = new String("hello");
        String c= a;
        String d = new String(a);
        String e =b;

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equals(e));
        System.out.println(b.equals(d));


    }


    @Test
    public void returnDeviceListwithminVersion() {
        int version =12;
        String deviceList="Google Pixel 8 Pro|13.0,Google Pixel 8|13.0,Google Pixel 7 Pro|13.0,Google Pixel 7|13.0,Google Pixel 6 Pro|13.0,Google Pixel 6 Pro|12.0,Google Pixel 6|12.0,Google Pixel 5|12.0,Google Pixel 3a|9.0,Google Pixel 3a XL|9.0,Google Pixel 4 XL|10.0,Google Pixel 4|10.0,Google Pixel 4|11.0,Google Pixel 5|11.0,Google Pixel 4|10.0\n";
        String newList="";
        String[] listor = deviceList.split(",");
        for (String cuurentOne : listor ) {

            if(Float.parseFloat(cuurentOne.split("\\|")[1])>=version) {
                newList = newList + ","+cuurentOne;
            }


        }
        newList=newList.substring(1);

        System.out.println(newList);
    }

    public void fibonacciRecursive( int count ,int n1,int n2){
        int n3;
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonacciRecursive(count-1,n1,n2);
        }
    }
//        if (n == 0) {
//            return 0;
//        }
//        else if(n==1){
//            return 1;
//        }else {
//            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
//        }







    @Test
    public  void ascii(){
        IntStream stringer="hdhcfgc".chars();
        System.out.println(stringer.sum());
        stringer.sorted();
//        String[] ch=stringer.split("");
//        for (int i=0;i<stringer.length()-1;i++ ) {
//
//            char asc = (char) ch[i];
//
//        }
//        for (int i=33;i<6000;i++){
//            char asc = (char) i;
//            if (asc!=Character.MIN_VALUE){
//                System.out.println("Char Value : "+asc +" | ASCII Value : "+i);
//            }
//
//        }

    }


}
