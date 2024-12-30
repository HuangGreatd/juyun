package com.juzipi.juyunbackend.api.imagesearch;

import com.juzipi.juyunbackend.api.imagesearch.model.ImageSearchResult;
import com.juzipi.juyunbackend.api.imagesearch.sub.GetImageFirstUrlApi;
import com.juzipi.juyunbackend.api.imagesearch.sub.GetImageListApi;
import com.juzipi.juyunbackend.api.imagesearch.sub.GetImagePageUrlApi;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @ClassName ImageSearchApiFacade
 * @Description:门面模式（图片搜索服务）
 * @Author: 橘子皮
 * @CreateDate: 2024/12/30 14:46
 */
@Slf4j
public class ImageSearchApiFacade {
    /**
     * 搜索图片
     *
     * @param imageUrl
     * @return
     */
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        String imagePageUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(imagePageUrl);
        List<ImageSearchResult> imageList = GetImageListApi.getImageList(imageFirstUrl);
        return imageList;
    }

    public static void main(String[] args) {
        // 测试以图搜图功能
        String imageUrl = "https://www.codefather.cn/logo.png";
        List<ImageSearchResult> resultList = searchImage(imageUrl);
        System.out.println("结果列表" + resultList);
    }
}
