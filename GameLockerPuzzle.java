/*PUZZLE:-

	A School has nLock lockers and nStud Students. All lockers are closed on the first day of school. As the students enter, the first student, opens every locker. Then the second student, begins with the second locker, and closes every other locker. Student 3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if
it was closed) and so on, until student
last student changes last locker.
*/


import java.util.*;
public class GameLockerPuzzle
{
public static void main(String[] args)
{

	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of lockers:");
	int nLock = in.nextInt();
	int flag=0,i,j,nStud=0;
	while(flag !=1)
	{
		System.out.println("Enter the number of students (<= lockers): ");
		nStud = in.nextInt();
		flag=1;
		if(nLock<nStud)
		{
			System.out.println("No. of students are more than no. of lockers. Try again.....\n\n");
			flag =0 ;
		}
	}
	if(nStud == 1)
	{
		System.out.println("All the lockers are open!");
		System.exit(0);
	}
	else if(nStud == 0)
	{
		System.out.println("All the lockers are closed!");
		System.exit(0);
	}
	boolean locker[] = new boolean[nLock];
	for(i=0;i<nLock;i++)
		locker[i]=false;
	//true = lock and false = open
	for(i=1;i<nStud;i++)
	{
		locker[i]=false;
		for(j=i;j<nLock-1;j++)
		{
			
			locker[j+1]= !locker[j+1];
		}
	}
	
	
	//Alternative (Shorter Program )

/*
	System.out.println("The no. of open lockers are: ");
	
	if(nStud % 2 == 0)
		for(i=1 ; i<=nStud ; i++)
		System.out.print(i+" ");
	else
		for(i=1 ; i<=nLock ; i++)
			System.out.print(i+" ");
		
*/
	System.out.print("\n\nThe lockers which are open are: ");
	for(i=0;i<nLock;i++)
	{
		if(locker[i]==false)
		{
			System.out.print((i+1)+" ");
		}
			
	}
	System.out.println("\n\n");
	
}
}

