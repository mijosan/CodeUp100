import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int n = Integer.parseInt(br.readLine());
		
		switch(n) {
		case 12: case 1: case 2:
			System.out.println("winter");
			break;
		case 3: case 4: case 5:
			System.out.println("spring");
			break;
		case 6: case 7: case 8:
			System.out.println("summer");
			break;
		case 9: case 10: case 11:
			System.out.println("fall");
			break;
		}
		
		
        br.close();
	}
}

