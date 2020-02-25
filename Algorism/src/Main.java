import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(br.readLine());
		
		if(n>0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
		
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
        br.close();
	}
}

