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
            int c=Integer.parseInt(argus[2]);
            int d=Integer.parseInt(argus[3]);
            if ((a-c)<(b-d)) {
                System.out.println("First");
            } else if ((a-c)==(b-d)) {
                System.out.println("Any");
            } else {
                System.out.println("Second");
            }
        }
    }
}
