import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c=Integer.parseInt(br.readLine());
        if (c<=1000) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
