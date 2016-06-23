/*

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

 */

Stream.from(2)
  .filter(p => (2L to Math.sqrt(p).toLong).forall{ p % _ != 0})
  .drop(10000)
  .head

// res41: Int = 104743
