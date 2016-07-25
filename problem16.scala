/**

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

  */

BigInt(2).pow(1000).toString.view.map(_.asDigit).reduce(_+_)

// res4: Int = 1366

