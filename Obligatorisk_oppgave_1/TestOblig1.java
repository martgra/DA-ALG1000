import java.util.Scanner;
public class TestOblig1
{

	public static void main(String[]args)
	{

		LinkedList myList = new LinkedList();
		myList= menuChoice(myList);

	}

	public static LinkedList menuChoice(LinkedList list)
	{
		Scanner in = new Scanner(System.in);
		// print menu

		list=list;

		MenuItems.printMenuItems();
		boolean quit = false;
		int menuItem;
		do
		{
			menuItem = in.nextInt();
			switch (menuItem)
			{
				case 1:
				{
					list.deleteNodeFirst();
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 2:
				{
					list.deleteNodeLast();
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 3:
				{
					System.out.println("skriv inn verdien på noden du vil slette\n");
					Scanner case3in = new Scanner(System.in);
					int case3 = in.nextInt();
					list.deleteNodeWithValue(case3);
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 4:
				{
					System.out.println("skriv inn verdien på nodene du vil slette\n");
					Scanner case4in = new Scanner(System.in);
					int case4 = in.nextInt();
					list.deleteAllNodesWithValue(case4);
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 5:
				{
					System.out.println("skriv inn hvor mange noder du vil legge inn.\n"+
					"nodene blir lagt foran hverandre");
					Scanner case5in = new Scanner(System.in);
					int antallNoderCase5 = in.nextInt();
					for(int i =0; i<antallNoderCase5; i++)
					{
						System.out.println("skriv inn verdien på noden du vil legge til først i listen\n");
						int case5 = in.nextInt();
						list.insertNodeFirst(case5);
					}
					System.out.println("du har lagt til "+ antallNoderCase5 +" node i listen din");
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 6:
				{
					System.out.println("skriv inn hvor mange noder du vil legge inn.\n"+
										"nodene blir lagt bak hverandre");
					Scanner case6in = new Scanner(System.in);
					int antallNoderCase6 = in.nextInt();
					for(int i =0; i<antallNoderCase6; i++)
					{
						System.out.println("skriv inn verdien på noden du vil legge til sist i listen\n");
						int case6 = in.nextInt();
						list.insertNodeLast(case6);
					}
					System.out.println("du har lagt til "+ antallNoderCase6 +" i listen din");
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 7:
				{
					System.out.println("skriv inn verdien på noden du vil legge til");
					Scanner case7in = new Scanner(System.in);
					int case7 = in.nextInt();
					System.out.println("skriv inn verdien på noden du vil legge til den nye noden bak");
					int case7data = in.nextInt();
					list.addNodeAfterValue(case7, case7data);
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");

					break;
				}
				case 8:
				{
					System.out.println("skriv inn verdien på noden du vil legge til");
					Scanner case8in = new Scanner(System.in);
					int case8data = in.nextInt();
					System.out.println("skriv inn verdien på noden du vil legge til den nye noden foran");
					int case8 = in.nextInt();
					list.addNodeBeforeValue(case8data, case8);
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 9:
				{
					list.listLength();
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 10:
				{
					System.out.println("skriv inn verdien du vil telle opp");
					Scanner case10in = new Scanner(System.in);
					int case10 = in.nextInt();
					list.countData(case10);
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
					"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 11:
				{
					list.printList();
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
										"\n(du kan se menyen på nytt ved å skrive 13)");
					break;
				}
				case 12:
				{
					list.deleteAll();
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
										"\n(du kan se menyen på nytt ved å skrive 13)");

					break;
				}
				case 13:
				{
					MenuItems.printMenuItems();
					break;
				}
				case 0:
				{
					quit = true;
					break;
				}
				default:
				{
					System.out.println("Invalid choice.");
					System.out.println("\nditt valg er gjennomført, velg nytt menyvalg."+
										"\n(du kan se menyen på nytt ved å skrive 13)");

				}
			}

		} while (!quit);

		System.out.println("Bye-bye!");
		return list;

	}
}