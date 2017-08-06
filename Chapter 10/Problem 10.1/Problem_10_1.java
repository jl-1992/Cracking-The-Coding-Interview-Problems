public class Problem_10_1{
	
	public int[] sortMerge(int[] a, int[] b){
		for(int i=0, k=0;k<b.length;++i){
			if(b[k]<a[i]){
				for(int j=a.length-1;j>i;--j){
					a[j]=a[j-1];
				}
				a[i]=b[k];
				++k;
			}
			while(b[k]>a[i] && a[i]!=0){
				++i;
			}
			if(b[k]<=a[i]){
				for(int j=a.length-1;j>i;--j){
					a[j]=a[j-1];
				}
				a[i]=b[k];
				++k;
			}
			if(a[i]==0){
				a[i]=b[k];
				++k;
			}
		}
		return a;
	}

	public static void main(String[] args){
		Problem_10_1 p = new Problem_10_1();
		int[] a = {1,2,3,0,0,0};
		int[] b = {1,2,3};
		int[] c = new int[a.length];
		c=p.sortMerge(a,b);
		for(int i=0;i<c.length;++i)
			System.out.println(c[i]);
	}
}