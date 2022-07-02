package day3;

// 迴圈應用 do while
// 先執行, 再決定要不要繼續執行
public class Loop2 {
	public static void main(String[] args) {
		int count = 3;
		do {
			System.out.println("Java " + count);
			count--;
		} while(count > 0);
	}
}