package com.xst.dao;

import com.xst.util.HashUtils;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by sl on 16-4-30.
 */
@Repository("fileDao")
public class FileDao {

    /**
     * 存储文件
     * 将MultipartFile格式的文件存储到存储介质上，命名格式为MD5Hash(name+UNIX时间戳)
     * 将存储的绝对路径返回
     * @param multipartFile 待存储的文件
     * @param path 存储路径
     * @return 文件的绝对路径
     */
    public String saveFile(MultipartFile multipartFile , String path){
        long unixtime = System.currentTimeMillis();
        String fileName = HashUtils.HashPath(multipartFile.getOriginalFilename() + unixtime);
        String fileRealUrl = path+"/"+fileName;

        File file = null;

        file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        try {
            byte[] buffer = multipartFile.getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(fileRealUrl);
            fileOutputStream.write(buffer);
            fileOutputStream.close();
        } catch (IOException e) {
            fileRealUrl = "";
            e.printStackTrace();
        }

        return fileRealUrl;
    }



    public void readPhoto(String imagePath,HttpServletResponse response){
        File imageFile = new File(imagePath);
        if (imageFile != null && imageFile.exists()) {
            byte[] buffer = new byte[5120];
            InputStream is = null;
            OutputStream os = null;
            try {
                is = new FileInputStream(imageFile);
                os = response.getOutputStream();
                while (is.read(buffer) != -1) {
                    os.write(buffer);
                    os.flush();
                }
            } catch (Exception e) {
                try {
                    response.getWriter().write("Can't read the Photo!");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                    if (os != null) {
                        os.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else{
            try {
                response.getWriter().write("Not Found the Photo!");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    public void readVideo(String videoPath,HttpServletResponse response){
        File videoFile = new File(videoPath);
        if (videoFile != null && videoFile.exists()) {
            byte[] buffer = new byte[5120];
            InputStream is = null;
            OutputStream os = null;
            try {
                is = new FileInputStream(videoFile);
                os = response.getOutputStream();
                while (is.read(buffer) != -1) {
                    os.write(buffer);
                    os.flush();
                }
            } catch (Exception e) {
                try {
                    response.getWriter().write("Can't read the Video!");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                    if (os != null) {
                        os.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else{
            try {
                response.getWriter().write("Not Found the Video!");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
