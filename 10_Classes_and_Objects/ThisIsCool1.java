/**
 * File Name: ThisIsCool1.java
 *
 * Write down what is wired/bad about his code. Run the code, is the output
 * what you expected?
 *
 * @author Mr. Dagler
 */

class ThisIsCool1
{
	public static void main(String[] args)
	{
		SomeClass1 sc1 = new SomeClass1(4, 7);
		System.out.println(sc1.getVals());
	}
}

class SomeClass1
{
	int valA, valB;

	SomeClass1(int valA, int valB)
	{
		valA = valA;
		valB = valB;
	}

	int getVals()
	{
		return 3*valA+3*valB;
	}
}
