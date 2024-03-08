//LEETCODE 2

package lc;

public class AddTwoNumbers2 {
	Node head;
	static class Node{
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

	}

	public static void main(String[] args) {
		Node a = new Node(2);
		Node b = new Node(1);
		Node c = new Node(0);
		Node d = new Node(3);
//		Node e = new Node(17);
//		Node f = new Node(26);
		Node a1 = new Node(3);
		Node b1 = new Node(2);
		Node c1 = new Node(1);
//		Node d1 = new Node(51);
//		Node e1 = new Node(91);

		a.next = b;
		b.next = c;
		c.next = d;
		
		a1.next = b1;
		b1.next = c1;
		
		
		display(a);
		display(a1);

		addTwoNumbers(a , a1);
				
	}


	 public static Node addTwoNumbers(Node head1, Node head2) {
	        // Check if both lists represent the number zero
	        if (isZero(head1) && isZero(head2)) {
	            return new Node(0);
	        }

	        Node dummy = new Node(0);
	        Node current = dummy;
	        int carry = 0;

	        while (head1 != null || head2 != null || carry != 0) {
	            int value1 = (head1 == null) ? 0 : head1.val;
	            int value2 = (head2 == null) ? 0 : head2.val;

	            int sum = value1 + value2 + carry;
	            carry = sum / 10;

	            current.next = new Node(sum % 10);
	            current = current.next;

	            if (head1 != null) head1 = head1.next;
	            if (head2 != null) head2 = head2.next;
	        }

	        return dummy.next;
	    }

	    private static boolean isZero(Node head) {
	        while (head != null) {
	            if (head.val != 0) {
	                return false;
	            }
	            head = head.next;
	        }
	        return true;
	    }
	
	

	static int getSize(Node head) {
		Node temp=head;
		int size = 0;
		while (temp!=null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	static void display(Node head){
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println("END\n");
	}

}
