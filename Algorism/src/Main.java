import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[11][11];
		
		for(int i=1;i<11;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<11;j++) {			
				arr[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
		int temp = 0;
		boolean flag = false;
		breakOut :
		while(true) {
			for(int i=2;i<10;i++) {
				for(int j=2;j<10;j++) {
					
					if(flag == true) {
						j = temp;
					}
					
					if(arr[i][j] == 2) { //먹이 찾았을때
						arr[i][j] = 9;
						break breakOut;
					}
					
					if(arr[i][j] == 0) {
						arr[i][j] = 9;
						flag = false;
						if(arr[i][j+1] == 1) {
							temp = j;
							flag = true;
							break;
						}
					}
				}
			}
			break;
		}
		
		
		for(int i=1;i<11;i++) {
			for(int j=1;j<11;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}

