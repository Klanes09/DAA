import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Analysis {
    public static void main(String[] args) {
        System.out.println("Running Data Structure Analysis...");

        int[] inputSizes = {100, 1000, 10000, 100000};

        for (int size : inputSizes) {
            System.out.println("\n===============================");
            System.out.println("[DEBUG] Running Tests with Input Size: " + size);
            System.out.println("===============================\n");
            System.out.flush();
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            List<String> results = new ArrayList<>();
            results.add(runTest(new BinaryT(), "BinaryTrees", size));
            results.add(runTest(new Graphs(), "Graphs", size));
            results.add(runTest(new Max(), "HeapMax", size));
            results.add(runTest(new Min(), "HeapMin", size));
            results.add(runTest(new LinCircular(), "Circular", size));
            results.add(runTest(new LinDoubly(), "Doubly", size));
            results.add(runTest(new LinSingly(), "Singly", size));
            results.add(runTest(new PrioQue(), "PriorityQue", size));
            results.add(runTest(new Que(), "SimpleQueue", size));
            results.add(runTest(new STKS(), "Stacks", size));
        
            System.out.println("\n========= PERFORMANCE RESULTS =========");
            System.out.println("Input Size: " + size);
            for (String res : results) {
                System.out.println(res);
            }
            System.out.println("========================================\n");
            System.out.println("[DEBUG] COMPLETED Tests with Input Size: " + size);
            System.out.flush();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Data Structure Analysis Completed.");
    }

    private static String runTest(Object ds, String className, int size) {
        try {
            System.out.println("[DEBUG] Starting " + className + " with size " + size);
            System.out.flush();
    
            long startTime = System.nanoTime();
    
            if (ds instanceof BinaryT) ((BinaryT) ds).runBinaryT(size);
            else if (ds instanceof LinCircular) ((LinCircular) ds).runCircular(size);
            else if (ds instanceof LinDoubly) ((LinDoubly) ds).runDoubly(size);
            else if (ds instanceof LinSingly) ((LinSingly) ds).runSingly(size);
            else if (ds instanceof PrioQue) ((PrioQue) ds).runPriorityQue(size);
            else if (ds instanceof STKS) ((STKS) ds).runSTKS(size);
            else if (ds instanceof Que) ((Que) ds).runQueue(size);
            else if (ds instanceof Graphs) ((Graphs) ds).runGraphs(size);
            else if (ds instanceof Max) ((Max) ds).runMax(size);
            else if (ds instanceof Min) ((Min) ds).runMin(size);
            else {
                System.out.println("[ERROR] Unknown data structure: " + ds.getClass().getName());
                return "---------------------------------------------------\nClass: " + className + "\n[ERROR] Test failed.\n---------------------------------------------------";
            }
    
            long endTime = System.nanoTime();
            double executionTime = (endTime - startTime) / 1_000_000.0;
            long memoryUsed = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
            
            System.out.println("[DEBUG] Finished " + className + " with size " + size);
            System.out.flush();
    
            return String.format(
                    "---------------------------------------------------\n" +
                    "Class: %s\nExecution Time: %.4f ms\nMemory Used: %.4f KB\n",
                    className, executionTime, (double) memoryUsed
            );
    
        } catch (Throwable e) {
            System.out.println("[ERROR] Failed: " + className + " with size " + size);
            e.printStackTrace();
            return "---------------------------------------------------\nClass: " + className + "\n[ERROR] Test failed.\n---------------------------------------------------";
        }
    }
}
