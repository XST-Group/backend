package com.xst.test.util;

import com.xst.util.RegexUtils;
import org.junit.Test;

/**
 * Created by sl on 16-5-1.
 */
public class RegexUtilsTest {

    @Test
    public void testGetPicPath(){

        String s = RegexUtils.getPicPath("<p><a src=\"www\" style=\"height:186px; width:200px\"/><img alt=\"\" src=\"http://avatar.csdn.net/D/7/6/1_b452757715.jpg\" \n" +
                "style=\"height:186px; width:200px\" /><img alt=\"\" src=\"http://www.runoob.com/wp-content/themes/w3cschool.cc/assets/img/qrcode.jpg\" \n" +
                "style=\"height:75px; width:75px\" /></p>");



        System.out.println(s);
    }
}
