/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "E:\\Pace_Classes\\5-Fall_2026\\ProgramingLang_Imp\\10_28\\Coed\\testJay.txt";
	// E:\\Pace_Classes\\5-Fall_2026\\ProgrammingLang_Imp\\10_28\\Coed\\
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();

			if (tk.getValue() != null && !tk.getValue().isEmpty()) {
				System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
			}
		}
	}
}