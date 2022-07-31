import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            String argus[]=br.readLine().split(" ");
            int a, b, n;
            a=Integer.parseInt(argus[0]);
            b=Integer.parseInt(argus[1]);
            n=Integer.parseInt(argus[2]);
            if (a%b==0) {
                System.out.println(-1);
                continue;
            } 
            // else if (b%a!=0) {
            //     if (n%a==0 && n%b!=0) {
            //         System.out.println(n);
            //     } else {
            //         System.out.println((((n/a)+1)*a));
            //     }
            // } 
            if (n%a!=0) {
                n=n+a-(n%a);
            }
            while (!(n%a==0 && n%b!=0)) {
                n+=a;
            }
            System.out.println(n);
        }
    }
}
