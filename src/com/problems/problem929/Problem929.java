/*929. Unique Email Addresses

Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?



Example 1:

Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
* */

package com.problems.problem929;

import java.util.*;

public class Problem929 {
    public static void main(String[] args) {
        var instance = new Problem929();

        String[] input = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};

        int result = instance.numUniqueEmails(input);

        System.out.println(result);
    }

    public int numUniqueEmails(String[] emails) {
        String[] subStrings;
        Set<String> set = new HashSet<>();
        String firstPart;

        for (String s : emails) {
            subStrings = s.split("@");
            firstPart = subStrings[0].replace(".", "");

            if (firstPart.contains("+")) {
                firstPart = firstPart.substring(0, firstPart.indexOf("+"));
            }
            set.add(firstPart + "@" + subStrings[1]);
        }

        return set.size();
    }
}
