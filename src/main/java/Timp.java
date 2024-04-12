import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class Timp {
    int i;







    public List<String> keywords = Arrays.asList("good", "good app", "fine", "average", "ok", "very good", "nice", "excellent",
            "helpful app", "nice app", "okay", "awesome","worst", "fake", "bakwaas","bakwas", "poor", "not happy", "no job", "spam", "no call",
            "no response", "bad", "waste", "pathetic", "bekar", "scam", "not satisfied", "not relevant", "faltu",
            "3rd class","bad app");

    public void add (int i , int j ){
        System.out.println("INT");
    }

    public void add (long i , long j ){
        System.out.println("LONG");
    }

    public static void main (String[] args){



//        String text1 =OuterClass.intent1.text1;

        Timp tem = new Timp();
        tem.add(1,2);
        String test = "Dear Kanishka, This is test uri, of split logic";
        String [] testsplit = test.split(",");



//        int updateIndex =;
        String rest = test.substring(test.indexOf(testsplit[0]) + testsplit[0].length()+1).strip();
        System.out.println(rest);
        String reviewText = "This is very bad app";
        for (String x: tem.keywords){
            if(reviewText.contains(x)){
                System.out.println("True");
                return;
            }
        }




    }
}
