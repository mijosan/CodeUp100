import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[h+1][w+1];
		
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int l = Integer.parseInt(st.nextToken()); //길이
			int d = Integer.parseInt(st.nextToken()); //방향 0:가로 1:세로
			int x = Integer.parseInt(st.nextToken()); //x축
			int y = Integer.parseInt(st.nextToken()); //y축
			
			for(int j=0;j<l;j++) {
				if(d==0) { //가로
					arr[x][y] = 1;		
					y++;
				}else { //세로
					arr[x][y] = 1;		
					x++;
				}
			}		
		}
		
		for(int i=1;i<h+1;i++) {
			for(int j=1;j<w+1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

