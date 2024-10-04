package upt_LP.First_Mav_Proj;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        double[] values = new double[] {65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }
        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();
        double max = descriptiveStatistics.getMax();
        double min = descriptiveStatistics.getMin();
        System.out.println("mean = "+ mean);
        System.out.printf("Mean formatted with 2 decimal places: %.2f%n",mean);
        System.out.println("median = "+ median);
        System.out.println("standard Deviation= "+ standardDeviation);
        System.out.printf("Standard Deviation formatted with 2 decimal places: %.2f%n",standardDeviation);
        System.out.println("min ="+ min);
        System.out.println("max = "+ max);
            
    }
}
