/*
在執行程式時帶入參數
例如: java Hello8 170 65  <- 170 與 65 就是帶入的參數
*/
public class Hello8 {
	public static void main(String[] args) {
		var v1 = args[0]; // 取得第一個參數內容
		var v2 = args[1]; // 取得第二個參數內容
		System.out.println(v1);
		System.out.println(v2);
	}
}