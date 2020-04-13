package com.chap02;

public class Array04 {
	
	public static void main(String[] args) {
		int counter = 0;
		int primeCount = 0;
		int[] prime = new int[500];
		prime[primeCount++] = 2;
		prime[primeCount++] = 3;
		
		for (int n = 5; n <= 1000 ; n+= 2) {
			boolean flag = false;
			for (int i = 1; prime[i]*prime[i] <= n; i++) {
				counter += 2;
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				prime[primeCount++] = n;
				counter++;
			}
		}
		for (int i = 0 ; i < primeCount ; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
	}

}
