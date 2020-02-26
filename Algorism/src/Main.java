import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(br.readLine());

		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.print("X");
			}else {
				System.out.print(i);
			}
			
			if(i==n) {
				
			}else {
				System.out.print(" ");
			}		
		}
		
		br.close();
	}
}

