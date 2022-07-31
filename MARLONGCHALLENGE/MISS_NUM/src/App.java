import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, a, b;
        int[] abcd=new int[4];
        String[] argus;
        t = Integer.parseInt(br.readLine());
        while (t!=0) {
            argus=br.readLine().split(" ");
            abcd[0]=Integer.parseInt(argus[0]);
            abcd[1]=Integer.parseInt(argus[1]);
            abcd[2]=Integer.parseInt(argus[2]);
            abcd[3]=Integer.parseInt(argus[3]);
            Arrays.sort(abcd);
            a=(abcd[0]+abcd[2])/2;
            b=abcd[2]-a;
            if ((a*b)==abcd[3] && (a/b)==abcd[1]) {
                System.out.println(a + " " + b);
            } else {
                a=(abcd[0]+abcd[3])/2;
                b=abcd[3]-a;
                if ((a*b)==abcd[2] && (a/b)==abcd[1]) {
                    System.out.println(a + " " + b);
                } else {
                    a=(abcd[1]+abcd[2])/2;
                    b=abcd[2]-a;
                    if ((a*b)==abcd[3] && (a/b)==abcd[0]) {
                        System.out.println(a + " " + b);
                    } else {
                        a=(abcd[1]+abcd[3])/2;
                        b=abcd[3]-a;
                        if ((a*b)==abcd[2] && (a/b)==abcd[0]) {
                            System.out.println(a + " " + b);
                        } else {
                            System.out.println(-1 + " " + -1);
                        }
                    }
                }
            }
            t--;
        }
    }
}
