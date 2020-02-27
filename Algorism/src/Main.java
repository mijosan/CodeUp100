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
		
		int[][] arr = new int[20][20];
		int n = Integer.parseInt(br.readLine());
		
		int x;
		int y;
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1; 
			
		}
		
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		
		
		
	}
}

