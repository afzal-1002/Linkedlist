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


		public  void addLast(Object data)
		{
			Node newNode =  new Node(data);

			if(head == null)
			{
				head = tail = newNode;
				return ;
			}else
			{
				tail.next = newNode;
				tail=newNode;
			}

		}


		public  Node getFirst()
		{
			Node temp ;
			if(head == null)
			{
				return null;
			}else
			{
				temp = head;
				head = temp.next;
			}

			return (temp);
		}


	}


	public static void main(String[] args) {
		System.out.println("Singly Link List:  ");

		SingleList list = new SingleList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);


		Node temp = list.head;
		int count = 0 ;


		while (temp != null) {
			
			System.out.println("Index position " + count + " => " +  temp.data);

			temp = temp.next;
			count++;
		}

		// Node first =  list.getFirst();

		System.out.println("getFirst Node => " + list.getFirst().data);
		System.out.println("getFirst Node => " + list.getFirst().data);


		

	}
}
