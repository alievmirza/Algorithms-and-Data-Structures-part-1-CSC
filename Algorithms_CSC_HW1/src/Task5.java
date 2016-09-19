import java.io.*;

/**
 * Created by mirza on 16.09.2016.
 */
public class Task5 {
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
        new Task5().run();
    }


    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int[] a = new int[15001];
        int n = nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(a[nextInt()]++ == 0)
                ans++;

        }
        out.print(15000 - ans);
        out.close();
    }
}
