import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int n=Integer.parseInt(br.readLine());
            System.out.println(splitn(n));
        }
    }

    public static int splitn(int n) {
        if (n==1 || n==2) {
            return 0;
        } else if (n==3) {
            return 1;
        }
        return ((n%2)+splitn(n/2));
    }
}
