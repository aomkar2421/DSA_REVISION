//LEETCODE 2

package lc;

import number.ReverseNum;

public class AddTwoNumbers {
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

		int ans = add(a , a1);
		System.out.println(ans);
				
	}

	private static int add(Node head1, Node head2) {

		Node temp1 = head1;
		Node temp2 = head2;
		
		int num1 = 0, num2 = 0;
		
		while (temp1 != null) {
			int a = temp1.val;
			num1 = num1*10 + a;
			temp1 = temp1.next;
		}
		
		while (temp2 != null) {
			int a = temp2.val;
			num2 = num2*10 + a;
			temp2 = temp2.next;
		}
		
		System.out.println(num1+" "+num2);
		
		int rev1 = reverseNum(num1);
		int rev2 = reverseNum(num2);
		
		System.out.println(rev1+" "+rev2);
		int rev = rev1 + rev2;
		System.out.println(rev);
		
		int rem;
		Node temp = new Node(100);
		Node temp4 = temp;
		
		while(rev>0) {
			rem = rev%10;
			Node node = new Node(rem);
			temp4.next = node;
			temp4 = node;
			rev = rev/10;
		}
		display(temp.next);
		
		return 0;
	}

	private static int reverseNum(int num1) {
		int a = num1;
		int rem = 0;
		int rev=0;
		while (a>0) {
			rem = a%10;
			rev = rev*10 + rem;
			a=a/10;
		}

		return rev;
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
