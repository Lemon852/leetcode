
description:
    we are given an integer array of height n, where each element in 
    an array represent the vertical height of the container,
    such taht the two endpoint of the ith line are [i,0] and [i, height[i]].
    We need to find which container contains the most water.
    Container is gap between two vertical lines linked together in x-axis.

Solution:
    max area = (j-i)*Math.min(height[i], height[j])
    where i is the inital element, and j is the last value for the container wall.
    but now, we need to find the value of i and j such that the area is maximum
    we can go with nested loops so that we hold currentArea, and keep looking for the maximum area
    by doing so, time complexity goes to quadratic(n^2),
    to get the optimum solution(linear time), we can use two pointer method,

Optimum Solution:
    we'll start one pointer(left) from inital value, and other(right) from the last,
    we are trying to get the maximum, so 
    we start a loop, that will end when left pointer is equals to right pointer
    now, just check which pointer is greater, and if left is smaller than right pointer,
    increment the left pointer,
    else decrement the right pointer,
    and return the maxArea

    !!!NOTE: pointer represents the index


time-complexity: O(n);

link-to-problem:https://leetcode.com/problems/container-with-most-water/description/
