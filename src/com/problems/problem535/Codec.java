package com.problems.problem535;

import java.util.HashMap;
import java.util.Map;

public class Codec {

    private final Map<String, String> urlMap;
    private Integer lastUrlId;
    private final static String tinyUrl = "http://tinyurl.com/";
    public Codec(){
        urlMap = new HashMap<>();
        lastUrlId = 0;
    }

    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder();
        if(urlMap.containsKey(longUrl)){
            sb.append(tinyUrl);
            sb.append( urlMap.get(longUrl));
        }
        else{
            lastUrlId++;

            sb.append(tinyUrl);
            sb.append(lastUrlId.toString());

            urlMap.put(longUrl, sb.toString());
        }
        return sb.toString();
    }


    public String decode(String shortUrl) {
        if(urlMap.containsValue(shortUrl)){
            for (Map.Entry<String, String> st :
                    urlMap.entrySet()) {
                if(st.getValue().equals(shortUrl)){
                    return st.getKey();
                }
            }
        }

        return "No such a url encoded.";
    }
}
