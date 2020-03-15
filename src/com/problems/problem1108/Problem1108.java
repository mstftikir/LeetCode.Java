/*1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".


Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 

Constraints:

The given address is a valid IPv4 address.
 * */

package com.problems.problem1108;

public class Problem1108 {

	public static void main(String[] args) {
		var instance = new Problem1108();
		
		var input = "1.1.1.1";
		
		var result = instance.defangIPaddr(input);
		
		System.out.println(result);
	}
	
    public String defangIPaddr(String address) {
        //return address.replace(".", "[.]");
    	
    	String result = "";
    	for (int i = 0; i < address.length(); i++) {
			if(address.charAt(i) == '.') {
				result += "[.]";
			}
			else {
				result += address.charAt(i);
			}
		}
    	
    	return result;
    }
}
