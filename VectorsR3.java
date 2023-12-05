public class VectorsR3 implements VectorOperations {

    @Override
    public double[] addVectors(double[] vector1, double[] vector2) {
        double[] result = new double[3];
        result[0] = vector1[0] + vector2[0];
        result[1] = vector1[1] + vector2[1];
        result[2] = vector1[2] + vector2[2];
        return result;
    }

    @Override
    public double[] subtractVectors(double[] vector1, double[] vector2) {
        double[] result = new double[3];
        result[0] = vector1[0] - vector2[0];
        result[1] = vector1[1] - vector2[1];
        result[2] = vector1[2] - vector2[2];
        return result;
    }

    @Override
    public double[] scalarMultiply(double[] vector, double scalar) {
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = vector[i] * scalar;
        }
        return result;
    }

    @Override
    public double dotProduct(double[] v1, double[] v2) {
        double result = 0.0;
        for (int i = 0; i < 3; i++) {
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
        double[] result = new double[3];
        result[0] = (v1[1] * v2[2]) - (v1[2] * v2[1]);
        result[1] = (v1[2] * v2[0]) - (v1[0] * v2[2]);
        result[2] = (v1[0] * v2[1]) - (v1[1] * v2[0]);
        return result;
    }
}