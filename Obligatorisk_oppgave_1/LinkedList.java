class LinkedList
{
	private Node head;
	private int elementCount;

	public LinkedList()
	{
		head=null;
		elementCount = 0;
	}

	//#1
	public void deleteNodeFirst()
	{
		if(head==null)
		{
		System.out.println("lista er tom, kan ikke slette");
		}
		else if(head!=null)
		{
			System.out.println("du har slettet den første noden i listen din med verdi\n"+
			"Noden hadde verdi: " + head.element);

			Node ptr = new Node();
			ptr = head;
			head=ptr.next;
			elementCount=elementCount-1;
		}
	}

	//#2
	public void deleteNodeLast()
	{
		if(head==null)
		{
			System.out.println("lista er tom, kan ikke slette");
		}

		else if (head.next==null)
		{
			System.out.println("du har slettet den siste noden i listen din med verdi\n"+
			"Noden hadde verdi: " + head.element);
			head=null;
		}

		else if (head != null)
		{
			Node ptr = head;
			while (ptr.next.next != null)
			{
				ptr=ptr.next;
			}
			System.out.println("du har slettet den siste noden i listen din med verdi\n"+
			"Noden hadde verdi: " + ptr.next.element);
			ptr.next=null;
			elementCount--;
		}
	}



	//#3
	public void deleteNodeWithValue(int data)
	{

		if (head==null)
		{
			System.out.println("listen er tom, kunne ikke slette");
		}
		else if(head.element == data)
		{
			System.out.println("du har slettet den første noden med verdi\n"+
			head.element +"fra listen din");
			head=head.next;
			elementCount--;
		}
		else
		{

			Node ptr = head.next;
			while (ptr.next.element != data && ptr.next.next != null)
			{
				ptr=ptr.next;
				if (ptr.next.next == null)
				{
					System.out.println("verdi ikke funenet i listen");
				}
			}
			if (ptr.next.element == data)
			{
				System.out.println("du har slettet den første noden med verdi\n"+
				head.element +"fra listen din");
				ptr.next=ptr.next.next;
				elementCount--;
			}
		}
	}

	//#4
	public void deleteAllNodesWithValue(int data)
	{
		Node ptr = head;
		int check =0;
		check = elementCount;
		if (head==null)
		{
			System.out.println("lista er tom, kan ikke slette");
		}

		while (ptr != null)

		{

			if (head==null)
			{
				ptr=null;
			}
			else if (head.element == data)
			{

				head=head.next;
				elementCount--;
			}
			else if (ptr.next != null && ptr.next.element == data)
			{

				ptr.next=ptr.next.next;
				elementCount--;

			}

			else if (ptr != null)
			{
				ptr = ptr.next;
			}

		}
		int differanse=check-elementCount;
		if(elementCount==check && elementCount !=0)
		{
			System.out.println("element ikke funnet i listen\n");
		}
		else if (check !=0)
		{
			System.out.println("du har slettet den alle nodene med verdi\n "+
			data +" fra listen din"+"\n det var "+ differanse + " elementer som ble slettet");
		}
	}

	// #5
	public void insertNodeFirst(int data)
	{
		System.out.println("\ndu har lagt til en node først i listen din\n"+
		"Noden hadde verdi: " + data+"\n");
		Node newNode = new Node(data);
		newNode.next=head;
		head = newNode;
		elementCount=elementCount+1;
	}

	//#6
	public void insertNodeLast(int data)
	{
		System.out.println("\ndu har lagt til en node sist i listen din\n"+
		"Noden hadde verdi: " + data+"\n");

		if (head == null)
			insertNodeFirst(data);
		else
		{
			Node ptr = head;
			while (ptr.next != null)
			{
				ptr=ptr.next;
			}
			Node newNode =new Node(data);
			ptr.next = newNode;
			elementCount++;
		}
	}

	//#7
	public void addNodeAfterValue(int nodeData, int data)
	{
		Node ptr = head;
		if(head==null)
		{
			System.out.println("listen er tom, kan ikke sette verdi foran tom verdi \n");
		}

		else
		{
			while(ptr.next != null && ptr.element!=data)
			{
				ptr=ptr.next;
			}

			if(ptr.element==data)
			{

				System.out.println("\ndu har lagt til en node etter den første noden med verdi"+ nodeData +" i listen din\n"+
				"Noden hadde verdi: " + data + "\n");
				Node newNode = new Node(nodeData);
				newNode.next=ptr.next;
				ptr.next=newNode;
				elementCount++;
			}
			else
			{
				System.out.println("noden med verdi "+ data + " fantes ikke i lista");
			}

		}
	}

	//#8
	public void addNodeBeforeValue(int nodeData, int data)
	{
		Node ptr = head;
		if(head==null)
		{
			System.out.println("listen er tom, kan ikke sette verdi foran tom verdi \n");
		}
		else if (ptr.element == data)
		{

			insertNodeFirst(nodeData);
			System.out.print("Noden lå foran en node med verdi 1" + data + "\n");
		}
		else if (ptr.next!=null)
		{
			while(ptr.next.next != null && ptr.next.element!=data)
			{
				ptr=ptr.next;
			}
			if(ptr.next.element==data)
			{
				System.out.println("\ndu har lagt til en node før den første noden med verdi"+ nodeData +" i listen din\n"+
				"Noden hadde verdi: " + data + "\n");
				Node newNode = new Node(nodeData);
				newNode.next=ptr.next;
				ptr.next=newNode;
				elementCount++;

			}
			else
			{
				System.out.println("noden med verdi "+ data + " fantes ikke i lista");
			}
		}
		else
		{
			System.out.println("noden med verdi "+ data + " fantes ikke i lista");
		}
	}

	//#9
	public void listLength()
	{
		if(elementCount == 0)
		{
			System.out.println("lista er tom, antall elementer er "+elementCount);
		}
		else
			System.out.println("antall elementer i lista er " + elementCount +"\n");

	}

	//#10
	public void countData(int data)
	{
		int frequence = 0;
		Node ptr = head;

		if(head==null)
		{
			System.out.println("lista er tom, ingen elementer talt\n");
		}
		else
		{
			while (ptr != null)
			{
				if (ptr.element== data)
				{
					frequence++;
				}
				ptr=ptr.next;

			}
			System.out.println("tallet "+ data+" forekom " + frequence+" ganger \n");
		}
	}

	//#11
	public void printList()
	{
		Node ptr = head;
		int i =0;

		if (ptr==null)
		{
			System.out.println("lista er tom");
		}

		else if(ptr!= null)
		System.out.println(ptr.element);

		while(i < elementCount-1)
		{
			ptr=ptr.next;
			System.out.println(ptr.element);
			i++;
		}
		System.out.println();
	}



	//#12
	public void deleteAll()
	{
		if(head==null)
		{
			System.out.println("Lista er tom, antall elementer slettet er "+ elementCount+"\n");
		}

		else
		{
			head = null;
			System.out.println("\n antall elementer som ble slettet var: "+elementCount+"\n");
			elementCount=0;
		}
	}
}
