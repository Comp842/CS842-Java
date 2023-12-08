import java.util.TreeSet;

public class TestSuite5 {

    public static void test1(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1;
        int numLoops = 1000000000;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test2(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10;
        int numLoops = 100000000;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test3(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100;
        int numLoops = 10000000;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test4(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1000;
        int numLoops = 1000000;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test5(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10000;
        int numLoops = 100000;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test6(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100000;
        int numLoops = 10000;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test7(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1000000;
        int numLoops = 1000;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test8(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10000000;
        int numLoops = 100;

        Runtime gfg = Runtime.getRuntime();

        for(int i = 0; i<numLoops; i++){
            System.out.println(gfg.maxMemory()-gfg.freeMemory());
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
            System.out.println(gfg.maxMemory()-gfg.freeMemory());
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test9(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100000000;
        int numLoops = 10;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test10(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1000000000;
        int numLoops = 1;

        for(int i = 0; i<numLoops; i++){
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j = 0; j<numObjects; j++){
                ts.add(i);
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " TreeSet to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
}
