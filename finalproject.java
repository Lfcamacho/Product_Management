import java.util.*;
public class finalproject {

   public static Scanner sc = new Scanner(System.in);
   public static Scanner read = new Scanner(System.in);
   public static void main(String[] args){

	   int op=0, adapt=0, quantity=0, i=0, rep=0;

		int []number=new int[100];
		String []description=new String[100];
		int []price=new int[100];
		int []units=new int[100];

while(op!=6)
{

	int a=0, b=0, c=0, d=0, n=0, num=0, p=0, u=0, e=0, z=0, j=0, k=0;
	String des, op1;
	i=0;


System.out.println("WHICH OPERATION DO YOU WANT TO DO\n");
System.out.println("\tAdd Product....................1");
System.out.println("\tRemove Product.................2");
System.out.println("\tModify Product.................3");
System.out.println("\tReport.........................4");
System.out.println("\tProduct Ins and Outs...........5");
System.out.println("\tExit...........................6\n");

System.out.print("Option: ");
op=sc.nextInt();
System.out.println("\n");


switch(op)
{
	case 1:

		i=0;
		n=0;
		num=0;
		p=0;
		u=0;


		System.out.println("====Add Product====");

		//number
		do{
			System.out.println("Insert product number: ");
			n=sc.nextInt();

			if(adapt>1)
			{
			num=number(number,n,adapt);
			}

			if(num==1)
			{
				System.out.println("This number is duplicated");
				System.out.println();
			}

		}while(num==1);
		System.out.println();


		//description
		System.out.println("Insert product description: ");
		des=read.nextLine();
		System.out.println();


		//price
		do{
			System.out.println("Insert product's price: ");
			p=sc.nextInt();

			if(p<=0)
			{
				System.out.println("The price is below 0");
				System.out.println();
			}
		}while(p<=0);
		System.out.println();


		//quantity
		do{
			System.out.println("Insert number of in stock units: ");
			u=sc.nextInt();

			if(u<=0)
			{
				System.out.println("The number is below 0");
				System.out.println();
			}
		}while(u<=0);
		System.out.println();

		number[adapt]=n;
		description[adapt]=des;
		price[adapt]=p;
		units[adapt]=u;

		adapt++;


	break;

	case 2:

		   	i=0;
		   	e=0;
		   	num=0;
		   	p=0;
		   	u=0;
		   	z=0;

			System.out.println();

			System.out.println("====Remove Product====");

			//Remove Product

			do{
				System.out.println("Insert product's number: ");
				e=sc.nextInt();
				num=validate(number,e);


				while(j<100)
				{
					if(number[j]==e)
					{
						k=j;
					}

					j++;
				}

				System.out.println();
				if(num==1)
				{

					System.out.println("The product exists");
					System.out.println();
					System.out.println("number: "+e);
					System.out.println("description: "+description[k]);
					System.out.println("price: $"+price[k]);
		   			System.out.println("In stock units: "+units[k]);
					System.out.println();
					System.out.println("¿do you wish to delete it?");
					System.out.println("Yes...............1");
					System.out.println("No...............0");
					System.out.println("Insert option: ");
					z=sc.nextInt();



					if(z==1)
					{
						while(k<99)
						{
							number[k]=number[k+1];
							description[k]=description[k+1];
							price[k]=price[k+1];
							units[k]=units[k+1];

							k++;

						}
		  	 		 	System.out.println("Product removed");
		  	 		 	adapt--;
					}
					else
					{
						System.out.println("Product not removed");
					}
				}
				else
				{
					System.out.println("This product already exists");
					System.out.println();
				}
			}while(num!=1);
			System.out.println();


	break;

	case 3:

		do{
			System.out.println("Insert product number you want to modify: ");
			a=sc.nextInt();
			num=number(number,a,adapt);

			if(num!=1)
			{
				System.out.println("number not found, insert another one");
				System.out.println();
			}
			else
			{
				for(i=0;i<adapt;i++)
				{
					if(a==number[i])
					{
						e=i;
					}
				}
			}

		}while(num!=1);

				System.out.println("Product number: "+number[e]);
				System.out.println("Description: "+description[e]);
				System.out.println("Price: "+price[e]);
				System.out.println("Units in stock: "+units[e]);
				System.out.println("\n");

		System.out.println();

		System.out.println("Choose what you want to modify "+a+"\n");
		System.out.println("\tDescription.................1");
		System.out.println("\tPrice.......................2\n");
		System.out.print("Option: ");
		op=sc.nextInt();
		System.out.println();
		switch(op)
		{

		case 1:

			System.out.print("Insert new description for the product "+a+":");
			description[e]=read.nextLine();
			System.out.println();

		break;

		case 2:


			System.out.print("Insert new price for the product "+a+":");
			do{
			price[e]=sc.nextInt();

			if(price[e]<=0)
			{
				System.out.println("Invalid price, insert another one");
			}

			}while(price[e]<=0);

		break;
		}

	break;

	case 4:

		reports(number, description, price, units, adapt);

	break;

	case 5:

		do{
			System.out.println("Insert product's number you want to modify: ");
			a=sc.nextInt();
			num=number(number,a,adapt);

			if(num!=1)
			{
				System.out.println("product not found, insert another number");
				System.out.println();
			}
			else
			{
				for(i=0;i<adapt;i++)
				{
					if(a==number[i])
					{
						e=i;
					}
				}
			}

		}while(num!=1);

				System.out.println("product number: "+number[e]);
				System.out.println("description: "+description[e]);
				System.out.println("price: "+price[e]);
				System.out.println("in stock units: "+units[e]);
				System.out.println("\n");

		System.out.println("Which operation are you making "+a+"\n");
		System.out.println("\tBuying units....................1");
		System.out.println("\tSelling units...................2\n");
		System.out.print("Option: ");
		op=sc.nextInt();
		System.out.println();
		switch(op)
		{

		case 1:


			System.out.print("Insert number of units bought: ");

			do{
			b=sc.nextInt();

			if(b<=0)
			{
				System.out.println("Invalid number, insert another one");
			}

			}while(b<=0);

		units[e]=units[e]+b;

				System.out.println("product number: "+number[e]);
				System.out.println("description: "+description[e]);
				System.out.println("price: "+price[e]);
				System.out.println("in stock units: "+units[e]);
				System.out.println("\n");

		break;

		case 2:

			System.out.print("Insert number of units sold:");

			do{
			b=sc.nextInt();

			if(b<=0||b>units[e])
			{
				System.out.println("Invalid number, insert another one");
			}

			}while(b<=0||b>units[e]);

		units[e]=units[e]-b;

				System.out.println("product number: "+number[e]);
				System.out.println("description: "+description[e]);
				System.out.println("price: "+price[e]);
				System.out.println("in stock units: "+units[e]);
				System.out.println("\n");
		break;
		}

	break;

	case 6:

		System.out.println("You have exit the program");

	break;

	default:

		System.out.println("Invalid option, select another one");

	break;

}//switch

}//while

}


