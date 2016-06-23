/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */

def isPrime(n: Int) = !2.to(Math.sqrt(n).toInt).exists(n % _ == 0)

def maxPower(n: Int, p: Int) = (for (i <- 1 to n if Math.pow(p,i) < n) yield i).max

2 to 20 filter( isPrime ) map ( p => Math.pow(p, maxPower(20, p)).toInt ) reduce (_*_)

// res35: Int = 232792560
