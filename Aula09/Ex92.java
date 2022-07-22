import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex92 {
    public static void main(String[] args) {
        System.out.println("Collection\t1000\t5000\t10000\t20000\t40000\t100000");
        System.out.print(" \nArrayList");
        Collection<Integer> al= new ArrayList<>(); 
        double[] AL1000 = checkPerformance(al, 1000);
        double[] AL5000 = checkPerformance(al, 5000);
        double[] AL10000 = checkPerformance(al, 10000);
        double[] AL20000 = checkPerformance(al, 20000);
        double[] AL40000 = checkPerformance(al, 40000);
        double[] AL100000 = checkPerformance(al, 100000);

        System.out.printf("\nadd\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", AL1000[0], AL5000[0], AL10000[0], AL20000[0], AL40000[0], AL100000[0]);
        System.out.printf("\nsearch\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", AL1000[2], AL5000[2], AL10000[2], AL20000[2], AL40000[2], AL100000[2]);
        System.out.printf("\nremove\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", AL1000[1], AL5000[1], AL10000[1], AL20000[1], AL40000[1], AL100000[1]);
        System.out.print("\n\nLinkedList");

        Collection<Integer> ll= new LinkedList<>(); 
        double[] LL1000 = checkPerformance(ll, 1000);
        double[] LL5000 = checkPerformance(ll, 5000);
        double[] LL10000 = checkPerformance(ll, 10000);
        double[] LL20000 = checkPerformance(ll, 20000);
        double[] LL40000 = checkPerformance(ll, 40000);
        double[] LL100000 = checkPerformance(ll, 100000);

        System.out.printf("\nadd\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", LL1000[0], LL5000[0], LL10000[0], LL20000[0], LL40000[0], LL100000[0]);
        System.out.printf("\nsearch\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", LL1000[2], LL5000[2], LL10000[2], LL20000[2], LL40000[2], LL100000[2]);
        System.out.printf("\nremove\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", LL1000[1], LL5000[1], LL10000[1], LL20000[1], LL40000[1], LL100000[1]);
        System.out.print("\n\nHashSet");

        Collection<Integer> hs= new HashSet<>(); 
        double[] HS1000 = checkPerformance(hs, 1000);
        double[] HS5000 = checkPerformance(hs, 5000);
        double[] HS10000 = checkPerformance(hs, 10000);
        double[] HS20000 = checkPerformance(hs, 20000);
        double[] HS40000 = checkPerformance(hs, 40000);
        double[] HS100000 = checkPerformance(hs, 100000);

        System.out.printf("\nadd\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", HS1000[0], HS5000[0], HS10000[0], HS20000[0], HS40000[0], HS100000[0]);
        System.out.printf("\nsearch\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", HS1000[2], HS5000[2], HS10000[2], HS20000[2], HS40000[2], HS100000[2]);
        System.out.printf("\nremove\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", HS1000[1], HS5000[1], HS10000[1], HS20000[1], HS40000[1], HS100000[1]);
        System.out.print("\n\nTreeSet");

        Collection<Integer> ts = new TreeSet<>(); 
        double[] TS1000 = checkPerformance(ts, 1000);
        double[] TS5000 = checkPerformance(ts, 5000);
        double[] TS10000 = checkPerformance(ts, 10000);
        double[] TS20000 = checkPerformance(ts, 20000);
        double[] TS40000 = checkPerformance(ts, 40000);
        double[] TS100000 = checkPerformance(ts, 100000);

        System.out.printf("\nadd\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", TS1000[0], TS5000[0], TS10000[0], TS20000[0], TS40000[0], TS100000[0]);
        System.out.printf("\nsearch\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", TS1000[2], TS5000[2], TS10000[2], TS20000[2], TS40000[2], TS100000[2]);
        System.out.printf("\nremove\t\t%4.1f%8.1f%9.1f%8.1f%8.1f%9.1f", TS1000[1], TS5000[1], TS10000[1], TS20000[1], TS40000[1], TS100000[1]);
        System.out.print("\n\nTreeSet");
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta, add, remove, search;
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        add = delta;
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                continue;
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        search = delta;
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        remove = delta;

        return new double[]{add, remove, search};
    }
}
