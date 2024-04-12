import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeShawList {
    public static void main(String[] args){
        List<String> a =new ArrayList<String>();
        List<Integer> iter;
        a.add("adc");
        a.add("toe");
        a.add("nop");
        List<String> b =new ArrayList<String>();
        b.add("cad");
        b.add("tew");
        b.add("bma");
        //["adc", "toe" ," nop"]
        //["cad" , "tew" , "bma"]
        iter = anagram(a,b);
        System.out.println(Arrays.toString(iter.toArray()));


    }

    static List<Integer> anagram(List<String> a, List<String> b){
        List<Integer> checker = new ArrayList<Integer>();
        for(int i=0; i<a.size();i++){
            if(a.get(i).length() == b.get(i).length()){
                char[] oneCharArray = a.get(i).toCharArray();
                char[] secondCharArray = b.get(i).toCharArray();
                Arrays.sort(oneCharArray);
                Arrays.sort(secondCharArray);

                if(Arrays.equals(oneCharArray,secondCharArray)){
                    checker.add(1);
                }else {
                    int count =0;
                    for(int j =0;j< oneCharArray.length;j++){
                        if(oneCharArray[j]!=secondCharArray[j]){
                            count++;
                        }
                    }
                    if(count== oneCharArray.length && count==secondCharArray.length && count>0){
                        checker.add(i,-1);
                    }else {
                        checker.add(count);
                    }
                }

            }else {
                checker.add(i,-1);
            }
        }

        return checker;

    }


}
