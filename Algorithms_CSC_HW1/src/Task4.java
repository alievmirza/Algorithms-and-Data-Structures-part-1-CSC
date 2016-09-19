import java.io.*;

/**
 * Created by mirza on 16.09.2016.
 */
public class Task4 {
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
        new Task4().run();
    }

    int gcd(int a, int b, int[] xy){
        if(a == 0){
            xy[0] = 0;
            xy[1] = 1;
            return b;
        }
        int[] xy1 = new int[2];
        int d = gcd(b%a, a, xy1);
        xy[0] = xy1[1] - (b/a) * xy1[0];
        xy[1] = xy1[0];
        return d;
    }

    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int[] xy = new int[2];
        int a = nextInt();
        int b = nextInt();
        if(gcd(a,b,xy) != 1)
            out.print(0+" "+0);
        else
            out.print(xy[0]+" "+xy[1]);

        out.close();

    }

}
