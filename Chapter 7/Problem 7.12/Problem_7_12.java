class Problem_7_12{
	
	public static void main(String[] args){
		int nums[] = {11,7,36,99,34,45,81,42,17,1,194,673,230,999};
		HashTable h = new HashTable();

		for(int i=0; i<nums.length;++i){
			h.addNum(nums[i]);
		}

		//h.printHash();
		System.out.println(h.get(3));
	}
}