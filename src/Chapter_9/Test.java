/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 17-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_9;

import java.util.Random;

public class Test {

    // This test class is before i used JUnit

    public static void main(String[] args) {

        // Test Opg 1
        System.out.println("Test 1 ( Opg.1 )");
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.println("Rectangle 1");
        rect1.DisplayData();
        System.out.println("Rectangle 2");
        rect2.DisplayData();
        // Input: 4, 40 && 3.5, 35.9
        // Expected output: 4, 40, 160, 88 && 3.5, 35.9, 125.65, 78.8
        // Actual output: 4, 40, 160, 88 && 3.5, 35.9, 125.65, 78.8

        System.out.println();
        // Test Opg 2
        System.out.println("Test 2 ( Opg.2 )");
        Stock oracle = new Stock("ORCL", "Oracle");
        System.out.println("Stock\n");
        oracle.previousClosingPrice = 34.5;
        oracle.currentPrice = 34.35;
        System.out.printf("Price change: %.2f %s", oracle.GetChangePercent(), "%");
        // Input: 34.5, 34.35
        // Expected output:
        // Actual output:

        System.out.println();
        // Test Opg 6
        Random rand = new Random();
        int[] arr = new int[100000];
        for (int index:arr) {
            arr[index] = rand.nextInt((100000 - 1) + 1) + 1;
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.Start();
        SelectionSort.sort(arr);
        stopWatch.Stop();
        String startTime = String.format("%1$TH:%1$TM:%1$TS", stopWatch.getStartTime());
        String endTime = String.format("%1$TH:%1$TM:%1$TS", stopWatch.getEndTime());
        System.out.printf("Start time: %s\nEnd tims: %s\nElapsed time: %d milliseconds", startTime, endTime, (stopWatch.GetElapsedTime()));

    }

}

// Required for Opg 6
class SelectionSort {

    public static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

}

