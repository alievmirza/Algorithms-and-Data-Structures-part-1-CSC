import java.io.*;
import java.util.Arrays;

/**
 * Created by mirza on 21.09.2016.
 */
public class Task2 {
    StreamTokenizer in;
    int nextInt() throws IOException {
        in.nextToken();
        return (int)in.nval;
    }

    String next() throws IOException {
        in.nextToken();
        return in.sval;
    }

    static public void main(String[] args) throws Exception {
        new Task2().run();
    }

    public class Task implements Comparable {
        public int num;
        public int solved;
        public int time;

        public Task(int num, int solved, int time) {
            this.num = num;
            this.solved = solved;
            this.time = time;
        }

        @Override
        public int compareTo(Object o) {
            Task2.Task task = (Task2.Task) o;
            if(solved > task.solved)
                return -1;
            if (solved < task.solved)
                    return 1;
            if (solved == task.solved){
                if(time > task.time)
                    return 1;
                if(time < task.time)
                    return -1;
                if(time == task.time){
                    if(num > task.num)
                        return 1;
                    if(num < task.num)
                        return -1;
                }
            }
            return 0;
        }
    }

    public void run() throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int n = nextInt();
        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            tasks[i] = new Task(i, nextInt(), nextInt());
        }
        Arrays.sort(tasks);
        for (int i = 0; i < n; i++) {
            out.print((tasks[i].num+1)+" ");
        }
        out.close();


    }


}
