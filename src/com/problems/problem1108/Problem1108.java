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
    	var copyOfAddress = address.toCharArray();
    	for (int i = 0; i < copyOfAddress.length; i++) {
			if(copyOfAddress[i] == '.') {
				result += "[.]";
			}
			else {
				result += copyOfAddress[i];
			}
		}
    	return result;
    }
}
