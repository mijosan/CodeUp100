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
		
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
	
		int min = Integer.parseInt(st.nextToken());
		int temp = 0;

		while(st.hasMoreTokens()) {
			
			temp = Integer.parseInt(st.nextToken());
			
			if(min>temp) {
				min = temp;
			}
			
		}
		
		System.out.println(min);

	}
}

