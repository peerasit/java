import java.util.Scanner;

public class InsideOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int start, stop;
		if (str.length() % 2 == 1) {
			start = str.length() / 2;
			stop = str.length() / 2;
			for (int i = 0; i < str.length() / 2; i++) {
				if (start == stop) {
					System.out.print(str.charAt(start));
					start--;
					stop++;
				}
				if (start >= 0) {
					System.out.print(str.charAt(start));
					start--;
				}
				if (stop < str.length()) {
					System.out.print(str.charAt(stop));
					stop++;
				}
			}
			if(str.length()==1) {
				System.out.println(str);
			}
		}else {
			start = (str.length() / 2)-1;
			stop = (str.length() / 2)-1;
			for (int i = 0; i < str.length() / 2; i++) {
				if (start == stop) {
					System.out.print(str.charAt(start));
					start--;
					stop++;
				}
				if (stop < str.length()) {
					System.out.print(str.charAt(stop));
					stop++;
				}
				if (start >= 0) {
					System.out.print(str.charAt(start));
					start--;
				}
			
		}
			
				
			
			
	}
	}

}
