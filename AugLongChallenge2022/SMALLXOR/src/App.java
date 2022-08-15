import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t--!=0) {
            String argus[]=br.readLine().split(" ");
            int n=Integer.parseInt(argus[0]);
            int x=Integer.parseInt(argus[1]);
            int y=Integer.parseInt(argus[2]);
            PriorityQueue<Integer> array= new PriorityQueue<Integer>(Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
            while (y>0) {
                int smallest=array.peek();
                int xor=smallest^x;
                if (xor>smallest) {
                    array.remove();
                    array.add(xor);
                    y--;
                } else {
                    if ((y&1)==0) {
                        break;
                    } else {
                        array.remove();
                        array.add(xor);
                        break;
                    }
                }
            }
            while (!array.isEmpty()) {
                System.out.print(array.remove()+" ");
            }
            System.out.println();
        }
    }
}
