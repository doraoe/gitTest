package com.example.demogit.factoryDemo.chouxiang;

import com.example.demogit.factoryDemo.*;

/**
 * 抽象工厂
 */
public class ChouxiangFactory{
    public static void main(String[] args) {
        try {
            cxInterface o = (cxInterface)Class.forName(String.valueOf(JavaChouxiangFactory.class.getName())).newInstance();
            Text text = o.getText();
            Video video = o.getVideo();
            video.study();
            text.Write();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

interface cxInterface{
    Text getText();
    Video getVideo();
}
class JavaChouxiangFactory implements cxInterface{

    @Override
    public Text getText() {
        return new JavaText();
    }

    @Override
    public Video getVideo() {
       return new JavaVideo();
    }
}
class PythonChouxiangFactory implements cxInterface{

    @Override
    public Text getText() {
        return new PythonText();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}