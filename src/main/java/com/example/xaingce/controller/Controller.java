package com.example.xaingce.controller;


import com.example.xaingce.zhuang.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
@Slf4j
public class Controller {

    @Resource
    HttpServletResponse response;

    @Autowired
    ImageService imageService;

    /**
     * 简单图片聚合
     * @param
     * @return void
     * @author liyajie
     * @createTime 2021/12/17 10:43
     **/
    @GetMapping("/createSimpleImage")
    public void createSimpleImage(){
        OutputStream os = null;
        try {
            String text = "周末大放送";
            String todoImage = new File("C://Users/刘磊/Pictures/Saved Pictures/fo.jpg").toURI().toURL().toString();
            String bgImageUrl = new File("C://Users/刘磊/Pictures/Saved Pictures/jiji.jpg").toURI().toURL().toString();

            System.out.println(bgImageUrl);
            // 图片流
            InputStream is = imageService.generateSimpleImage(text, bgImageUrl, todoImage,"",false,false);
            BufferedImage image = ImageIO.read(is);
            response.setContentType("image/png");
            os = response.getOutputStream();
            if (image != null) {
                ImageIO.write(image, "png", os);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error("获取图片异常{}",e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.flush();
                    os.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 复杂图片聚合
     * @param
     * @return void
     * @author liyajie
     * @createTime 2021/12/17 10:43
     **/
    @GetMapping("/createComplexImage")
    public void createComplexImage(){
        // 背景图
        String bgImageUrl = "https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg";
        // 二维码
        String qrCodeUrl = "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg";
        // 商品图
        String productImageUrl = "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg";
        // 水印图
        String waterMark = "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg";
        // 头像
        String avatar = "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg";
        // 标题文本
        String title = "# 最爱的家居";
        // 内容文本
        String content = "苏格拉底说：“如果没有那个桌子，可能就没有那个水壶”";
        OutputStream os = null;
        try{
            // 图片流
            InputStream is = imageService.generateComplexImage(title, content, bgImageUrl, qrCodeUrl, productImageUrl, waterMark, avatar,"",false,false);
            BufferedImage image = ImageIO.read(is);
            response.setContentType("image/png");
            os = response.getOutputStream();
            if (image != null) {
                ImageIO.write(image, "png", os);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (os != null) {
                try {
                    os.flush();
                    os.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}