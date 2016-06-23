/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */

def isPrime(n: Long) = !2L.to(Math.sqrt(n).toLong).exists(n % _ == 0)

Math.sqrt(600851475143l).toLong.to(2).by(-1).collectFirst{ case m if (BigInt(600851475143l) % m == 0 && isPrime(m)) => m}

// res1: Option[Long] = Some(6857)

