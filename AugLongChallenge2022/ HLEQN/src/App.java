import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int x=Integer.parseInt(br.readLine());
            int i;
            for (i=1; i*i<x; i++) {
                if (((x-2*i)%(2+i))==0 && (x!=(2*i))) {
                    System.out.println("YES");
                    break;
                }
            }
            if (i*i>=x) {
                System.out.println("NO");
            }
        }
    }
}
