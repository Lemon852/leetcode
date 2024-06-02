description: here, we are given an integer array, and a target.
            we have to find two numbers from that array which sum 
            equals to the target.

solution: using two nested for loops, we will initalize outer loop and inside 
         nested loop, we run another loop that covers the remaing elements. 
         after finding those two pair, we return an array of those two number, if not
         found return null.

Time complexity: O(n^2);

link-to-problem:https://leetcode.com/problems/two-sum/description/