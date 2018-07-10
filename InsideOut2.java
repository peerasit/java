import java.util.Scanner;

public class InsideOut2 {

//add comment to test git

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int start, stop;
		String remind = "";

		if (str.length() % 2 == 1) {
			int mid = sc.nextInt();
			start = mid;
			stop = mid;
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
				if (stop >= str.length()) {
					remind = str.substring(0, start + 1);
					break;
				}
				if (start < 0) {
					remind = str.substring(stop, str.length());
					break;

				}
				if (stop < str.length()) {
					System.out.print(str.charAt(stop));
					stop++;
				}

				if (str.length() == 1) {
					System.out.println(str);
				}
			}

			// System.out.println("\n"+remind+"\n");

			if (remind.length() > 0) {
				start = 0;
				stop = remind.length() - 1;
				if (remind.length() % 2 == 0) {

					for (int i = 0; i < remind.length() / 2; i++) {
						if (start == stop) {
							System.out.print(str.charAt(start));
							break;
						}

						System.out.print(remind.charAt(stop));
						stop--;

						System.out.print(remind.charAt(start));
						start++;

					}
				} else {
					for (int i = 0; i < remind.length() / 2; i++) {

						System.out.print(remind.charAt(start));
						start++;

						System.out.print(remind.charAt(stop));
						stop--;

						if (start == stop) {
							System.out.print(remind.charAt(start));
							break;
						}

					}
				}
			}
		} else {
			int mid = sc.nextInt();
			start = mid;
			stop = mid;
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
				if (start < 0) {
					remind = str.substring(stop, str.length());
					break;

				} else if (stop >= str.length()) {
					remind = str.substring(0, start + 1);
					break;
				}
				if (start >= 0) {
					System.out.print(str.charAt(start));
					start--;
				}

			}

			if (remind.length() > 0) {
				start = 0;
				stop = remind.length() - 1;
				if (remind.length() % 2 == 1) {
					for (int i = 0; i < remind.length() / 2; i++) {

						System.out.print(remind.charAt(start));
						start++;

						System.out.print(remind.charAt(stop));
						stop--;

						if (start == stop) {
							System.out.print(remind.charAt(start));
							break;
						}

					}
				} else {
					for (int i = 0; i < remind.length() / 2; i++) {
						if (start == stop) {
							System.out.print(str.charAt(start));
							break;
						}

						System.out.print(remind.charAt(stop));
						stop--;

						System.out.print(remind.charAt(start));
						start++;
					}
				}

			}
		}
	}
}