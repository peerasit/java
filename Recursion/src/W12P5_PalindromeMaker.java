
import java.util.Scanner;

public class W12P5_PalindromeMaker {

    String makePalindrome(String str) {
        if(str.length()==0){
            return "";
        }
        else if(str.length()==1)
            return str;
       if(str.charAt(0)==str.charAt(str.length()-1)){
           return str.charAt(0)+makePalindrome(str.substring(1, str.length()-1))+str.charAt(str.length()-1);
       }else{
           return makePalindrome(str.substring(1, str.length()-1));
       }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        W12P5_PalindromeMaker maker = new W12P5_PalindromeMaker();
        String result = maker.makePalindrome(text);
        System.out.println(result);
    }
}
