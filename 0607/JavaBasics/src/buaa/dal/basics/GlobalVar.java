package buaa.dal.basics;
public class GlobalVar {
	int a = 10; // 全局变量,下同
	double b = 20;

	public static void main(String[] args) {
		// globalVar 为 GlobalVar类的 对象或 instance实例
		// new + 构造函数赋初值
		GlobalVar globalVar = new GlobalVar();
		System.out.println("全局变量  a = " + globalVar.a);
		// System.out.println("全局变量  a = " +a); 错误写法
		globalVar.print();
		System.out.println("全局变量变化后  a = " + globalVar.a);
	}

	public void print() {
		System.out.println("在print()中, 全局变量　a = " + a + ", b = " + b);
		a = 30;
		System.out.println("在print()中, 全局变量　a = " + a + ", b = " + b);
	}
}
