import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int cond[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (cond[0]<cond[2]) {
                cond[0]=cond[2];
            }
            if (cond[0]<=cond[1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
