import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(),".");
		
		String[] str = new String[st.countTokens()];

		for(int i=0;i<str.length;i++) {
			str[i] = st.nextToken();
		}
		
		System.out.println(str[2] + "-" + str[1] + "-" + str[0]);

		
        br.close();
	}
}

