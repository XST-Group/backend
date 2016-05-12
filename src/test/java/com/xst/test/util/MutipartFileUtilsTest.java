package com.xst.test.util;

import com.xst.util.MultipartFileUtils;
import org.junit.Test;

/**
 * Created by sl on 16-5-12.
 */
public class MutipartFileUtilsTest {


    @Test
    public void testGetProjectRealPath(){

        MultipartFileUtils multipartFile = new MultipartFileUtils();

        String path = "/home/sl/workspace/idea/xst/target/XST-0.0.1-SNAPSHOT/";

        path = multipartFile.getProjectRealPath(path);

        System.out.println(path);
    }

}
