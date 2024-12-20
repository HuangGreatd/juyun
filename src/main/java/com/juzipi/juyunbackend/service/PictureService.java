package com.juzipi.juyunbackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.juzipi.juyunbackend.domain.dto.picture.PictureQueryRequest;
import com.juzipi.juyunbackend.domain.dto.picture.PictureReviewRequest;
import com.juzipi.juyunbackend.domain.dto.picture.PictureUploadRequest;
import com.juzipi.juyunbackend.domain.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.juzipi.juyunbackend.domain.entity.User;
import com.juzipi.juyunbackend.domain.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author 73782
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2024-12-15 15:29:32
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param inputSource
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    void validPicture(Picture picture);

    /**
     * 图片审核
     *
     * @param pictureReviewRequest
     * @param loginUser
     */
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);

    void fillReviewParams(Picture picture, User loginUser);
}
