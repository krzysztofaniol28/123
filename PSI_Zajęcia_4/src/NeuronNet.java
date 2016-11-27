/**
 * Created by Homo superior on 2016-11-28.
 */
public class NeuronNet {
    public static void main(String a[]) {
        double tranning[][]={{1,1,-1,1,-1,-1}};
        Net net = new Net(6,tranning,0.1);
        net.training();
        for(int i=0;i<50;i++) {
            net.training();
            net.testing(new double[]{1,1,-1,1,-1,-1});
            net.testing(new double[]{1,1,-1,1,1,-1});
            net.testing(new double[]{1,-1,-1,-1,-1,1});
            net.testing(new double[]{-1,-1,1,-1,1,1});

            System.out.println("\n\n");
        }
    }
}
