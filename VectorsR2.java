public class VectorsR2 implements VectorOperations {
    private double[] a;
    private double[] b;

    public VectorsR2(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double[] addVectors(double[] vector1, double[] vector2) {
        double[] result = new double[2];
        result[0] = vector1[0] + vector2[0];
        result[1] = vector1[1] + vector2[1];
        return result;
    }

    @Override
    public double[] subtractVectors(double[] vector1, double[] vector2) {
        double[] result = new double[2];
        result[0] = vector1[0] - vector2[0];
        result[1] = vector1[1] - vector2[1];
        return result;
    }

    @Override
    public double[] scalarMultiply(double[] vector, double scalar) {
        double[] result = new double[2];
        result[0] = vector[0] * scalar;
        result[1] = vector[1] * scalar;
        return result;
    }

    @Override
    public double dotProduct(double[] v1, double[] v2) {
        double result = 0.0;
        for (int i = 0; i < 2; i++) {
            result += v1[i] * v2[i];
        }
        return result;
    }

    @Override
    public double vectorLength(double[] vector) {
        double result = 0.0;
        for (double v : vector) {
            result += Math.pow(v, 2);
        }
        return Math.sqrt(result);

    }

    @Override
    public double[] crossProduct(double[] v1, double[] v2) {
        return new double[0];
    }
}
