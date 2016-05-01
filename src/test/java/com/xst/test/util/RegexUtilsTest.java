package com.xst.test.util;

import com.xst.util.RegexUtils;
import org.junit.Test;

/**
 * Created by sl on 16-5-1.
 */
public class RegexUtilsTest {

    @Test
    public void testGetPicPath(){
        String s = RegexUtils.getPicPath("<img sdhgfgh c  sdas  alt=\"123\" src=\"http://my." +
                "csdn.net/uploads/201606/027/ahsh_902.png\" style=\"dhaksh />");
        System.out.println(s);
    }
}
