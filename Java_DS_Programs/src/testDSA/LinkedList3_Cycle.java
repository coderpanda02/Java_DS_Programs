// If a node in the linked list can be accessed again by continuously following the next pointer, there is a Cycle or Loop in the Linked List.
// To find the cycle using Floyd's Cycle-Finding algorithm (Also called Hare-Tortoise algorithm) ->
// Taking Two pointers of different speed - slow (slow = slow.next) and fast (fast = fast.next.next) pointers.
// If slow and fast meets, there is a cycle. Though it might not be the starting point of the cycle, to find that we have to
// reset the slow pointer to head again (keeping fast as it is) and increment both by one node this time (slow = slow.next, fast = fast.next)
// until they meet again. Where they meet for the 2nd time, that is the starting point of the cycle. 

