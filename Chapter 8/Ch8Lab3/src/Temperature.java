/**
write a class that
encapsulates the concept of daily temperatures for a week
 */

/**
 * @author codie
 * 11/3/20
 */
public class Temperature {
	private int[] temperatures = new int[7];
	private int freezing;
	private int above;
	private int[] above100Array;
	private int highestChange;
	private int[] temp = new int[7];

	public Temperature(int[] temps) {
	temperatures = temps;
	above = getCountAbove();
	above100Array = new int[above];
	above100Array = temperaturesAbove100();
	}
	
	public Temperature() {
	}
	
	public int [] getTestTemperatures() {
	temp[0] = 97;
	temp[1] = 66;
	temp[2] = 88;
	temp[3] = 89;
	temp[4] = 90;
	temp[5] = 91;
	temp[6] = 77;
	temperatures = temp;
	return temperatures;
	}

	public int getCountAbove() {
	above = 0;
	
	for(int i = 0; i < temperatures.length; i++) {
		if(temperatures[i] > 100)
		above++;
	}
	return above;
	}
	
	public int belowFreezing() {
	for(int i = 0; i < temperatures.length; i++) {
		if(temperatures[i] < 33) {
		freezing++;
		}
	}
	return freezing;
	}

	public int[] temperaturesAbove100() {
	int count = 0;
	int j = 0;
	
	for(int i = 0; i < temperatures.length; i++) {
		if(temperatures[i] > 100) {
		above100Array[count] = temperatures[i];
		count++;
		}
	}
	return above100Array;
	}

	public int largestChange() {
	int highestChange = 0;
	
	for(int i = 1; i < temperatures.length; i++) {
		if(temperatures[i] > temperatures[i - 1]) {
			if((temperatures[i] - temperatures[i - 1]) > highestChange) {
			highestChange = temperatures[i] - temperatures[i - 1];
			}
		}
	else if(temperatures[i - 1] > temperatures[i]) {
		if((temperatures[i - 1] - temperatures[i]) > highestChange) {
		highestChange = temperatures[i - 1] - temperatures[i];
		}
	}
	}
	return highestChange;
	}

	public void sortArray() {
	int temp = 0;
	
	for(int i = 0; i < temperatures.length - 1; i++) {
		for(int j = 0; j < temperatures.length - 1; j++) {
			if(temperatures[j] > temperatures[j + 1]) {
			temp = temperatures[j];
			temperatures[j] = temperatures[j + 1];
			temperatures[j + 1] = temp;
			}
		}
	}
	}

	public String toString() {
	String returnString = "Temperatures: ";
	
	for ( int i = 0; i < temperatures.length; i++ ) {
		returnString += temperatures[i] + " ";
	}
	return returnString;
	}

	public boolean equals( Object o ) {
	if (!( o instanceof Temperature ))
		return false;
	else {
		Temperature g2 = (Temperature) o;
		if ( temperatures.length != g2.temperatures.length)
			return false;
		
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] != g2.temperatures[i])
				return false;
		}
		return true;
	}
	}

}
