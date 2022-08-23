import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            String argus[]=br.readLine().split(" ");
            int n=Integer.parseInt(argus[0]);
            int m=Integer.parseInt(argus[1]);
            if ((n/m)%2==0 && n%m==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
