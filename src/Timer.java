public class Timer {
    private static long startTime = 0;
    public static void startTimer(){
        startTime = System.nanoTime();
    }

    public static double getTimeSeconds(){
        long endTime = System.nanoTime();
        long elapsedNanos = endTime - startTime;
        return elapsedNanos/1000000000.0;
    }
}
