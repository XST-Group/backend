package com.xst.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by CrazyCodess on 2016/5/1.
 */
public class RegexUtils {

    public static String getPicPath(String content){
        Pattern pattern = Pattern.compile("src=\"[http|https]+[://]+[0-9A-Za-z:/[-]_#[?][=][.][&]]*");
        Matcher matcher = pattern.matcher(content);

        if(matcher.find()) {
            return content.substring(matcher.start()+5,matcher.end());
        }else{
            return null;
        }
    }
}
