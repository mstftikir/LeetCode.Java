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
