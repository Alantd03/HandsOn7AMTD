public interface VectorOperations {

    double[] addVectors(double[] vector1, double[] vector2);

    double[] subtractVectors(double[] vector1, double[] vector2);

    double[] scalarMultiply(double[] vector, double scalar);

    double dotProduct(double[] v1, double[] v2);

    double vectorLength(double[] vector);

    double[] crossProduct(double[] v1, double[] v2);
}