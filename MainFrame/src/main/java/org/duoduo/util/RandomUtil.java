package org.duoduo.util;

import javafx.geometry.Insets;
import javafx.scene.control.Label;

import java.util.Random;

/**
 * @author: duoduo
 * Created Date: 2022/7/22 14:06
 **/
public class RandomUtil {
    public static Random random = new Random();

    public static Label randomNoSearchLabel() {
        Label label = new Label();
        label.setPadding(new Insets(5, 5, 5, 5));
        // 0 1 2    3 4 5   6 7 8   9
        int rand = random.nextInt(10) / 3;
        switch (rand) {
            case 0:
                label.setText("请换一个关键词试试");
                break;
            case 1:
                label.setText("没有匹配的条目");
                break;
            case 2:
                label.setText("没有找到条目");
                break;
            default:
                label.setText("不要再折腾我这个可怜的搜索器了>_<");
                break;
        }
        return label;
    }
}
