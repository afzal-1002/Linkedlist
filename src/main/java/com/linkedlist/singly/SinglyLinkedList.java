package com.linkedlist.singly;


public class SinglyLinkedList {
	
	/**
	 * Noode
	 */
	static  class Node {
		
			Object data;
			Node next;

		public  Node(Object data)
		{
			this.data = data;
			this.next = null;
		}
		
	}

	static class SingleList {
		
		Node head;
		Node tail;

		public SingleList()
		{
			head = tail = null;
		}
		
		public  void addFirst(Object data)
		{
			Node newNode =  new Node(data);

			if(head == null)
			{
				head = tail = newNode;
				return ;
			}else
			{
				newNode.next = head;
				head=newNode;
			}

		}


	}


	public static void main(String[] args) {
		System.out.println("Singly Link List => ");

		SingleList list = new SingleList();
		list.addFirst(5);
		list.addFirst(10);
		list.addFirst(15);


		Node head = list.head;



		while (head != null) {
			
			System.out.println(head.data);

			head = head.next;
		}

	}
}
