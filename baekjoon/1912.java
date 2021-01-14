import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	int[] arr = new int[n];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	int max = arr[0];
    	
    	for (int i = 1; i < n; i++) {
    		arr[i] = Math.max(arr[i-1] + arr[i], arr[i]);
    		max = Math.max(max, arr[i]);
    	}
    	
    	System.out.println(max);
    }
    
}