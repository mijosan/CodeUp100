import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] n = new int[st.countTokens()];
		
		int i = 0;
		while(st.hasMoreTokens()) {
		
			n[i] = Integer.parseInt(st.nextToken());
			
			i++;
			
		}
		
		for(int a:n) {
			if(a==0) {
				break;
			}
			System.out.println(a);
		}
		
        br.close();
	}
}

