import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String hex = br.readLine();
		
		int a = Integer.parseInt(hex,16); //16진수로 인식하여 정수에 저장
		
		for(int i=1;i<=15;i++) { // toHexString을 사용하여 정수를 16진수로 표현
			System.out.println((Integer.toHexString(a) + "*" + Integer.toHexString(i) + "=" + Integer.toHexString(a*i)).toUpperCase());
		}
		
		br.close();
	}
}

