package com.example.demogit.factoryDemo.jiandan;

import com.example.demogit.factoryDemo.JavaVideo;
import com.example.demogit.factoryDemo.PythonVideo;
import com.example.demogit.factoryDemo.Video;

/**
 * 简单工厂
 * 通过反射根据参数不同返回不同的类实例，其父类是一样的
 */
public class JiandanFactory {
    public static void main(String[] args) {
        //new VideoFactoryClass().getVideoByType(JavaVideo.class).study();
        Video java = new VideoFactoryClass().getVideoByType("java");
        java.study();
        Video video = new JavaVideo();
        video.study();
    }
}

class VideoFactoryClass {

    public Video getVideoByType(String type) {
        /*Video video = null;
       try {
           video = (Video) Class.forName(c.getName()).newInstance();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return video;*/
        if (type.equalsIgnoreCase("java")) {
            return new JavaVideo();
        } else if (type.equalsIgnoreCase("python")) {
            return new PythonVideo();
        } else {
            return null;
        }
    }
}