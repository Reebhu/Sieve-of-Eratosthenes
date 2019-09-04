package com.practice.seive_of_eratosthenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *Driver Class to call the main bussiness logic
 * @author Reebu, Mukherjee
 */
public class Driver
{

    /**
     * @param args
     * 
     */
    public static void main(String[] args) 
    {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            Integer x = Integer.parseInt(br.readLine());
            List<Integer> primes = sieveOfEratosthenes.findPrimes(x);
            System.out.println(primes);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
