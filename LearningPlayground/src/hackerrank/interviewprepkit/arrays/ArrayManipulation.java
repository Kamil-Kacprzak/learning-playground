package hackerrank.interviewprepkit.arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

	//TODO: Many tests failed
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
    	int result = -1;
    	
    	int[] resultArr = new int[n];
    	Arrays.fill(resultArr, 0);
    	
    	for(int i = 0; i < queries.length; i++ ) {
    		for(int j = queries[i][0]-1; j <queries[i][1]; j++) {
    			resultArr[j] += queries[i][2];
    		}
    	}

    	Arrays.sort(resultArr);
    	result = resultArr[resultArr.length-1];
    	
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        //Size of array
        int n = Integer.parseInt(nm[0]);
        //Number of commands
        int m = Integer.parseInt(nm[1]);
        
        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
