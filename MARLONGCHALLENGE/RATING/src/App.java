import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, s, i;
        t=Integer.parseInt(br.readLine());
        while (t!=0) {
            s=Integer.parseInt(br.readLine());
            i=-1;
            while (((s*i)-(Math.pow(i, 2))<0) && (s-i)<0) {
                i--;
            }
            System.out.println((s*i)-((int)(Math.pow(i, 2))));
            t--;
        }
    }
}
