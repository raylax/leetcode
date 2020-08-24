class Solution {
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        let r: ListNode? = ListNode(0);
        var prev: ListNode? = r;
        var p = l1, q = l2;
        var curry = false
        while curry || p?.val != nil || q?.val != nil {
            var val = (p?.val ?? 0) + (q?.val ?? 0)
            if curry {
                val += 1
            }
            curry = val > 9
            val = val % 10
            let c = ListNode(val)
            prev?.next = c
            prev = c
            p = p?.next
            q = q?.next
        }

        return r?.next;
    }
}
