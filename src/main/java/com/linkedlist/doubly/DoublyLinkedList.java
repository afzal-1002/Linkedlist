package com.linkedlist.doubly;

public class DoublyLinkedList {


	static  class  Node {
		public Object data;
		public Node next;
		public Node prev;
		
		public Node(Object data)
		{
			this.data = data;
			next = prev = null;
		}
	}

	static  class  LinkedList {
		
		public  Node head;
		public  Node tail;

		public  LinkedList()
		{
			this.head = null;
			this.tail = null;
		}


		public void  addFirst(Object data)
		{
			Node node = new Node(data);

			if (head == null) {
				head = tail = node;
			}else {
				head.prev = node;
				node.next = head;
				head = node;
			}
			
		}

		public void  addLast(Object data)
		{
			Node node = new Node(data);

			if (head == null) {
				head = tail = node;
			}else {
				tail.next = node;
				node.prev = tail;
				tail = node;
			}
			
		}

		public Node  getFirst()
		{
			Node temp;
			if (head == null) {
				return null;
			}else {
				temp = head;
				head = head.next;
				head.prev = null;
				temp.next = null;
			}

			return (temp);
			
		}


		public Node  getLast()
		{
			Node temp;
			if (head == null) {
				return null;
			}else {
				temp = tail;
				tail = temp.prev;
				tail.next = null;
				temp.prev = null;
			}

			return (temp);
			
		}

		public boolean  contains(Object data)
		{
			Node temp;
			if (head == null) {
				return false;
			}else {
				temp = head;
				while (temp.next != null) {
					if(head.data == data)
						return (true);
					temp = temp.next;
				}	
			}
			return (false);
		}


public void setNode(Object data, int index) {

    if (index < 0) {  return;  }

    if (index == 0) {
        addFirst(data);
        return;
    }

    Node temp = head;
    int count = 0;

    while (count != index - 1) {
        temp = temp.next;
        count++;
    }

    Node node = new Node(data);
    Node oldNext = temp.next;
    temp.next = node;
    node.prev = temp;
    node.next = oldNext;
    if (oldNext != null) {
        oldNext.prev = node;
    }
}

}





	public static void main(String[] args) {
			LinkedList linkedList = new LinkedList();

			linkedList.addFirst(1);
			linkedList.addFirst(2);
			linkedList.addFirst(3);

			Node temp = linkedList.head;

			int index = 0;
			while (temp != null) {
				System.out.println(" index   " + index + " value  = " + temp.data);
				temp = 	temp.next;
				index++;
			}

			

			System.out.println("Adding Last ");

			linkedList.addLast(5);
			linkedList.addLast(6);
			linkedList.addLast(7);

			temp = linkedList.head;
			index = 0;
			while (temp != null) {
				System.out.println(" index   " + index + " value  = " + temp.data);
				temp = 	temp.next;
				index++;
			}
			

			System.out.println("getFirst = " + linkedList.getFirst().data );
			System.out.println("getLast = " + linkedList.getLast().data );
			System.out.println("Contains = " + linkedList.contains(1) );

			System.out.println("Before Setting the node at 1 value 33");

			temp = linkedList.head;
			index = 0;
			while (temp != null) {
				System.out.println(" index   " + index + " value  = " + temp.data);
				temp = 	temp.next;
				index++;
			}
			



			System.out.println("Setting the node at 1 value 33");

			linkedList.setNode(33, 1);

			temp = linkedList.head;
			index = 0;
			while (temp != null) {
				System.out.println(" index   " + index + " value  = " + temp.data);
				temp = 	temp.next;
				index++;
			}
			

	}
	
}
