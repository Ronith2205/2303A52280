# Notification Priority System

Priority Order:

1. Placement
2. Result
3. Event

Recency is used when
two notifications have same priority.

# Efficient Top 10

A Priority Queue (Min Heap)
of size 10 is maintained.

When a new notification arrives:

1. Insert
2. If size > 10
   remove lowest priority

Time Complexity:

O(log n)