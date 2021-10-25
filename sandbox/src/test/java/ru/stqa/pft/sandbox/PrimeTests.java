package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {
  @Test
  public void testPrimesFast(){
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }

  @Test (enabled = false)
  public void testPrimeslong(){
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrimeWhile(n));
  }

  @Test
  public void testNonPrime(){
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE-2));
  }

}
