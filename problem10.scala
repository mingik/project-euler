/*

Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 
*/

def isPrime(n: Long) = !2L.to(Math.sqrt(n).toLong).exists(n % _ == 0)

(2L to 2000000L).filter(isPrime).sum

// res1: Long = 142913828922

def sieve(n: Long) = {
  val rangeArr = (0L to (n+1)).toArray

  for {
    i <- 2L to n
    j <- i to n if (i*j <= n)
  } rangeArr((i*j).toInt) = 0
  rangeArr
}

sieve(2000000L).filter(_ != 0).dropRight(1).reduce(_ * _)

// 
