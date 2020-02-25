import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		char n = (char)((int)br.readLine().charAt(0)+1);
		
		System.out.println(n);
		
        br.close();
	}
}

