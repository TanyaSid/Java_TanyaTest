package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by trodzina on 11/2/2016.
 */
public class PrimeTests {

  @Test
  public void testPrimes()
  {
    Assert.assertTrue(Primes.isPrimeFast(Integer.MIN_VALUE));
    }

  @Test
  public void testNonPrimes()
  {
    Assert.assertFalse(Primes.isPrime(Integer.MIN_VALUE-2));
  }

  @Test (enabled = false)
  public void testPrimelong()
  {
    long n =Integer.MIN_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }

  @Test
  public void testNonPrimeLong()
  {
    Assert.assertFalse(Primes.isPrime(Integer.MIN_VALUE-2));
  }


}
