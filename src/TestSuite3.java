public class TestSuite3 {
        public static void test1(){
            // Start the timer
            Timer.startTimer();

            int numObjects = 1;
            int numLoops = 100000000;

            SimpleLinkedList firstElem;
            SimpleLinkedList currElem;

            for(int i = 0; i<numLoops; i++){
                firstElem = new SimpleLinkedList();
                currElem = firstElem;
                for(int j = 0; j<numObjects; j++){
                    SimpleLinkedList nextElem = new SimpleLinkedList();
                    currElem.setNext(nextElem);
                    currElem = nextElem;
                }
            }

            // Stop the timer and calculate the elapsed time
            double elapsedMillis = Timer.getTimeSeconds();

            // Print the results
            System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
        }

    public static void test2(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10;
        int numLoops = 10000000;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test3(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100;
        int numLoops = 1000000;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test4(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1000;
        int numLoops = 100000;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test5(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10000;
        int numLoops = 10000;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test6(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100000;
        int numLoops = 1000;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test7(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1000000;
        int numLoops = 100;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;
        Runtime gfg = Runtime.getRuntime();
        for(int i = 0; i<numLoops; i++){
            System.out.println(gfg.maxMemory()-gfg.freeMemory());
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
            System.out.println(gfg.maxMemory()-gfg.freeMemory());
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test8(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10000000;
        int numLoops = 10;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }
    public static void test9(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100000000;
        int numLoops = 1;

        SimpleLinkedList firstElem;
        SimpleLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new SimpleLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                SimpleLinkedList nextElem = new SimpleLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

}
