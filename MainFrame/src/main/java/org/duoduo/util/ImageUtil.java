package org.duoduo.util;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class ImageUtil {
    public static Image getImage(String name) {
        return getImage(name, ImageUtil.class.getClassLoader());
    }

    public static Image getImage(String name, ClassLoader classLoader) {
        if (classLoader == null || name == null || "".equals(name)) {
            return null;
        }

        Image image = null;

        List<String> postscripts= Arrays.asList("",".png",".jpg");
        for(String postscript:postscripts){
            try{
                URL url=classLoader.getResource(String.format("images/%s%s",name,postscript));
                if(url==null){
                    continue;
                }
                image=new Image(url.toString());
                if(image!=null){
                    //当某个图片加载失败时报错
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                //MyLog.d_Error("加载[" + name + "]图片失败");
            }
        }
        //我希望这个代码永远不要被执行！
        if (image == null) {
            BufferedImage bufferedImage = new BufferedImage(1, 1, 1);
            image = SwingFXUtils.toFXImage(bufferedImage, null);
        }
        return image;
    }
}
