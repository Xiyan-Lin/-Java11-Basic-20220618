package day2;

public class Test12 {
	public static void main(String[] args) {
		int pos = 0b100101;
		// 印出十進位值
		System.out.println(pos); 
		// 印出二進位值
		System.out.println(Integer.toBinaryString(pos)); 
		// 有一台車想停 no 號車位
		int no = 3; // 車位
		int car = (int)Math.pow(2, no); // 車
		if ((pos & car) == 0) {
			System.out.printf("%d 車位可以停車\n", no);
			// 將車子停進停車格
			//pos = pos + car;
			pos += car;
			System.out.println(Integer.toBinaryString(pos)); 
			System.out.println(pos);
		} else {
			System.out.printf("%d 車位不可停車\n", no);
		}
	}
}