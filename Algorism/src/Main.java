import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[20][20];
		for(int i=1;i<20;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<20;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			StringTokenizer xy = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(xy.nextToken());
			int y = Integer.parseInt(xy.nextToken());
			
			for(int j=1;j<20;j++) {
				if(arr[x][j] == 0) {
					arr[x][j] = 1;
				}else {
					arr[x][j] = 0;
				}
				
				if(arr[j][y] == 0) {
					arr[j][y] = 1;
				}else {
					arr[j][y] = 0;
				}
			}
		}	
		for(int i=1;i<20;i++) {
			for(int j=1;j<20;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
	}
}

