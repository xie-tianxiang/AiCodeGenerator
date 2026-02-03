package com.xtx.aicodegenerator.service;

public interface ScreenshotService {
    /**
     * 生成并上传网页截图
     *
     * @param webUrl 网页地址
     * @return 对象存储访问URL，失败返回null
     */
    String generateAndUploadScreenshot(String webUrl);
}
