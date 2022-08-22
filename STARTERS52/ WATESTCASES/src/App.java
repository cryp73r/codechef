import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            int s[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String v=br.readLine();
            int smallest=Integer.MAX_VALUE;
            for (int i=0; i<n; i++) {
                if (v.charAt(i)=='0') {
                    if (s[i]<smallest) {
                        smallest=s[i];
                    }
                }
            }
            System.out.println(smallest);
        }
    }
}
