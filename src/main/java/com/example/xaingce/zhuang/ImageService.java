package com.example.xaingce.zhuang;

import java.io.InputStream;

public interface ImageService {
    /**
     * 简单图片聚合
     * @param
     * @return void
     * @author liyajie
     * @createTime 2021/12/17 9:54
     **/
    InputStream generateSimpleImage(String text, String bgImageUrl, String todoImage, String localPath, Boolean saveLocal, Boolean saveOss);

    /**
     * 复杂图片聚合
     * @param
     * @return void
     * @author liyajie
     * @createTime 2021/12/17 9:54
     **/
    InputStream generateComplexImage(String title, String content, String bgImageUrl, String qrCodeUrl, String productImageUrl, String waterMarkImageUrl, String avatarImageUrl, String localPath, Boolean saveLocal, Boolean saveOss);

}
