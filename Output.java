
package dummy;
import java.io.*;


public class Output {
	public static void main(String[] args)
	{
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("Rakesh");
		pw.print("rakzz");
		pw.println("0309");
		PrintWriter pw1 = new PrintWriter(System.out,false);
		pw1.println("Rakesh");
		pw1.print("rakzz");
		pw1.println("0309");
	}

}
