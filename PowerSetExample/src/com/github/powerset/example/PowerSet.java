/**
 * 
 */
package com.github.powerset.example;

/**
 * @author ranjan kumar
 *
 */
public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] array = { 'a', 'b', 'c' };
		int set_size = array.length;

		int pow_set_size = (int) Math.pow(2, set_size);

		for (int counter = 0; counter < pow_set_size; counter++) {
			for (int j = 0; j < set_size; j++) {
				int z = counter & (1 << j);
				// System.out.println(""+z);
				if (z != 0) {
					System.out.print("" + array[j]);
				}

			}
			System.out.println("-------");
		}

	}

}
