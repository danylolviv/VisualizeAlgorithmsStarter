package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;
import visualizealgorithms.bll.algorithm.IAlgorithm;

public class BubbleSort extends GenericAlgorithm {


    public BubbleSort() {
        super("BubbleSort", "Slow O(N^2) sorting algorithm", AlgorithmType.SORTING );
    }

    @Override
    public void doWork() {

        int []b = (int[]) super.getData();

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if(b[j] < b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
    }
}
