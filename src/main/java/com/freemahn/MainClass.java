package com.freemahn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Pavel Gordon
 */
public class MainClass
{

    /**
     * Given Iterable<Integer>, returns a List of n maximum numbers from it.
     * <p>
     * Example: max([1, 5, 6, 4, 2], 2) = [5, 6]
     * <p>
     * The order of returned items is not important.
     */
    public static List<Integer> max(Iterable<Integer> numbers, int n)
    {

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (Integer number : numbers)
        {
            treeSet.add(number);
            if (treeSet.size() > n)
            {
                treeSet.pollFirst();
            }
        }

        return new ArrayList<>(treeSet);

    }


    /**
     * Given Iterable<Integer>, returns a List of n median numbers from it.
     * 'Median' here means that in the original list, there is equal count of numbers higher and lower than selected group.
     * <p>
     * Example: mid([11, 6, 19, 3, 8, 22, 9], 3) = [8, 9, 11]
     * <p>
     * Guaranteed constraints:
     * 1. (numbers - n) % 2 == 0
     * 2. All numbers in the input list are different.
     * <p>
     * The order of returned items is not important.
     */
    public static List<Integer> mid(Iterable<Integer> numbers, int n)
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Iterator<Integer> iterator = numbers.iterator();
        for (int i = 0; i < n; i++)
        {
            treeSet.add(iterator.next());

        }
        while (iterator.hasNext())
        {
            int a = iterator.next();
            int b = iterator.next();

            treeSet.add(a);
            treeSet.add(b);
            treeSet.pollFirst();
            treeSet.pollLast();
        }
        return new ArrayList<>(treeSet);

    }


    public static void main(String[] args)
    {

        System.out.println("Nothing to see here, run tests,");
    }

}
