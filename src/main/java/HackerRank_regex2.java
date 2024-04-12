import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank_regex2 {

    public static void main(String [] args){
        System.out.println(Arrays.toString(args));
        String input =" this is is a A dummy";
//        Pattern pattern = Pattern.compile()
//        Matcher matcher = input
        //expected = "this a=is a dummy"
        String[] splitter = input.split( " ");
        for ( int i =0;i< splitter.length-1 ; i++) {
            if(splitter[i+1].equalsIgnoreCase(splitter[i])){
                splitter[i+1]="";
            }


        }
        for (String a:splitter
             ) {
            if(!a.equals("")){
                System.out.print(a + " ");
            }


        }

    }


}
