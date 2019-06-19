/**
 * File Name: ThisIsCool2.java
 *
 * Write down what is wired/bad about his code. Run the code, is the output
 * what you expected?
 *
 * @author Mr. Dagler
 */

class ThisIsCool2
{
	public static void main(String[] args)
	{
		SomeClass2 sc2 = new SomeClass2(4, 7);
		System.out.println("= = = = = = = = = = = = = = =");
		sc2 = new SomeClass2();
	}
}

class SomeClass2
{
	int valA, valB;

	SomeClass2()
	{
		this(0, 0);
		System.out.println("I am in the constructor with no parameters.");
	}

	SomeClass2(int valA, int valB)
	{
		valA = valA;
		valB = valB;

		System.out.println("I am in the constructor with two parameters.");
	}

}
