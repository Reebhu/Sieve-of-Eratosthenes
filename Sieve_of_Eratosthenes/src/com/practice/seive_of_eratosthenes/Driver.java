package com.practice.seive_of_eratosthenes;

import java.util.List;

/**
 * Description.
 * @author INSERT USERNAME
 */
public class Driver
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        List<Integer> primes = sieveOfEratosthenes.findPrimes(100);
        System.out.println(primes);
    }

}
