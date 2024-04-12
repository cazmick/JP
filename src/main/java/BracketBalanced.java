import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class BracketBalanced {
    public static void main(String[] args){
//        String temp = "{{}()}";
//        System.out.println(isBalanced(temp));

        String temp1 = "Heelo Big boy";
        reverseWords(temp1);
        System.out.println();

    }

    static void reverseWords(String str)
    {

        Stack<Character> st = new Stack<Character>();

        // Traverse given string and push all
        // characters to stack until we see a space.
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));

                // When we see a space, we print
                // contents of stack.
            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }

        // Since there may not be space after
        // last word.
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }




    public static boolean isBalancedusingStack(){
        Stack<Character> stack = new Stack<Character>();
        Iterator<Character > characterIterator = stack.iterator();
        return false;
    }
    public static boolean isBalanced(String a){
        int i=-1;
        char[] chars = new char[a.length()];
        for(char c : a.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                chars[++i]=c;
            }else {
                if(i>0  && ((chars[i] == '(' && c == ')')
                        || (chars[i] == '{' && c == '}')
                        || (chars[i] == '[' && c == ']'))){
                    i--;

                }else {
                    return false;
                }
            }
        }

        return i == -1;
    }
}
