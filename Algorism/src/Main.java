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
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		Long a = Long.parseLong(st.nextToken());
		Long d = Long.parseLong(st.nextToken());
		Long n = Long.parseLong(st.nextToken());
		
		Long sum = a;
		
		for(int i=1;i<n;i++) {
			sum = sum * d;
		}
		System.out.println(sum);
		
	}
}

