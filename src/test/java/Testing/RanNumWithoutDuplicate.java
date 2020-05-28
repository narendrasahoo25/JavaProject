package Testing;

public class RanNumWithoutDuplicate {

			public static void main(String[] args) {
			int n = 50;
			RanNumWithoutDuplicate obj=new RanNumWithoutDuplicate();
			obj.generateRandomNumber(n);
		}
		public void generateRandomNumber(int n) {
			int[] random = new int[n]; 
			int[] array = new int[n]; 
			for(int counter = 0; counter < random.length; counter++)
				random[counter] = counter; 
			int lat;
			for(int counter = 0; counter < random.length; counter++) {
				lat = (int)(Math.random()*n);
				while(random[lat] == -1)
					lat = (int)(Math.random()*n);
				if(random[lat] != -1)
					array[counter] = random[lat];
				random[lat] = -1;
			}

			for(int counter = 0; counter < array.length; counter++)
				array[counter] = array[counter] + 1;
			for(int counter = 0; counter < array.length; counter++)
				System.out.print(array[counter] + "\t");
		}
	}

