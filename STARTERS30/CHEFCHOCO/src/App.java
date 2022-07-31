import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        String[] argus;
        t = Integer.parseInt(br.readLine());
        while (t!=0) {
            argus=br.readLine().split(" ");
            System.out.println((Integer.parseInt(argus[0])-Integer.parseInt(argus[1]))*Integer.parseInt(argus[2]));
            t--;
        }
    }
}
