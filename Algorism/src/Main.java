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

		int[] count = new int[24];
		
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			
			count[temp] = count[temp] + 1;
		}
		
		for(int i=1;i<count.length;i++) {
			System.out.print(count[i] + " ");
		}

	}
}

