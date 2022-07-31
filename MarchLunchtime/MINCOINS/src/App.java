import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t, x, count;
		t=Integer.parseInt(br.readLine());
		while (t!=0) {
		    count=0;
		    x=Integer.parseInt(br.readLine());
		    if (x%5!=0) {
		        System.out.println(-1);
		    } else {
		        while (x>0) {
		            if (x>=10) {
		                count++;
		                x-=10;
		            } else {
		                count++;
		                x-=5;
		            }
		        }
		        System.out.println(count);
		    }
		    t--;
		}
    }
}
