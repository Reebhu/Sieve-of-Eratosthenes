package com.practice.seive_of_eratosthenes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Description.
 * @author INSERT USERNAME
 */
public class SieveOfEratosthenes
{
    public List<Integer> findPrimes(Integer range)
    {
        int numberList[] = new int[range - 1];
        Integer i;
        for (i = 0; i < range - 1; i++)
        {
            numberList[i] = i + 2;
        }
        List<Integer> primes = useSieveOfEratosthenes(numberList);
        return primes;
    }

    /**
     * @param primes
     * @return
     */
    private List<Integer> useSieveOfEratosthenes(int[] numberList)
    {
        int length = numberList.length;
        boolean sieveOfEratosthenes[] = new boolean[length];
        Arrays.fill(sieveOfEratosthenes, true);
        int outer = 0;
        int inner = 0;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i*i < length; i++)
        {
            outer++;
            if (sieveOfEratosthenes[(i - 2)])
            {
                for (int j = i *2; j <= length; j+=i)
                {
                    if (sieveOfEratosthenes[(j - 2)] && j % i == 0)
                    {
                        inner++;
                        sieveOfEratosthenes[j - 2] = false;
                    }
                }
            }
        }

        System.out.println("Outer loop: " + outer);
        System.out.println("Inner loop: " + inner);
        for (int i = 0; i < numberList.length - 1; i++)
        {
            if (sieveOfEratosthenes[i] == true)
            {
                primes.add(numberList[i]);
            }
        }
        return primes;
    }
}
