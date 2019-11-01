# JavaPractices
Algorithms and Data Structures Problems.

A Repository for my Java PlayGround

#First Problem - BracketValidator.java:
- You're working with an intern that keeps coming to you with JavaScript code that won't run because the braces, brackets, and parentheses are off. To save you both some time, you decide to write a braces/brackets/parentheses validator.
  
  Let's say:
  
  '(', '{', '[' are called "openers."
  ')', '}', ']' are called "closers."
  Write an efficient method that tells us whether or not an input string's openers and closers are properly nested.

#Second Problem - MaxProfit.java
- Writing programming interview questions hasn't made me rich yet ... so I might give up and start trading Apple stocks all day instead.
  
  First, I wanna know how much money I could have made yesterday if I'd been trading Apple stocks all day.
  
  So I grabbed Apple's stock prices from yesterday and put them in an array called stockPrices, where:
  
  The indices are the time (in minutes) past trade opening time, which was 9:30am local time.
  The values are the price (in US dollars) of one share of Apple stock at that time.
  So if the stock cost $500 at 10:30am, that means stockPrices[60] = 500.
  
  Write an efficient method that takes stockPrices and returns the best profit I could have made from one purchase and one sale of one share of Apple stock yesterday.
  
  For example:
  
    int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};
  
  getMaxProfit(stockPrices);
  // returns 6 (buying for $5 and selling for $11)
  
  No "shorting"—you need to buy before you can sell. Also, you can't buy and sell in the same time step—at least 1 minute has to pass.