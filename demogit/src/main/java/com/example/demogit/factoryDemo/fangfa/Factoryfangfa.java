package com.example.demogit.factoryDemo.fangfa;

import com.example.demogit.factoryDemo.JavaVideo;
import com.example.demogit.factoryDemo.Video;

/**
 * 工厂方法
 */
public class Factoryfangfa {
    public static void main(String[] args) {
        /*try {
            VideoFactoryAbstractClass o = (VideoFactoryAbstractClass) Class.forName(JavaVideoFactory.class.getName()).newInstance();
            o.getVideo().study();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        VideoFactoryAbstractClass o = new JavaVideoFactory();
        o.getVideo().study();
    }
}

abstract class VideoFactoryAbstractClass {
    abstract Video getVideo();
}

class JavaVideoFactory extends VideoFactoryAbstractClass {

    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}