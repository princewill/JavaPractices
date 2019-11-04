# JavaPractices
Algorithms and Data Structures Problems.

A Repository for my Java PlayGround

# First Problem - BracketValidator.java:
- You're working with an intern that keeps coming to you with JavaScript code that won't run because the braces, brackets, and parentheses are off. To save you both some time, you decide to write a braces/brackets/parentheses validator.
  
  Let's say:
  
  '(', '{', '[' are called "openers."
  ')', '}', ']' are called "closers."
  Write an efficient method that tells us whether or not an input string's openers and closers are properly nested.

# Second Problem - MaxProfit.java
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
  
# Third Problem - SortScores.java
- You created a game that is more popular than Angry Birds.
  
  Each round, players receive a score between 0 and 100, which you use to rank them from highest to lowest. So far you're using an algorithm that sorts in O(n\lg{n})O(nlgn) time, but players are complaining that their rankings aren't updated fast enough. You need a faster sorting algorithm.
  
  Write a method that takes:
  
  an array of unsortedScores
  the highestPossibleScore in the game
  and returns a sorted array of scores in less than O(n\lg{n})O(nlgn) time.
  
  For example:
  
    int[] unsortedScores = {37, 89, 41, 65, 91, 53};
  final int HIGHEST_POSSIBLE_SCORE = 100;
  
  int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
  // sortedScores: [91, 89, 65, 53, 41, 37]
  
  We’re defining nn as the number of unsortedScores because we’re expecting the number of players to keep climbing.
  
  And, we'll treat highestPossibleScore as a constant instead of factoring it into our big O time and space costs because the highest possible score isn’t going to change. Even if we do redesign the game a little, the scores will stay around the same order of magnitude.

# Forth Problem - Meeting.java
- Your company built an in-house calendar tool called HiCal. You want to add a feature to see the times in a day when everyone is available.
  
  To do this, you’ll need to know when any team is having a meeting. In HiCal, a meeting is stored as an object of a Meeting class with integer variables startTime and endTime. These integers represent the number of 30-minute blocks past 9:00am.
  For example:
  
    - new Meeting(2, 3);  // meeting from 10:00 – 10:30 am
    - new Meeting(6, 9);  // meeting from 12:00 – 1:30 pm
  
  Write a method mergeRanges() that takes a list of multiple meeting time ranges and returns a list of condensed ranges.
  
  For example, given:
  
    - [Meeting(0, 1), Meeting(3, 5), Meeting(4, 8), Meeting(10, 12), Meeting(9, 10)]
  
  your method would return:
  
    - [Meeting(0, 1), Meeting(3, 8), Meeting(9, 12)]
  
  Do not assume the meetings are in order. The meeting times are coming from multiple teams.
  
  Write a solution that's efficient even when we can't put a nice upper bound on the numbers representing our time ranges. Here we've simplified our times down to the number of 30-minute slots past 9:00 am. But we want the method to work even for very large numbers, like Unix timestamps.
   In any case, the spirit of the challenge is to merge meetings where startTime and endTime don't have an upper bound.