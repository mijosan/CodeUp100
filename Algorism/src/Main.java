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
		Long b = Long.parseLong(st.nextToken());
		Long c = Long.parseLong(st.nextToken());

		int day = 1;
		while(day%a!=0 || day%b!=0 || day%c!=0) {
			
			day++;
		}
		
		System.out.println(day);
	}
}

