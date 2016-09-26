import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mirza on 23.09.2016.
 */
public class Task5 {
    StreamTokenizer in;
    int nextInt() throws IOException {
        in.nextToken();
        return (int)in.nval;
    }

    String next() throws IOException {
        in.nextToken();
        return in.sval;
    }


    public static void main(String[] args) throws Exception {
        new Task5().run();
    }

    public class Gnome implements Comparable{
        int num;
        int a;
        int b;
        int sum;

        public Gnome(int num, int a, int b) {
            this.num = num;
            this.sum = a + b;
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Object o) {
            Gnome gnome = (Gnome) o;
            if(sum > gnome.sum)
                return 1;
            if(sum < gnome.sum)
                return -1;
            return 0;
        }
    }

    public void run() throws Exception{
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int n = nextInt();
        Gnome[] arr = new Gnome[n];
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = nextInt();
        }
        for (int i = 0; i < n; i++) {
            int aa = a[i];
            int bb = b[i];
            arr[i] = new Gnome(i,aa,bb);
        }
        Arrays.sort(arr);
        boolean ok = true;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i].b <= sum)
                ok = false;
            sum += arr[i].a;
        }
        if(ok)
            for (int i = n-1; i >= 0 ; i--) {
                out.print((arr[i].num + 1) + " ");
            }
        else out.print(-1);
        out.close();
    }
}
