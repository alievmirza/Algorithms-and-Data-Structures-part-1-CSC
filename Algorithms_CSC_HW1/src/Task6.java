import java.io.*;

/**
 * Created by mirza on 16.09.2016.
 */
public class Task6 {
    StreamTokenizer in;
    int nextInt() throws IOException {
        in.nextToken();
        return (int)in.nval;
    }
    long nextLong() throws IOException {
        in.nextToken();
        return (long)in.nval;
    }
    String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    static public void main(String[] args) throws Exception {
        new Task6().run();
    }


    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int t = nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = nextInt();
        }
        for (int i = 0; i < t; i++) {
            //long startTime = System.currentTimeMillis();
            int n = arr[i];
            if(n == 1) out.println(0);
            else{
                int x = (int) Math.sqrt(n);
                int sum = 0;
                int b = x;
                for (int a = 1; a <= x ; a++) {
                    int t1 = a*a;
                    while (t1 + b*b > n) b--;
                    if(t1 + b*b == n && b != 0) sum++;
                }
                out.println(sum);
            }
            //long endTime   = System.currentTimeMillis();
            ///long totalTime = endTime - startTime;
            //System.out.println(totalTime);
        }

        out.close();
    }

}
