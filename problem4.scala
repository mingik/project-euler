/*

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 */

def isPalindrome(n: Long): Boolean = n.toString == n.toString.reverse

val pals = for {
  f <- 999.to(100).by(-1)
  s <- 999.to(100).by(-1) if isPalindrome(f*s)
} yield f*s

pals.max

// res0: Int = 906609
