import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int x, y;
            String argus[]=br.readLine().split(" ");
            x=Integer.parseInt(argus[0]);
            y=Integer.parseInt(argus[1]);
            if (y<=x) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }
    }
}
