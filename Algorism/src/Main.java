import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine(),".");
		
		char[] n = br.readLine().toCharArray();

		
		  for(int i=0;i<n.length;i++) { 
			  int a = n.length-i+1; 
			  System.out.println("[" + ((int)(Math.pow(10, a-2)))*(n[i]-'0') + "]"); 
		  }
		 
		
        br.close();
	}
}

