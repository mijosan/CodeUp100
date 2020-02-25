import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(br.readLine());
		
		if(n>=90) {
			System.out.println("A");
		}else if(n>=70 && n<=89){
			System.out.println("B");
		}else if(n>=40 && n<=69) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
        br.close();
	}
}

