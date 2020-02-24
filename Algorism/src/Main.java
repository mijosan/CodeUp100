import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
        float x;
        
        x = Float.valueOf(br.readLine());
        
        String x6 = String.format("%.6f",x);
        bw.write(x6+"\n");
        
        bw.flush();
        bw.close();
        br.close();
	}
}
