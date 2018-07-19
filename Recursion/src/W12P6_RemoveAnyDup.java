
import java.util.Scanner;


public class W12P6_RemoveAnyDup {

    String removeAnyDup(String str) {
        if(str.length() == 0){
            return "";
        }
        String strCut = str.substring(0, str.length()-1);
        if(strCut.indexOf(str.charAt(str.length()-1))==-1){
            return removeAnyDup(strCut)+str.charAt(str.length()-1);
        }else
            return removeAnyDup(strCut);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        W12P6_RemoveAnyDup remover = new W12P6_RemoveAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.print(result);
    }
}
