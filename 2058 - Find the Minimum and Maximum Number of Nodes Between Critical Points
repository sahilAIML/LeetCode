# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        min_distance = float('inf')
        first_critical_idx = -1
        prev_critical_idx = -1
        
        curr = head.next
        prev = head
        idx = 1
        
        while curr and curr.next:
            nxt = curr.next
            if (curr.val > prev.val and curr.val > nxt.val) or \
               (curr.val < prev.val and curr.val < nxt.val):
                
                if first_critical_idx == -1:
                    first_critical_idx = idx
                if prev_critical_idx != -1:
                    min_distance = min(min_distance, idx - prev_critical_idx)
                
                prev_critical_idx = idx
                
            prev = curr
            curr = nxt
            idx += 1
            
        if min_distance == float('inf'):
            return [-1, -1]
            
        max_distance = prev_critical_idx - first_critical_idx
        return [min_distance, max_distance]
