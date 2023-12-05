public class DataSet {

    protected static double[] a;
    protected static double[] b;
    protected static double[] c;

    protected static double[] u;
    protected static double[] v;
    protected static double[] w;
    protected static double[] p;


    protected DataSet(){
        this.a = new double[] {3, 3};
        this.b = new double[] {1, 4};
        this.c = new double[] {4, 7};

        this.u = new double[] {3,3,2};
        this.v = new double[] {1,4,4};
        this.w = new double[] {4,7,5};
        this.p = new double[] {4,3,-5};
    }

    public static double[] getA() {
        return a;
    }

    public static double[] getB() {
        return b;
    }

    public static double[] getC() {
        return c;
    }

    public static double[] getP() {
        return p;
    }

    public static double[] getU() {
        return u;
    }

    public static double[] getV() {
        return v;
    }

    public static void setA(double[] a) {
        DataSet.a = a;
    }

    public static void setB(double[] b) {
        DataSet.b = b;
    }

    public static void setC(double[] c) {
        DataSet.c = c;
    }

    public static void setP(double[] p) {
        DataSet.p = p;
    }

    public static void setU(double[] u) {
        DataSet.u = u;
    }

    public static void setV(double[] v) {
        DataSet.v = v;
    }

    public static double[] getW() {
        return w;
    }
}
