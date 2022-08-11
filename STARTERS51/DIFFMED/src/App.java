import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            int array[]=new int[n];
            for (int i=1; i<=n; i++) {
                array[i-1]=i;
            }
            
        }
    }
}
