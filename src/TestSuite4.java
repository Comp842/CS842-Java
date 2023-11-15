public class TestSuite4 {
        public static void test1(){
            // Start the timer
            Timer.startTimer();

            int numObjects = 1;
            int numLoops = 100000000;

            AdvancedLinkedList firstElem;
            AdvancedLinkedList currElem;

            for(int i = 0; i<numLoops; i++){
                firstElem = new AdvancedLinkedList();
                currElem = firstElem;
                for(int j = 0; j<numObjects; j++){
                    AdvancedLinkedList nextElem = new AdvancedLinkedList();
                    currElem.setNext(nextElem);
                    currElem = nextElem;
                }
            }

            // Stop the timer and calculate the elapsed time
            double elapsedMillis = Timer.getTimeSeconds();

            // Print the results
            System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
        }

    public static void test2(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10;
        int numLoops = 10000000;

        AdvancedLinkedList firstElem;
        AdvancedLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new AdvancedLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                AdvancedLinkedList nextElem = new AdvancedLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test3(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100;
        int numLoops = 1000000;

        AdvancedLinkedList firstElem;
        AdvancedLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new AdvancedLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                AdvancedLinkedList nextElem = new AdvancedLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test4(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1000;
        int numLoops = 100000;

        AdvancedLinkedList firstElem;
        AdvancedLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new AdvancedLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                AdvancedLinkedList nextElem = new AdvancedLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test5(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10000;
        int numLoops = 10000;

        AdvancedLinkedList firstElem;
        AdvancedLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new AdvancedLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                AdvancedLinkedList nextElem = new AdvancedLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test6(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 100000;
        int numLoops = 1000;

        AdvancedLinkedList firstElem;
        AdvancedLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new AdvancedLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                AdvancedLinkedList nextElem = new AdvancedLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test7(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 1000000;
        int numLoops = 100;

        AdvancedLinkedList firstElem;
        AdvancedLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new AdvancedLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                AdvancedLinkedList nextElem = new AdvancedLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

    public static void test8(){
        // Start the timer
        Timer.startTimer();

        int numObjects = 10000000;
        int numLoops = 10;

        AdvancedLinkedList firstElem;
        AdvancedLinkedList currElem;

        for(int i = 0; i<numLoops; i++){
            firstElem = new AdvancedLinkedList();
            currElem = firstElem;
            for(int j = 0; j<numObjects; j++){
                AdvancedLinkedList nextElem = new AdvancedLinkedList();
                currElem.setNext(nextElem);
                currElem = nextElem;
            }
        }

        // Stop the timer and calculate the elapsed time
        double elapsedMillis = Timer.getTimeSeconds();

        // Print the results
        System.out.println("Time taken for " + numObjects + " advanced linked lists to be created "+numLoops+" times: " + elapsedMillis + " seconds");
    }

}
