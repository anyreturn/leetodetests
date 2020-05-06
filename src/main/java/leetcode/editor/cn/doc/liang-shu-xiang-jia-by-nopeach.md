 本来就是逆序，从头个十百千万，过十进一，添加一个变量记录那个一，有点麻烦的是尾节点总是要创建一个，会存在空的现象，所以每次先创建一个节点存数据。最后返回节点的next节点。执行时间4ms,内存消耗5MB
```
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil && l2 == nil {
		return nil
	}
	node1 := l1
	node2 := l2
	l3 := new(ListNode)
	node3 := l3
	a := 0
	for (node1 != nil || node2 != nil || a > 0) {
		node3.Next = new(ListNode)
		node3 = node3.Next
		b := 0
		c := 0
		if node1 != nil {
			b = node1.Val
		}
		if node2 != nil {
			c = node2.Val
		}
		node3.Val = (a + b + c) % 10
		a = (a + b + c) / 10
		if node1 != nil {
			node1 = node1.Next
		}
		if node2 != nil {
			node2 = node2.Next
		}
	}
	return l3.Next
}
```
