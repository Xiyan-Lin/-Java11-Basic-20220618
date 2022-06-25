package day2;

public class Test13 {
	public static void main(String[] args) {
		// 停車資訊
		int pos = 0b101101;
		System.out.println(pos);
		System.out.println(Integer.toBinaryString(pos));
		// 將 no 號的車子移開
		int no = 3;
		int car = (int)Math.pow(2, no);
		if((pos & car) > 0) {
			System.out.printf("%d 車位可以移車\n", no);
			// 進行移車
			//pos = pos - car;
			pos -= car;
			System.out.println(Integer.toBinaryString(pos));
			System.out.println(pos);
		} else {
			System.out.printf("%d 車位無車\n", no);
		}
	}
}