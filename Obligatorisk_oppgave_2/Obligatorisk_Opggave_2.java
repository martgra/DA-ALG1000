import java.util.Scanner;


public class Obligatorisk_Opggave_2 
{

	public static void main(String[] args) 
	{
	
		int [][] matrix =
		{
			{0,8,10,13,0,0,0},								//a
			{8,0,0,11,0,0,0},								//b
			{10,0,0,13,0,12,0},								//c
			{13,11,13,0,12,0,11},							//d
			{0,0,0,12,0,5,9},								//e
			{0,0,12,0,5,0,7},								//f
			{0,0,0,11,9,7,0}								//g
		};
	
	skrivUt(matrix); 										//metode for � skrive ut matrix
	searchLeastValue(matrix);								//metode for � s�ke billigste vei i matirx
		
		
	}

	static void skrivUt(int [][]z) 							//metode for � skrive ut flerdimensjonell tabell
	{
		
		String[] bokstaver ={"A","B","C","D","E","F","G"};
		for(int i = 0; i<7; i++) 							//for-l�kke printer matrix
		{
			System.out.printf(bokstaver[i]);
			for(int j = 0; j<7; j++)
			{
				
				System.out.printf(" |");
				System.out.printf("%3d", z[i][j]);
			}

			System.out.println(" |");

		}	
	}														//metode slutt
	
	static void searchLeastValue(int [][]x)					//metode for � s�ke minste verdi i matrix
	{
		Scanner input = new Scanner (System.in);
		int nextPositionY=0;								//variabel for neste s�keposisjon
		int [] arrayVisited = new int [7];					//tabell for bes�kte posisjoner
		int checkValue = 666; 								//baseverdi st�rre enn st�rste verdi i matrix
		int antallBesok=1;									//bes�kcounter
		int currentPositionY=0;								//variabel for n�v�rende posisjon
		int value=0;										//variabel for � legge sammen total kostnad
	
		System.out.println("\nHvor vil du begynne?\n" + 
							"Skriv 0 for hus A\n" +
							"Skriv 1 for hus B\n" +
							"Skriv 2 for hus C\n" +
							"Skriv 3 for hus D\n" +
							"Skriv 4 for hus E\n" +
							"Skriv 5 for hus F\n" +		
							"Skriv 6 for hus G\n");
		
		String [][] lagretHus= new String[7][2];			//stringtabell for � lagre huspar
		int [] lagretVei= new int [6];						//inttabell for � lagre verdier mellom bes�kte hus
		arrayVisited[0]= input.nextInt();					//setter inn f�rste bes�k i bes�kstabellen
		
				
		for(int i = 0; i<6; i++) 							//for-l�kke g�r antallet "veier" i matrix
		{
			for (int k = 0; k < antallBesok; k++)  			//for l�kke - g�r gjennom antallet bes�kte hus
			{	
				nextPositionY=arrayVisited[k];				//anngir neste s�k.
				for(int j = 0; j<7; j++)					//s�ker alle mulighetene i ett hus.
				{
					if(x[j][nextPositionY]<checkValue && x[j][nextPositionY]!=0 && isArray (arrayVisited, j, antallBesok)==false)	//sjekker p� om verdien er gyldig 
					{											
						checkValue=x[j][nextPositionY];		//setter verdi i n�v�rende punkt som minste verdi																																	
						currentPositionY=j;
					}
				
				}		
						
			}
			
			
			switch (currentPositionY) 						//switch for � konvertere tall til bokstaver
			{
				case 0:
						lagretHus[i][1]="A";  
        				break;
				case 1:
	            		lagretHus[i][1]="B";
	            		break;
	            case 2:
	            		lagretHus[i][1]="C";
	            		break;
	            case 3:
	            		lagretHus[i][1]="D";
	            		break;
	            case 4:
	            		lagretHus[i][1]="E";
	            		break;
	            case 5:
	            		lagretHus[i][1]="F";
	            		break;
	            case 6:
	            		lagretHus[i][1]="G";  
	            		break;
             }
			
			switch (nextPositionY)							 //switch fir � konvertere tall til bokstaver
			{
				case 0:
						lagretHus[i][0]="A";  
        				break;
				case 1:
	            		lagretHus[i][0]="B";
	            		break;
	            case 2:
	            		lagretHus[i][0]="C";
	            		break;
	            case 3:
	            		lagretHus[i][0]="D";
	            		break;
	            case 4:
	            		lagretHus[i][0]="E";
	            		break;
	            case 5:
	            		lagretHus[i][0]="F";
	            		break;
	            case 6:
	            		lagretHus[i][0]="G";  
	            		break;
             }
			
			

			x[currentPositionY][nextPositionY]=0;			//nullstiller verdi i brukt vei.
			x[nextPositionY][currentPositionY]=0;			
			lagretVei[i]=checkValue;						//legger verdi av vei i tabell
			antallBesok++;									//teller opp antallet bes�kte hus
			arrayVisited[i+1]=currentPositionY;				//legger inn bes�kt hus i tabell over bes�kte hus
			value=value+checkValue;							//�ker total verdi
			checkValue=666;									//setter checkvalue over maksverdien
			
		}
		//printer etterspurte verdier
		System.out.println("Du begynner i hus " + lagretHus[0][0]+"\n");
		System.out.println("Total kostnad for telefonkabelen er "+ value+" (tusen),-\n");
		System.out.println("Parvis har du valgt f�lgende hus med tilh�rende kostnad for kabel mellom husene\n");
		
		for(int p=0; p<6; p++)
		{
			System.out.println("Hus " + lagretHus[p][0] + " til  Hus " + lagretHus[p][1]);
			System.out.println("lengde " + lagretVei[p]+"\n");
	
		}
		
	}
	
	public static boolean isArray (int[] w, int check, int y) //metode for � sjekke om verdi er tilkoblet f�r.
	{
		
		for(int i =0; i<y;i++)
		{
		
			if (w[i]==check)	
			{
				return true;
			}
		}
		return false;
	}
}
