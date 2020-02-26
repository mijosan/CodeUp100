import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			
			String str = st.nextToken();
			
			
			if(str.equals("q")){
				System.out.println(str);
				break;
			}
			
			System.out.println(str);
			
		}
        br.close();
	}
}

