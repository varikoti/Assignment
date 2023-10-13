import java.util.Arrays;
import java.util.Random;
class ShuffleArrays 
{
	public static void main(String[] args) 
	{
		int[] arr ={1,2,4,5,6};
		shuffleArray(arr);
		System.out.println("Shuffled array: "+Arrays.toString(arr));
 	}

	public static void shuffleArray(int[] array) 
	{
		int n = array.length;
		Random rand = new Random();

		for(int i = n -1; i > 0; i--)
		{
			int j = rand.nextInt(i+1);

			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
