public class MaxSearch{
	public static void main(String[] args){
		int largestNumber[]={20,12,21,31,24,36,41,32};
		
		int smallest = largestNumber[0];
		int largest = largestNumber[0];
		
		for(int i=0;i<largestNumber.length;i++){
			if(largestNumber[i] < smallest) smallest=largestNumber[i];
			if(largestNumber[i] > largest) largest=largestNumber[i];
		}
		System.out.println("The Largest number is: "+largest);
	}


}