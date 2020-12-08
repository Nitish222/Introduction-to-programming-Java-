interface CustomClass{
	//program flow
	public void cont(long start);
	
	//input
	public void inputSingleLine();
	public void inputDoubleLine();

	//conversion
	public void convertToIntegerArrayS(String str);
	public void convertToIntegerArrayD(String str1, String str2);
	//output
	public void outIntArray(int[] arry);
	public void outSumInt(int[] arry,int sum);
	public void outMaxInt(int[] arry,int max);
	public void outMaxChar(char ch);
	public void outCombinedInt(int[] arry);
	public void outSearchedIndexChar(int ind,char ch);
	public void outReverseChar(char[] rev);
	public void outLinearSortArray(char[] sort);



	//functions
	public int sumIntArray(int[] arry);
	public int maximumIntArray(int[] arry);
	public void maximumCharArray(char[] c);
	public int[] combineIntArray(int[] arry1,int[] arry2);
	public void searchCharArray(char[] arry);
	public void reverseCharArray(char[] c);
	public void swapCharArray(int i, int j, char[] c);


}