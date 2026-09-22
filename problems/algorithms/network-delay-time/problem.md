# Network Delay Time

You are given directed weighted edges `times`, where `times[i] = [u, v, w]` means a signal takes `w` time units to travel from node `u` to node `v`. Starting from node `k`, return the time for all `n` nodes to receive the signal, or `-1` if some node is unreachable.

Examples: `times = [[2,1,1],[2,3,1],[3,4,1]]`, `n = 4`, `k = 2` returns `2`; `times = [[1,2,1]]`, `n = 2`, `k = 2` returns `-1`.

Source: [NeetCode 150](https://neetcode.io/practice/practice/neetcode150)
