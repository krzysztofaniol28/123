/**
 * Created by Homo superior on 2016-11-28.
 */
public class Net {

    private double learningRate = 0.1;
    private double training[][];
    private Neuron neuron;


    public Net(int numberOfInput, double trainingdata[][], double rate) {
        neuron = new Neuron(numberOfInput);
        training = trainingdata;
        learningRate = rate;
    }

    public void training() {
        for (int i = 0; i < training.length; i++) {
            double inputs[] = training[i];
            double output = neuron.getOutput(inputs,learningRate);
            //Update all the neurons
            neuron.updateWeightHebb(inputs,output,learningRate);
        }
    }
    public void testing (double[] inputs){
        System.out.println(neuron.getOutput(inputs,learningRate));
    }
}
