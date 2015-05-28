package salwe;

public class Factorial {

	public static int count(int i) {
		if( i < 0)
			throw new UnderZeroException();
		else if(i == 0)
			return 1;
		else
			return i*count(i-1);
	}

}
