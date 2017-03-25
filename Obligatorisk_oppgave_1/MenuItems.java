class MenuItems
{
	static String[]menuItems =
	{
		"	MENY for SingellinkedListe",
		" 1. Slett det første elementet i listen",
		" 2. Slett det siste elementet i listen.",
		" 3. Slett et element med oppgitt verdi fra listen (slett kun første forekomst)",
		" 4. Slett alle element med oppgitt verdi fra listen",
		" 5. Legg til et element med oppgitt verdi i starten av listen",
		" 6. Legg til et element med oppgitt verdi i slutten av listen",
		" 7. Legg til et element etter et element med oppgitt verdi (gjøres én gang)",
		" 8. Legg til et element foran et element med oppgitt verdi (gjøres én gang)",
		" 9. Skriv ut lengden på listen",
		"10. Tell opp antall forekomster av element med gitt verdi i lista" +
		"\n    dette antallet skrives ut",
		"11. Skriv ut hele listen. Maks 5 elementer pr. linje.",
		"12. Slett hele listen. Hvor mange elementer som ble slettet, skrives ut.",
		"13. Vis valgene i menyen en gang til",
		" 0. AVSLUTT PROGRAMMET\n",
		"skriv inn tallet for ditt menyvalg\n"
	};

	public static void printMenuItems()
	{
		for(int i=0; i<16; i++)
		{
			System.out.println(menuItems[i]);
		}
	}
}