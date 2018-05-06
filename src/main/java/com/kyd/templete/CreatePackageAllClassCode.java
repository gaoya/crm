package com.kyd.templete;

import com.kyd.core.templete.CreateCodeFile;
import com.kyd.entity.ShowParamEntity;

/**
 * 生成包下面的所有的文件
 */
public class CreatePackageAllClassCode {
    public static final String PARENT_PACKAGE = "com.kyd";

    public static void main(String[] args)  throws Exception{
//        createClassInPackage();
        createByEntity(ShowParamEntity.class);
    }

    /**
     * 生成包目录下entity的所有的文件
     */
    private static void createClassInPackage() throws Exception {
        CreateCodeFile.batchAllCodeByPackage(PARENT_PACKAGE);
    }

    private static void createByEntity(Class clazz) throws Exception {
        CreateCodeFile.createAllCodeByEntity(clazz,PARENT_PACKAGE);
    }



}
