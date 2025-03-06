public class Split {
    public static void main(String[] args) {
        String name = args[0];
        int n = Integer.parseInt(args[1]);
        String delimiter = args[2];

        Out[] out = new Out[n];
        for (int i = 0; i < n; i++) {
            out[i] = new Out(name + i);
        }

        In in = new In(name + ".csv");
        while (in.hasNextLine()) {
            String line = in.readLine();
            String[] fields = line.split(delimiter);
            for (int i = 0; i < n; i++) {
                out[i].println(fields[i]);
            }
        }
    }
}
