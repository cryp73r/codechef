import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, n, i, count;
        String binaryString;
        t = Integer.parseInt(br.readLine());
        while (t!=0) {
            n = Integer.parseInt(br.readLine());
            binaryString = br.readLine();
            count=0;
            for (i=0; i<n; i++) {
                if (binaryString.charAt(i)=='1') {
                    count++;
                }
            }
            for (i=0; i<n; i++) {
                if (i<n-count) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
            t--;
        }
    }
}
