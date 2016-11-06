import java.util.Random;

/**
 * Created by Homo superior on 2016-11-28.
 */
public class Neuron {
    private double w[];


    public Neuron(int numberOfW) {
        w = new double[numberOfW];
        Random random = new Random();
        for (int i = 0; i < numberOfW; i++)
            w[i] = random.nextDouble();
    }

    public double getOutput(double x[], double lR) {
        double a=0;
        for(int i=0;i<w.length;i++){
            a+=x[i]*w[i]*lR;
        }

        return Math.tanh(a);

    }

    public void updateWeightHebb(double[] x, double y, double lR) {
        for(int i=0;i<w.length;i++){
            w[i]+=lR*x[i]*y;
        }
    }
}
