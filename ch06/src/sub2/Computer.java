package sub2;


public class Computer {

	// 특성(멤버변수)
	private String cpu;
	private String ram;
	private String hdd;
	
	// 생성자
	public Computer(String cpu, String ram, String hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	// 기능(멤버메서드)
	public void calc() {
		System.out.println("계산 중...");
	}

	public void internet() {
		System.out.println("인터넷 중...");
	}
	
	public void info() {
		System.out.println("=================");
		System.out.println("CPU : "+this.cpu);
		System.out.println("RAM : "+this.ram);
		System.out.println("HDD : "+this.hdd);
		System.out.println("-----------------");
	}
	
}
