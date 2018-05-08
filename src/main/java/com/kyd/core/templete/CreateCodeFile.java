package com.kyd.core.templete;

import static com.kyd.core.templete.TltFileType.*;

/**
 * 通过文件包生成文件
 */
public class CreateCodeFile {
    private CreateCodeFile() {
    }

    public static void batchAllCodeByPackage(String packageName) throws Exception{
        batchDaoAndDaoXml(packageName);
        batchServiceAndServiceImpl(packageName);
        batchBiz(packageName);
    }

    public static void createAllCodeByEntity(Class clazz,String packageName) throws Exception{
        createDaoAndDaoXmlByEntity(clazz,packageName);
        createServiceAndServiceImplByEntity(clazz, packageName);
        createBizByEntity(clazz,packageName);
    }

    public static void batchDaoAndDaoXml(String packageName) throws Exception{
        batchDao(packageName);
        batchDaoXml(packageName);
    }

    public static void createDaoAndDaoXmlByEntity(Class clazz,String packageName) throws Exception{
        createDaoByEntity(clazz, packageName);
        createDaoXmlByEntity(clazz, packageName);
    }

    public static void batchServiceAndServiceImpl(String packageName) throws Exception {
        batchService(packageName);
        batchServiceImpl(packageName);
    }

    public static void createServiceAndServiceImplByEntity(Class clazz,String packageName) throws Exception {
        createServiceByEntity(clazz,packageName);
        createServiceImplByEntity(clazz,packageName);
    }

    public static void  batchBiz(String packageName) throws Exception {
        createBatchFile(packageName,DEFAULT_BIZ_TEMPLETE);
    }

    public static void createBizByEntity(Class clazz ,String packageName) throws Exception{
        createFileByEntity(clazz,packageName,DEFAULT_BIZ_TEMPLETE);
    }

    public static void batchService(String packageName) throws Exception {
        createBatchFile(packageName,DEFAULT_SERVICE_TEMPLETE);
    }

    public static void createServiceByEntity(Class clazz ,String packageName) throws Exception{
        createFileByEntity(clazz,packageName,DEFAULT_SERVICE_TEMPLETE);
    }

    public static void batchServiceImpl(String packageName) throws Exception {
        createBatchFile(packageName,DEFAULT_SERVICE_IMPL_TEMPLETE);
    }

    public static void createServiceImplByEntity(Class clazz ,String packageName) throws Exception{
        createFileByEntity(clazz,packageName,DEFAULT_SERVICE_IMPL_TEMPLETE);
    }

    public static void batchDao(String packageName) throws Exception{
        createBatchFile(packageName,DEFAULT_DAO_TEMPLETE);
    }

    public static void createDaoByEntity(Class clazz ,String packageName) throws Exception{
        createFileByEntity(clazz,packageName,DEFAULT_DAO_TEMPLETE);
    }

    public static void batchDaoXml(String packageName) throws Exception {
        createBatchFile(packageName,DEFAULT_DAO_XML_TEMPLETE);
    }

    public static void createDaoXmlByEntity(Class clazz ,String packageName) throws Exception{
        createFileByEntity(clazz,packageName,DEFAULT_DAO_XML_TEMPLETE);
    }

    /**
     * 根据包名和文件类型生成批量文件
     * @param packageName 包名
     * @param templeteType  文件类型
     * @throws Exception
     */
    public static void createBatchFile(String packageName ,String templeteType) throws Exception{
        MoreFileContents batchFile = new MoreFileContents();
        batchFile.batch(packageName,templeteType);
    }

    /**
     * 根据实体类对象生成文件
     * @param clazz entity对象类
     * @param packageName 包名
     * @param templeteType 生成的文件类型
     * @throws Exception
     */
    private static void createFileByEntity(Class clazz ,String packageName ,String templeteType) throws Exception {
        MoreFileContents moreFileContents = new MoreFileContents() ;
        moreFileContents.createClassFile(clazz,templeteType,packageName);

    }


}