	 public static int number(int n[], int a, int adapt)
	 {
		int i=0;

		do
		{
			for(i=0;i<adapt;i++)
			{
				if(a==n[i])
				{
					a=1;
				}
			}
		}while(a!=1&&i<adapt);

		 return a;

 	}



	 //validate value
	 public static int validate(int n[], int a)
	  {
	 	int i=0;

	 	do
	 	{
	 		for(i=0;i<n.length;i++)
	 		{
	 			if(a==n[i])
	 			{
	 				a=1;
	 			}
	 		}
	 	}while(a!=1&&i<n.length);


	 	 return a;

	 }





//report
	public static int reports(int[]number, String[]description, int[]price, int[]units, int adapt)
	{
		int a=0, b=0, c=0, op=0, op1=0;
		String c1;


	System.out.println("BASED ON WHAT YOU WANT TO ORDER\n");
	System.out.println("\tProduct number.............1");
	System.out.println("\tProduct name...............2\n");
	System.out.print("Option: ");
	op1=sc.nextInt();
	System.out.println();

	switch(op1)
	{

		case 1:

			System.out.println("IN WHICH ORDER DO YOU WANT TO DISPLAY\n");
			System.out.println("\tAscending.............1");
			System.out.println("\tDescending............2\n");
			System.out.print("Option: ");
			op=sc.nextInt();
			System.out.println();

			switch(op)
			{

			case 1:

				while(a<adapt)
				{
					b=a+1;
					while(b<adapt)
					{
						if(number[b]<number[a])
						{
							c=number[a];
							number[a]=number[b];
							number[b]=c;

							c1=description[a];
							description[a]=description[b];
							description[b]=c1;

							c=price[a];
							price[a]=price[b];
							price[b]=c;

							c=units[a];
							units[a]=units[b];
							units[b]=c;
						}
						b++;

					}

					a++;
				}

				a=0;

				while(a<adapt)
				{
					System.out.println("product number: "+number[a]);
					System.out.println("description: "+description[a]);
					System.out.println("price: "+price[a]);
					System.out.println("in stock units: "+units[a]);
					System.out.println("\n");
					a++;
				}

			break;

			case 2:

			a=0;
			b=0;
			c=0;

				while(a<adapt)
				{
					b=a+1;
					while(b<adapt)
					{
						if(number[b]>number[a])
						{
							c=number[a];
							number[a]=number[b];
							number[b]=c;

							c1=description[a];
							description[a]=description[b];
							description[b]=c1;

							c=price[a];
							price[a]=price[b];
							price[b]=c;

							c=units[a];
							units[a]=units[b];
							units[b]=c;
						}
						b++;

					}

					a++;
				}

				a=0;

				while(a<adapt)
				{
					System.out.println("product number: "+number[a]);
					System.out.println("description: "+description[a]);
					System.out.println("price: "+price[a]);
					System.out.println("in stock units: "+units[a]);
					System.out.println("\n");
					a++;
				}

			break;

			}
		break;

		case 2:


			System.out.println("IN WHICH ORDER DO YOU WANT TO DISPLAY\n");
			System.out.println("\tAscending.............1");
			System.out.println("\tDescending............2\n");
			System.out.print("Option: ");
			op=sc.nextInt();
			System.out.println();

			switch(op)
			{
			case 1:

			a=0;
			b=0;
			c=0;

				while(a<adapt)
				{
					b=a+1;
					while(b<adapt)
					{

						if(description[b].compareToIgnoreCase(description[a])<0)
						{
							c=number[a];
							number[a]=number[b];
							number[b]=c;

							c1=description[a];
							description[a]=description[b];
							description[b]=c1;

							c=price[a];
							price[a]=price[b];
							price[b]=c;

							c=units[a];
							units[a]=units[b];
							units[b]=c;
						}
						b++;

					}

					a++;
				}

				a=0;

				while(a<adapt)
				{
					System.out.println("product number: "+number[a]);
					System.out.println("description: "+description[a]);
					System.out.println("price: "+price[a]);
					System.out.println("in stock units: "+units[a]);
					System.out.println("\n");
					a++;
				}

			break;

			case 2:

			a=0;
			b=0;
			c=0;

				while(a<adapt)
				{
					b=a+1;
					while(b<adapt)
					{
						if(description[b].compareToIgnoreCase(description[a])>0)
						{
							c=number[a];
							number[a]=number[b];
							number[b]=c;

							c1=description[a];
							description[a]=description[b];
							description[b]=c1;

							c=price[a];
							price[a]=price[b];
							price[b]=c;

							c=units[a];
							units[a]=units[b];
							units[b]=c;
						}
						b++;

					}

					a++;
				}

				a=0;

				while(a<adapt)
				{
					System.out.println("product number: "+number[a]);
					System.out.println("description: "+description[a]);
					System.out.println("price: "+price[a]);
					System.out.println("in stock units: "+units[a]);
					System.out.println("\n");
					a++;
				}

			break;

			}
		}

		System.out.println("The number of products in the inventory is: "+adapt+"\n");

		return 0;
	}


}