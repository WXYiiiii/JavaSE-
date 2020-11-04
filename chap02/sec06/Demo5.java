package com.java1234.chap02.sec06;
/**
 * 冒泡排序
 * 循环次数n-1
 * 比较次数n-1-i
 * 加入前边的数大于后面的数，则交换数据
 * @author Administrator
 *
 */
public class Demo5 {

	public static int w=0;
	public static int m=0;
	public static int f = 0;

	public static void main(String[] args) {
	//paixu();
	//zuizhi();
	//qiou();
		qudiaoling();
	}
	public static void paixu()
	{
		int temp;//用于交换
		int []arr={4,21,0,-12,-3};
		
		// 循环的次数 n-1次
		for(int i=0;i<arr.length-1;i++){
			// 比较次数 n-1-i
			for(int j=0;j<arr.length-1-i;j++){
				// 假如前面一个数大于后面一个数，则交换数据
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	
	public static void zuizhi()
	{
		int t;
		int arr2[]= {8,9,6,3,7,-12,99};
		for(int i=0;i<arr2.length-1;i++)
		{
			for(int j=0;j<arr2.length-1-i;j++)
			if(arr2[j]>arr2[j+1])
			{
				t=arr2[j];
				arr2[j]=arr2[j+1];
				arr2[j+1]=t;
			}
		}
		System.out.println("最小值为"+arr2[0]);
		System.out.println("最大值为"+arr2[arr2.length-1]);
	}
	
	//奇数偶数的个数
	public static void qiou() {
		//int t;
		int arr2[]= {8,9,6,3,7,12,99};
		for(int i=0;i<arr2.length;i++)
		/*{
			System.out.println(arr2[i]%2);
		}*/
		
		{
			switch (arr2[i]%2) {
			case 0:{  
			
				w++;
				//System.out.println("偶数的个数为"+w);
				break;
			}
			case 1:{  
			
				m++;
				//System.out.println(arr2[i]+"是个奇数。arr2[i]%2="+arr2[i]%2+" "+"m="+m);
			}
			}
			
		}
		
		
		System.out.println("偶数的个数为"+w);
		System.out.println("奇数的个数为"+m);
	
	}
	
	public static void qudiaoling() {
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		for (int i=0;i<oldArr.length ;i++ )
		{
		int c=0;
		if ((oldArr[i]-0)==0)
		{
		c++;
		}
		else
		{
		int newArr[]=new int[oldArr.length-c];
		for (int j=0;j<oldArr.length;j++ )
		{
		newArr[j]=oldArr[i];//把旧数组不为零的值付给新数组newArr
		}
		System.out.print(newArr[i]+",");
		}
		}
		
				}
	
}
