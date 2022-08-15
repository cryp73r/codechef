import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            int x=Integer.parseInt(br.readLine());
            if (x<=100) {
                System.out.println(x);
            } else if (x>100 && x<=1000) {
                System.out.println(x-25);
            } else if (x>1000 && x<=5000) {
                System.out.println(x-100);
            } else {
                System.out.println(x-500);
            }
        }
    }
}
