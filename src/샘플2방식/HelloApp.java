package ����2���;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean bean;
		
		bean = new MessageBeanEn();
		bean.sayHello("Kim Seon Jeong");
		
		bean = new MessageBeanKr();
		bean.sayHello("�輱��");

	}

}
