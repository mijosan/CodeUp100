import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int sum2 = 1;
		while(true) {
		
			sum = sum + sum2;
			
			sum2 = sum2 + 1;
			if(sum>=n) {
				System.out.println(sum);
				break;
			}

		}

	}
}

