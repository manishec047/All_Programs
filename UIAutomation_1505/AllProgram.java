Duplicate Character in Strings;

String s=" manishanand";

public void findDuplicatechar(String str)
{
	 
	 Map<Character,Integer> charMap= new HashMap<Character,Integer>;
	 char[] chars=s.toCharArray();
	 
	 for(Character ch:chars)
	 {
		 if(charMap.containsKey(ch))
		 {
			 charMap.put(ch,charMap.get(ch)+1);
			 
		 }
		 else
			 
			 {
				 charMap.put(ch,1);
			 }
	 }
	Set<Character> keys= charMap.keySet();
	   for(Character ch:keys)
	 {
		 syso(ch+ "----" charMap.gey(ch));
		 
}
===============================================================
Distinct Element In Array

    psvm{
		int[] array={5,2,7,8,8,6,9,5};
		
		for(int i=0;i<array.length;i++)
		{ boolean flag=false;
	
	      for(int j=0;j<i;j++)
	        if(array[i]== array[j])
			{
				flag=true;
				break;
			}
			if(!flag)

			{ syso(array[i]+ " " ); 
				}
		
	}
	
	
====================================
Calculate Sum Of Number of array
public class CalculateSumOfNumbersOfArray {
	
	public int calculateSumOfNumbers(){
		int[] a = {10,20,30,40};
		int sum = 0;
		for(int arr:a){
			sum = sum + arr;
		}
		return sum;
	}

======================================================
Count Number In Array

public class CountNumberInArray {
	
	public static void main(String[] args) {
		int[] a = {355,655,677};
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i =0; i<a.length; i++){
			char[] charr = String.valueOf(a[i]).toCharArray();
			for(int j =0; j<charr.length; j++){
				if(map.containsKey(charr[j])){
					map.put(charr[j], map.get(charr[j])+1);
				}
				else{
					map.put(charr[j], 1);
				}
			}
		}
		System.out.println(map);
		
	}



=========================================================
Generate Random Number 

public class GenerateRandomNumber {
	
	public void generateRandomNumber(){
		Random ran =  new Random();
		
		for(int i=0; i<5;i++){
			int number = ran.nextInt(200);
			System.out.println(number);
		}
	}
	
=======================================================
is Perfect Number

public boolean isPerfectNumber(int number){
		int temp = 0;
		for(int i =1; i<=number/2; i++){
			if(number % i == 0){
				System.out.println("i----"+i);
				temp = temp + i;
				System.out.println(temp);
			}
		}

		if(number == temp){
			return true;
		}
		return false;
		
============================================================

two Max Numbers In Array

public Public void twoMaxNumbersInArray(int[] a){
		int firstBigNumber = 0;
		int secondBigNumber = 0;
		
		for(int num:a){
			
			if(firstBigNumber < num){
				secondBigNumber = firstBigNumber;
				firstBigNumber = num;
				System.out.println("secondBigNumber:-"+secondBigNumber);
				System.out.println("firstBigNumber:-"+firstBigNumber);
				System.out.println("-------");
				
			}
			else if(secondBigNumber < num){
				secondBigNumber = num;
				
				System.out.println("secondBigNumber:-"+secondBigNumber);
				System.out.println("*******");
			}
		}
		
		System.out.println("firstBigNumber is:-"+firstBigNumber);
		System.out.println("secondBigNumber is:-"+secondBigNumber);



===============================================================
reverse Number

public void reverseNumber(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scn.nextInt();
		int reverse = 0;
		while(number!=0){
			reverse = reverse*10;
			reverse = reverse + number%10;
			number = number/10;
		}
		System.out.println("Reversed number is:-"+reverse);
	}
=======================================================================
Returns number of times x occurs in arr[0..n-1]
    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
    }
     
	 