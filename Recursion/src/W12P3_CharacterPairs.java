
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class W12P3_CharacterPairs {

    int countPairs(String str) {
        if (str.length() <= 2) {
            return 0;
        }
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        } else {
            return countPairs(str.substring(1));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new W12P3_CharacterPairs().countPairs(sc.next()));
    }
}
