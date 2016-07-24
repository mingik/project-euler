/**

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?

  */

// Each path to the bottom right corner is guaranteed to consist of 40 total movements (Right or Down).
// Moreover, # of Right Moves == # of Down Moves == 20 (because end position is on diagonal end
// That's why total number of paths from start position to end posiion is equal to C_40^20 (where C_n^m is number of ways to choose m items out of n items
// C_n^m = n! / m!*(n-m)!

def factorial(n: Int): BigInt = {
  def helper(curStep: Int, acc: BigInt): BigInt = if (curStep == n) acc else helper(curStep+1,acc*curStep)
  if (n==0) 1 else helper(1, BigInt.int2bigInt(n))
}

factorial(40)/factorial(20)*factorial(20)

//res103: scala.math.BigInt = 137846528820
