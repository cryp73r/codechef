import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, x, y, a, b, result;
        String[] argus;
        t=Integer.parseInt(br.readLine());
        while (t!=0) {
            argus=br.readLine().split(" ");
            result=0;
            x=Integer.parseInt(argus[0]);
            y=Integer.parseInt(argus[1]);
            a=Integer.parseInt(argus[2]);
            b=Integer.parseInt(argus[3]);
            if (x!=a && x!=b) {
                result++;
            }
            if (y!=a && y!=b) {
                result++;
            }
            System.out.println(result);
            t--;
        }
    }
}
