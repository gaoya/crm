package com.kyd.core.config;

import lombok.Data;

/**
 * 模板文件属性的配置
 */
@Data
public class TltFile {
    //模板文件名称
    private String templete;
    //生成的文件名称
    private String desc;
    //生成的文件的类型
    private String type ;

    public String getTemplete() {
        return templete;
    }

    public void setTemplete(String templete) {
        this.templete = templete;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TltFile() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TltFile(String templete, String desc) {
        this.templete = templete;
        this.desc = desc;
    }
}
