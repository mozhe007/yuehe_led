package heyue.listen_led.dto;

import lombok.Data;

@Data
public class AreaDTO {

    private Integer areaNo; //区域号 对应行号
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private String text;  //要显示内容
    private Integer inStyle; // 入场特技 1 立即显示 2 向左移动 4 向右移动 3 向上移动 5 向下移动 94 向上连移 95 向下连移 97 向左连移 96 向右连移 06 闪烁
    private Integer nSpeed; // 移动速度,越小越快，值域 1-64(单位 5ms)
    private Integer delayTime; //每页停留时间,值域 1-65535（单位 1s）
    private Integer fontSize; //字体大小(字高宽点数)：D21=16：GB2312 字模：16X16，ASCII 字模 16X8
//									D21=24：GB2312 字模：24X24，ASCII 字模 24X16
//									D21=32：GB2312 字模：32X32，ASCII 字模 32X16

}
