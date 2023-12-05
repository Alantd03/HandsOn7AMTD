public class Main {

    private static void print(double[] vector) {
        if (vector.length == 2) {
            System.out.println(" [" + vector[0] + ", " + vector[1] + "]");
        } else if (vector.length == 3) {
            System.out.println(" [" + vector[0] + ", " + vector[1] + ", " + vector[2] + "]");
        }
    }

    public static void main(String[] args) {
        DataSet dataSet = new DataSet();
        VectorOperations vectorOperationsR3 = new VectorsR3();
        //Operaciones definidas--------------
        System.out.println("Vectores:");
        System.out.println("A: ");
        print(dataSet.getA());
        System.out.println("B: ");
        print(dataSet.getB());
        System.out.println("C: ");
        System.out.println("Escalares:");
        print(dataSet.getC());
        System.out.println("U: ");
        print(dataSet.getU());
        System.out.println("V: ");
        print(dataSet.getV());
        System.out.println("W: ");
        print(dataSet.getW());
        System.out.println("P: ");
        print(dataSet.getP());


        // R2---------------------------
        System.out.println("\nOperaciones en R2: ");
        VectorOperations vectorOperationsR2 = new VectorsR2(dataSet.getA(), dataSet.getB());



        double[] sumAB = vectorOperationsR2.addVectors(dataSet.getA(), dataSet.getB());
        System.out.print("A + B = ");
        print(sumAB);

        double[] subtractAB = vectorOperationsR2.subtractVectors(dataSet.getA(), dataSet.getB());
        System.out.print("A - B = ");
        print(subtractAB);

        double[] scalarMultiplyAC = vectorOperationsR2.scalarMultiply(
                vectorOperationsR2.addVectors(dataSet.getA(), dataSet.getC()), 7);
        System.out.print("7 * (A + C) = ");
        print(scalarMultiplyAC);

        double[] set = vectorOperationsR2.scalarMultiply(
                vectorOperationsR2.addVectors(dataSet.getA(), dataSet.getB()), 7);
        double[] subtractSetC = vectorOperationsR2.subtractVectors(set, dataSet.getC());
        System.out.print("[7 * (A + B)] - C = ");
        print(subtractSetC);

        double[] sum4A5B = vectorOperationsR2.addVectors(
                vectorOperationsR2.scalarMultiply(dataSet.getA(), 4),
                vectorOperationsR2.scalarMultiply(dataSet.getB(), 5));
        double[] subtractSum4A5BC = vectorOperationsR2.subtractVectors(sum4A5B, dataSet.getC());
        System.out.print("(A * 4 + B * 5) - C = ");
        print(subtractSum4A5BC);

        double dotProductAB = vectorOperationsR2.dotProduct(dataSet.getA(), dataSet.getB());
        System.out.print("A * B = ");
        System.out.println(dotProductAB);

        set = vectorOperationsR2.addVectors(
                vectorOperationsR2.scalarMultiply(dataSet.getA(), 4),
                vectorOperationsR2.scalarMultiply(dataSet.getB(), 5));
        double lengthSetC = vectorOperationsR2.vectorLength(
                vectorOperationsR2.subtractVectors(set, dataSet.getC()));
        System.out.print("|| 4(A) + 5(B) - C || = ");
        System.out.println(lengthSetC);

        // R3--------------------------------------------------------------
        System.out.println("\nOperaciones en R3: ");


        double[] sumUV = vectorOperationsR3.addVectors(dataSet.getU(), dataSet.getV());
        System.out.print("U + V = ");
        print(sumUV);

        double[] subtractUV = vectorOperationsR3.subtractVectors(dataSet.getU(), dataSet.getV());
        System.out.print("U - V = ");
        print(subtractUV);

        double[] scalarMultiplyU4 = vectorOperationsR3.scalarMultiply(dataSet.getU(), 4);
        System.out.print("U * 4 = ");
        print(scalarMultiplyU4);

        double dotProductUV = vectorOperationsR3.dotProduct(dataSet.getU(), dataSet.getV());
        System.out.print("U * V = ");
        System.out.println(dotProductUV);

        double[] crossProductUV = ((VectorsR3) vectorOperationsR3).crossProduct(dataSet.getU(), dataSet.getV());
        System.out.print("U x V = ");
        print(crossProductUV);

        System.out.println("R = ||[(4(U)*2(V))C] x W: ");
        double[] scalarMultiplyU4R3 = vectorOperationsR3.scalarMultiply(dataSet.getU(), 4);
        print(scalarMultiplyU4R3);

        double[] scalarMultiplyV2R3 = vectorOperationsR3.scalarMultiply(dataSet.getV(), 2);
        print(scalarMultiplyV2R3);

        double[] crossProductUVR3 = vectorOperationsR3.crossProduct(scalarMultiplyU4R3, scalarMultiplyV2R3);
        print(crossProductUVR3);

        double[] crossProductUVGR3 = vectorOperationsR3.crossProduct(crossProductUVR3, dataSet.getP());
        print(crossProductUVGR3);

        double[] crossProductUVGWR3 = vectorOperationsR3.crossProduct(crossProductUVGR3, dataSet.getW());
        print(crossProductUVGWR3);
    }
}
