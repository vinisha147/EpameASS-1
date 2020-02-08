import java.util.*;


class Sweets
{
	double weight;
	int price_of_sweets;
	Sweets(double weight,int price_of_sweets)
	{
		this.weight=weight;
		this.price_of_sweets=price_of_sweets;
	}
}

class Chocolates 
{
	double weight;
	int price_of_choco;
	Chocolates(double weight,int price_of_choco)
	{
		this.weight=weight;
		this.price_of_choco=price_of_choco;
		
	}
}

class ChildrensNewYearGifts
{
	int noOfSweets;
	int noOfChoco;
	Sweets sweet[];
	Chocolates choco[];
	
	ChildrensNewYearGifts(int noOfSweets,int noOfChoco,double weightOfSweets[],int price_of_sweets[],double weightOfChoco[],int price_of_choco[])
	{
		this.noOfSweets=noOfSweets;
		this.noOfChoco=noOfChoco;
		sweet=new Sweets[noOfSweets];
		choco=new Chocolates[noOfChoco];
		int i;	
		
		for(i=0;i<noOfSweets;i++)
		{
			sweet[i]=new Sweets(weightOfSweets[i],price_of_sweets[i]);
		}
		
		
		for(i=0;i<noOfChoco;i++)
		{
			choco[i]=new Chocolates(weightOfChoco[i],price_of_choco[i]);
		}
		
	}
	
}

public class Epam1 
{
	public static void main(String args[])
	{
		int noOfChoco;
		int noOfSweets;
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of chocolates:");
		noOfChoco=sc.nextInt();
		
		System.out.println("Enter number of sweets:");
		noOfSweets=sc.nextInt();
		
		double weightOfChoco[]=new double[noOfChoco];
		int price_of_choco[]=new int[noOfChoco];
		
		double weightOfSweets[]=new double[noOfSweets];
		int price_of_sweets[]=new int[noOfSweets];
		
		System.out.println("Enter the weight and price of each sweet");
		
		for(i=0;i<noOfSweets;i++)
		{
			System.out.println("Enter the weight and price of Sweet "+(i+1)+" :");
			weightOfSweets[i]=sc.nextDouble();
			price_of_sweets[i]=sc.nextInt();
		}
		
		System.out.println("Enter the weight and price of each Chocolate");
		
		for(i=0;i<noOfChoco;i++)
		{
			System.out.println("Enter the weight and price of Chocolate "+(i+1)+" :");
			weightOfChoco[i]=sc.nextDouble();
			price_of_choco[i]=sc.nextInt();
		}
		
		ChildrensNewYearGifts gifts=new ChildrensNewYearGifts(noOfSweets,noOfChoco,weightOfSweets,price_of_sweets,weightOfChoco,price_of_choco);
		
		for(i=0;i<noOfSweets;i++)
		{
			System.out.print("i: "+gifts.sweet[i].price_of_sweets);
			System.out.println(" : "+gifts.sweet[i].weight);
		}
		
		sc.close();
		
	}
}
