/*

Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

for {
  a <- 1 to 500
  b <- 1 to 500
  c <- 1 to 500 if (c*c == a*a + b*b) && (a+b+c == 1000) && (a < b && b < c)
} yield a*b*c

// res16: scala.collection.immutable.IndexedSeq[Int] = Vector(31875000)

