import java.util.*;

public class TestStack{
	
	//main method
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		HeirMyStack HMYStack = new HeirMyStack();
		
		//for loop 把使用者輸入存進陣列
		for(int i = 1; i <= 5; i++){
			System.out.print("Enter a string\n");
			String scanner = scanner1.next();
			HMYStack.push(scanner);
		}
		
		//用迴圈將陣列印出
		while(!HMYStack.isEmpty()){
			System.out.print(HMYStack.pop() + " ");
		}
	}
}
