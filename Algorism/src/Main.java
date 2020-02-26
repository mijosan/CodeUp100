import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String hex = br.readLine();
		
		int a = Integer.parseInt(hex,16); //16������ �ν��Ͽ� ������ ����
		
		for(int i=1;i<=15;i++) { // toHexString�� ����Ͽ� ������ 16������ ǥ��
			System.out.println((Integer.toHexString(a) + "*" + Integer.toHexString(i) + "=" + Integer.toHexString(a*i)).toUpperCase());
		}
		
		br.close();
	}
}

