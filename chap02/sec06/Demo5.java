package com.java1234.chap02.sec06;
/**
 * ð������
 * ѭ������n-1
 * �Ƚϴ���n-1-i
 * ����ǰ�ߵ������ں���������򽻻�����
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
		int temp;//���ڽ���
		int []arr={4,21,0,-12,-3};
		
		// ѭ���Ĵ��� n-1��
		for(int i=0;i<arr.length-1;i++){
			// �Ƚϴ��� n-1-i
			for(int j=0;j<arr.length-1-i;j++){
				// ����ǰ��һ�������ں���һ�������򽻻�����
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
		System.out.println("��СֵΪ"+arr2[0]);
		System.out.println("���ֵΪ"+arr2[arr2.length-1]);
	}
	
	//����ż���ĸ���
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
				//System.out.println("ż���ĸ���Ϊ"+w);
				break;
			}
			case 1:{  
			
				m++;
				//System.out.println(arr2[i]+"�Ǹ�������arr2[i]%2="+arr2[i]%2+" "+"m="+m);
			}
			}
			
		}
		
		
		System.out.println("ż���ĸ���Ϊ"+w);
		System.out.println("�����ĸ���Ϊ"+m);
	
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
		newArr[j]=oldArr[i];//�Ѿ����鲻Ϊ���ֵ����������newArr
		}
		System.out.print(newArr[i]+",");
		}
		}
		
				}
	
}
