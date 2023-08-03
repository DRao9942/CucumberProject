
public class JavaDemo {
	
	
	 public static void main(String argu[]) {

		  String str = "Deepak Raao";
		  int count = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     count++;
		     break;
		    }
		   }
		  }
		 }
		}