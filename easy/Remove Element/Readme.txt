Description: We're given an array and a value/target. Then we are required to remove all the occurence of target from the array,
            and return the number of elements expect for the removed element.

solution: using two pointer method, we can run from left(until left is greater than right) and if the value at the left is equal to target,
        we swap the value from last to 0th index, and decrease the right pointer,
        else we increment the left pointer and repeat.
        at the end return the right value.

time-complexity: O(n);

link-to-problem:https://leetcode.com/problems/remove-element/description/