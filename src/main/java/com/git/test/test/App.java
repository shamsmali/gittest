package com.git.test.test;

/**
 * Hello world!
 *
 */
public class App {
	static int itr = 0;

	public static void main(String[] args) {
		double s = 876876876;

		double g = s / 2 / 2;

		findSqrt(s, g);
	}

	private static void findSqrt(double s, double g) {
		if ((g * g) - s < 0.001) {
			System.out.println(g);
			return;
		} else {
			double approxSqrt = 0.5 * ((s / g) + g);
			System.out.println("after itr " + itr + " approx is " + approxSqrt);
			itr++;
			findSqrt(s, approxSqrt);
		}

	}
}
