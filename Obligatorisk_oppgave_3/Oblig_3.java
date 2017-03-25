import java.util.Scanner;
public class Oblig_3
{


	public static void main(String[] args)
	{
		System.out.println("Skriv inn antall indekser");
		Scanner in = new Scanner(System.in);
		int antall = in.nextInt();; 											//antall indekser som brukes
		LinkedList [] hashing_Table= new LinkedList[antall]; 				//listen over lenkede lister
		int a = 0;



															//a initiert.

		for(int i=0; i<hashing_Table.length; i++)
		{
			hashing_Table[i]=new LinkedList();
		} 																		//oppretting av array med referanser til lenkede lister

		System.out.println("Hvor mange verdier vil du lese inn?");
		int antallVerdier = in.nextInt(); 									//antall verdier som vil skrives inn

		for(int i =0; i<antallVerdier; i++)
		{
			System.out.println("Skriv inn verdi");
			a = in.nextInt();
			hashing_Table[hashing(a,antall)].insertNodeFirst(a);
		}																	//innlesing av verdier

		loadFactor(antallVerdier, antall); 									//kall på loadfaktormetode

		for (int i =0; i<antall; i++)
		{
			System.out.println("index " +i);
			hashing_Table[i].printList();
		} 																	//utskrift av listen


	}//main

	public static void loadFactor(int a, int b)
	{

		double c=(a*1.00/b*1.00)/a*1.00;
		System.out.println("teoretisk loadfaktor er " + c);
	}																		//loadfaktor

	public static int hashing(int a, int b)
	{
		System.out.println("restverdi " +a%b);
		return a%b;
	}																		//hashingmetoden



}
