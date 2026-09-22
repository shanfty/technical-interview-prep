# Pacific Atlantic Water Flow

Given an `m x n` matrix of heights, water can flow from a cell to a neighboring cell if the neighbor's height is less than or equal to the current cell's height. Water can flow off the top and left edges into the Pacific Ocean and off the bottom and right edges into the Atlantic Ocean. Return all coordinates from which water can flow to both oceans, in any order.

Example: for `[[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]`, the valid coordinates are `[[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]`.

Source: [NeetCode 150](https://neetcode.io/practice/practice/neetcode150)
