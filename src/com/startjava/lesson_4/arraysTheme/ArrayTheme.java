package com.startjava.lesson_4.arraysTheme;

import java.util.Arrays;

public class ArrayTheme {
	
	public static void main(String[] args) {		
		revers();
		composition();
		deleting();
		alfabetOutput();
		fillingArr();
 	}
	
	private static void revers() {
		System.out.println("\n\t" + "ЗАДАНИЕ 1 \nРеверс значений массива\n");
		int[] nums = {7, 6, 2, 3, 5, 4, 1};
		int len = nums.length - 1;
		System.out.println("До реверса: " + Arrays.toString(nums));
		
		for (int i = 0; i <= len / 2; i++, len--) {
			int temp = nums[i];
			nums[i] = nums[len];
			nums[len] = temp;
		}
		System.out.println("После реверса " + Arrays.toString(nums));
	}
	
	private static void composition() {
		System.out.println("\n\n\t" + "ЗАДАНИЕ 2 \nПроизведение элементов массива\n");
		int [] nums = new int[10];
		int len = nums.length;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
		}		
		
		String sign = "";		
		int sum = 1;
		for (int i = 1; i < len - 1; i++) {
			sum *= nums[i];
			sign = nums[i] != nums.length - 2 ? " * " : " = " + sum ;
		System.out.print(nums[i] + sign);
		}	
	}
	
	private static void deleting() {
		System.out.println("\n\n\t" + "ЗАДАНИЕ 3 \nУдаление элементов массива\n");
		double [] nums = new double[15];
		int len = nums.length;
		for (int i = 0; i < len - 1; i++) {
			nums[i] = Math.random();
		}
		System.out.println("До обнуления: ");
		soutArr(nums);
		
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] > nums[len / 2]) {
				count ++;
				nums[i] = 0;
			}			
		}
		System.out.println("\nПосле обнуления: ");
		soutArr(nums);
		System.out.println("\nКоличество обнуленных ячеек: " + count);
	}		
		
	private static void soutArr(double[] arr) {
		for (int  i = 0; i < arr.length; i++) {
			if (i == 8) {
				System.out.println();
			} 
			System.out.printf("%.3f ", arr[i]);
		}		
	}
	
	private static void alfabetOutput() {
		System.out.println("\n\n\t" + "ЗАДАНИЕ 4 \nВывод алфавита лесенкой\n");
		char[] nums = new char[26];
		int len = nums.length;
		for (int i = len - 1; i >= 0; i--) {
			for (int j = len - 1; j >= i; j--) {
				nums[i] = (char)(i + 65);
				System.out.print(nums[i] + " ");
			}
			System.out.println();
		}	
	}	

	private static void fillingArr() {
		System.out.println("\n\n\t" + "ЗАДАНИЕ 5 \nЗаполнение массива уникальными числами\n");
		int[] nums = new int[30];
		int len = nums.length;

		nums[0] = (int) (Math.random()*(99 - 60)) + 60;
		for (int i = 0; i <= len - 1; i++) {
			int randomNum = (int) (Math.random()*(99 - 60)) + 60;
			for ( int j = 0; j <= i; j++) {
				if (randomNum == nums[j]) {
					i--;
					randomNum = -1;
					break;
				}
			}	
			if (randomNum != -1) {
				nums[i] = randomNum;
			}
		}
		
		Arrays.sort(nums);
		print(nums);
		}		
			
	private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i % 10 == 0 ? "\n" : array[i] + " ");
        }
	}	
}
