package com.xst.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
/**
 * Created by sl on 16-4-28.
 */
public class VideoPath {

    public String TurnToHash(MultipartFile multipartFile,String path){
        long unixTime = System.currentTimeMillis();
        String name = HashUtils.HashPath(multipartFile.getOriginalFilename()+unixTime);
        String multipartUrl = path+"/"+name;

        return multipartUrl;
    }


}
