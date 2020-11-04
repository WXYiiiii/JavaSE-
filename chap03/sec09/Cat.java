package com.java1234.chap03.sec09;
/**
 * 
 * 重写父类的say方法
 * 子类的方法有了，就不用父类的了
 * super();
 * @author Administrator
 *
 */
public class Cat extends Animal{

	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cat() {
		super();
		System.out.println("子类无参构造方法");
	}

	public Cat(String name, int age,String address) {
		super(name, age);
		this.address=address;
		System.out.println("子类有参构造方法");
	}

	/**
	 * 重写父类的say方法
	 */
	public void say(){
		
		super.say();// 调用父类的say方法
		System.out.println("我是一只猫，我叫："+this.getName()+"我的年龄是："+this.getAge()+",我来自"+this.getAddress());
	}
	
	public static void main(String[] args) {
		Cat cat=new Cat("Mini",2,"火星");
		cat.say();
		//先执行父类的构造方法，再执行子类的构造方法
	}
}
