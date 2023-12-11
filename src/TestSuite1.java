import java.util.ArrayList;

public class TestSuite1 {
    public static void test1() {
        // Start the timer
        Timer.startTimer();

        // Number of objects to create
        int numObjects = 1;
        int numLoops = 1000000000;


        // run loop 10 times
        for(int i = 0; i<numLoops; i++){
            TestObject[] arrOfTestObj = new TestObject[numObjects];

            // Create and discard short-lived objects (young generation)
            for (int j = 0; j < numObjects; j++) {
                arrOfTestObj[j] = new TestObject();

            }
            arrOfTestObj = null;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();
        // Print the results
        System.out.println("Time taken for " + numObjects + " objects to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test2() {
        // Start the timer
        Timer.startTimer();

        // Number of objects to create
        int numObjects = 100;
        int numLoops = 10000000;


        // run loop 10 times
        for(int i = 0; i<numLoops; i++){
            TestObject[] arrOfTestObj = new TestObject[numObjects];

            // Create and discard short-lived objects (young generation)
            for (int j = 0; j < numObjects; j++) {
                arrOfTestObj[j] = new TestObject();

            }
            arrOfTestObj = null;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();
        // Print the results
        System.out.println("Time taken for " + numObjects + " objects to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test3() {
        // Start the timer
        Timer.startTimer();

        // Number of objects to create
        int numObjects = 10000;
        int numLoops = 100000;


        // run loop 10 times
        for(int i = 0; i<numLoops; i++){
            TestObject[] arrOfTestObj = new TestObject[numObjects];

            // Create and discard short-lived objects (young generation)
            for (int j = 0; j < numObjects; j++) {
                arrOfTestObj[j] = new TestObject();

            }
            arrOfTestObj = null;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();
        // Print the results
        System.out.println("Time taken for " + numObjects + " objects to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test4() {
        // Start the timer
        Timer.startTimer();

        // Number of objects to create
        int numObjects = 100000;
        int numLoops = 10000;


        // run loop 10 times
        for(int i = 0; i<numLoops; i++){
            TestObject[] arrOfTestObj = new TestObject[numObjects];

            // Create and discard short-lived objects (young generation)
            for (int j = 0; j < numObjects; j++) {
                arrOfTestObj[j] = new TestObject();

            }
            arrOfTestObj = null;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();
        // Print the results
        System.out.println("Time taken for " + numObjects + " objects to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test5() {
        // Start the timer
        Timer.startTimer();

        // Number of objects to create
        int numObjects = 1000000;
        int numLoops = 1000;


        for(int i = 0; i<numLoops; i++){
            TestObject[] arrOfTestObj = new TestObject[numObjects];

            // Create and discard short-lived objects (young generation)
            for (int j = 0; j < numObjects; j++) {
                arrOfTestObj[j] = new TestObject();

            }
            arrOfTestObj = null;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();
        // Print the results
        System.out.println("Time taken for " + numObjects + " objects to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test6() {
        // Start the timer
        Timer.startTimer();

        // Number of objects to create
        int numObjects = 10000000;
        int numLoops = 100;

//        Runtime gfg = Runtime.getRuntime();
        for(int i = 0; i<numLoops; i++){
//            System.out.println(gfg.maxMemory()-gfg.freeMemory());
            TestObject[] arrOfTestObj = new TestObject[numObjects];

            // Create and discard short-lived objects (young generation)
            for (int j = 0; j < numObjects; j++) {
                arrOfTestObj[j] = new TestObject();

            }
            arrOfTestObj = null;
//            System.out.println(gfg.maxMemory()-gfg.freeMemory());
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " objects to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test7() {
        // Start the timer
        Timer.startTimer();

        // Number of objects to create
        int numObjects = 1000000000;
        int numLoops = 1;

        for(int i = 0; i<numLoops; i++){
            TestObject[] arrOfTestObj = new TestObject[numObjects/100];

            // Create and discard short-lived objects (young generation)
            for (int j = 0; j < numObjects; j++) {
                arrOfTestObj[j%100] = new TestObject();

            }
            arrOfTestObj = null;
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " objects to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
}
