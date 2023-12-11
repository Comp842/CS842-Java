public class TestSuite2 {

    private static int numAssignments = 10000000;
    public static void test1(){
//        Runtime gfg = Runtime.getRuntime();
        for (int j = 0; j < 100; j++) {

//            System.out.println(gfg.maxMemory() - gfg.freeMemory());
            Integer value;

            // Start the timer
            Timer.startTimer();

            // Perform the assignments
            for (int i = 0; i < numAssignments; i++) {
                value = i;
            }
//            System.out.println(gfg.maxMemory() - gfg.freeMemory());
        }

            // Stop the timer and calculate the elapsed time
            double elapsedMillis = Timer.getTimeSeconds();
            // Print the results
            System.out.println("Time taken for " + numAssignments + " int assignments: " + elapsedMillis + " seconds");


    }

    public static void test2(){
        Integer value2;

        // Start the timer
        Timer.startTimer();

        // Perform the assignments
        for (int i = 0; i < numAssignments; i++) {
            value2 = i;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numAssignments + " Integer assignments: " + elapsedMillis + " seconds");
    }

    public static void test3(){
        int value;
        int[] valueArr = new int[numAssignments];

        // Start the timer
        Timer.startTimer();

        // Perform the assignments
        for (int i = 0; i < numAssignments; i++) {
            value = i;
            valueArr[i] = value;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numAssignments + " int assignments stored in array: " + elapsedMillis + " seconds");
    }

    public static void test4(){
        Integer value;
        Integer[] valueArr = new Integer[numAssignments/4];

        // Start the timer
        Timer.startTimer();

        // Perform the assignments
        for (int i = 0; i < numAssignments; i++) {
            value = i;
            valueArr[i%4] = value;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numAssignments + " Integer assignments stored in array: " + elapsedMillis + " seconds");
    }

    public static void test5(){
        double value;

        // Start the timer
        Timer.startTimer();

        // Perform the assignments
        for (int i = 0; i < numAssignments; i++) {
            value = i;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numAssignments + " double assignments: " + elapsedMillis + " seconds");
    }

    public static void test6(){
        Double value2;

        // Start the timer
        Timer.startTimer();

        // Perform the assignments
        for (int i = 0; i < numAssignments; i++) {
            value2 = (double) i;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numAssignments + " Double assignments: " + elapsedMillis + " seconds");
    }

    public static void test7(){
        double value;
        double[] valueArr = new double[numAssignments/4];

        // Start the timer
        Timer.startTimer();

        // Perform the assignments
        for (int i = 0; i < numAssignments; i++) {
            value = i;
            valueArr[i%4] = value;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numAssignments + " double assignments stored in array: " + elapsedMillis + " seconds");
    }

    public static void test8(){
        Double value;
        Double[] valueArr = new Double[numAssignments/4];

        // Start the timer
        Timer.startTimer();

        // Perform the assignments
        for (int i = 0; i < numAssignments; i++) {
            value = (double) i;
            valueArr[i%4] = value;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numAssignments + " pointer assignments stored in array: " + elapsedMillis + " seconds");
    }
}
