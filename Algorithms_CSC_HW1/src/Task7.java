import java.io.*;

/**
 * Created by mirza on 17.09.2016.
 */
public class Task7 {
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
        new Task7().run();
    }


    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);

        long n = nextLong();
        long min = 100000000000000L;
        long ansA=1;
        long ansB=1;
        long ansC=n;
        //out.println(Math.pow(n, 1D/3D));
        for (long a = 1; a <= Math.cbrt(n); a++) {
            if(n%a == 0){
                for (long b = a; b <= Math.sqrt(n/a) ; b++) {
                    if((n/a)%b == 0) {
                        long c = n / b / a;
                        long t = a * b + b * c + a * c;
                        if (t < min) {
                            min = t;
                            ansA = a;
                            ansB = b;
                            ansC = c;
                        }
                    }
                }
            }
        }
        out.print(2*( ansA * ansB + ansB * ansC + ansA * ansC)+" "+ansA+" "+ansB+" "+ansC);
        out.close();
    }
}
