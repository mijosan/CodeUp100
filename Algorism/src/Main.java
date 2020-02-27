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
		int count = 1;
		while(st.hasMoreTokens()) {
			
			arr[arr.length-count] = Integer.parseInt(st.nextToken());
			count = count + 1;
			
		}
		
		for(int i:arr) {
			System.out.print(i + " ");
		}

	}
}

