import java.util.Scanner;
import java.io.*;
class JavaCodeEditor{
	public static void main(String[]args)
	  throws IOException	
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name of file, which will change.");
		String name = in.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(name));
		String code = br.readLine();
		code = 	edit(code);
	}
	public static String edit(String code){
		code = code.replaceAll(";", "; \n ");
		code = code.replaceAll("\\{", "\\{ \n ");
		code = code.replaceAll("\\(", " \\( ");
		code = code.replaceAll("\\)", " \\) ");
 		code = code.replaceAll("\\+", " \\+ ");
		code = code.replaceAll("\\-", " \\- ");
		code = code.replaceAll("\\*", " \\* ");
		return code;
	}
}
