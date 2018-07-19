
public class W12P4_ConsecDupRemoval {
    String dupRemove(String str){
        int strLength = str.length();
        if(strLength == 1)
            return str;
        if(str.charAt(strLength-2)==str.charAt(strLength-1)){
           return dupRemove(str.substring(0, strLength-1));
        }
        else{
            return dupRemove(str.substring(0, strLength-1))+str.charAt(strLength-1);
        }
    }
    public static void main(String[] args){
        System.out.println(new W12P4_ConsecDupRemoval().dupRemove(new java.util.Scanner(System.in).next()));
    }
}
