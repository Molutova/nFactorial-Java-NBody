public class NBody {
    public static void main(String[] args) {
        double total = Double.parseDouble(args[0]);
        double delta = Double.parseDouble(args[1]);

        // StdOut.print(total)
        //  StdOut.print(delta);

        int planet = StdIn.readInt();
        double radius = StdIn.readDouble();
        double[] px = new double[planet];
        double[] py = new double[planet];
        double[] vx = new double[planet];
        double[] vy = new double[planet];
        double[] mass = new double[planet];
        String[] image = new String[planet];

        for (int i = 0; i < planet; i++) {
            px[i] = StdIn.readDouble();
            py[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            image[i] = StdIn.readString();
        }
        
    }
}
