package com.xst.test.util;

import com.xst.util.RegexUtils;
import org.junit.Test;

/**
 * Created by sl on 16-5-1.
 */
public class RegexUtilsTest {

    @Test
    public void testGetPicPath(){
        String s = RegexUtils.getPicPath("<img alt=\"\" src=\"http://avatar.csdn.net/D/7/6/1_b452757715.jpg\" style=\"height:186px; width:200px\" />");
        System.out.println(s);
    }
}
