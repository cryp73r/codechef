import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            String argus[]=br.readLine().split(" ");
            int a=Integer.parseInt(argus[0]);
            int b=Integer.parseInt(argus[1]);
            if (a==b) {
                System.out.println("YES");
            } else {
                if (Math.abs(a-b)%2==0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
