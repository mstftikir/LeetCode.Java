/*535. Encode and Decode TinyURL

Note: This is a companion problem to the System Design problem: Design TinyURL.
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
* */

package com.problems.problem535;

public class Problem535 {
    public static void main(String[] args) {
        Codec instance = new Codec();

        String input = "https://leetcode.com/problems/design-tinyurl";

        String resultEncoded = instance.encode(input);

        System.out.println(resultEncoded);

        String resultDecoded = instance.decode(resultEncoded);

        System.out.println(resultDecoded);
    }
}
