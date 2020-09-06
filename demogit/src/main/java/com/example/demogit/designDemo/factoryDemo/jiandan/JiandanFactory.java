package com.example.demogit.designDemo.factoryDemo.jiandan;

import com.example.demogit.designDemo.factoryDemo.JavaVideo;
import com.example.demogit.designDemo.factoryDemo.Video;

/**
 * 简单工厂
 * 通过反射根据参数不同返回不同的类实例，其父类是一样的
 */
public class JiandanFactory {
    public static void main(String[] args) {
        new VideoFactoryClass().getVideoByType(JavaVideo.class).study();
    }
}

class VideoFactoryClass{

   public Video getVideoByType(Class c){
       Video video = null;
       try {
           video = (Video) Class.forName(c.getName()).newInstance();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return video;
   }

}