package javaStringReverse;

public class Solution {
		public static void main(String[] args) {
		String input = "HelloWorld";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);
	}

}
