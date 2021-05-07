class ArrayDemo{
	public static void main(String[] args){
	
		int a[];
		a = new int[9];

		a[0] = 23;
		a[1] = 45;
		a[2] = 12;
		a[3] = 56;
		a[4] = 17;
		a[5] = 19;
		a[6] = 20;
		a[7] = 8;
		a[8] = 45;
		System.out.println(a[4]);
		a[4] = 24;
		System.out.println(a[4]);
		
		b = new int[100];
		
		//copying items from array a to array b
		for(int i=0; i<9; i++)
			b[i]=a[i];
		
		a = null;
	
	}
}