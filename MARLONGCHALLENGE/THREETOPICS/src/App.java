import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, x;
        String[] argus;
        argus=br.readLine().split(" ");
        a=Integer.parseInt(argus[0]);
        b=Integer.parseInt(argus[1]);
        c=Integer.parseInt(argus[2]);
        x=Integer.parseInt(argus[3]);
        System.out.println((a==x)?"YES":(b==x)?"YES":(c==x)?"YES":"NO");
    }
}
