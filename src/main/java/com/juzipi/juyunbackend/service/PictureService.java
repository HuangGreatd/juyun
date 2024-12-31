package com.juzipi.juyunbackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.juzipi.juyunbackend.api.aliyunai.model.CreateOutPaintingTaskResponse;
import com.juzipi.juyunbackend.domain.dto.picture.*;
import com.juzipi.juyunbackend.domain.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.juzipi.juyunbackend.domain.entity.User;
import com.juzipi.juyunbackend.domain.vo.PictureVO;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    void deletePicture(long pictureId, User loginUser);

    @Async
    void clearPictureFile(Picture oldPicture);

    void checkPictureAuth(User loginUser, Picture picture);

    void editPicture(PictureEditRequest pictureEditRequest, User loginUser);

    List<PictureVO> searchPictureByColor(Long spaceId, String picColor, User loginUser);

    @Transactional(rollbackFor = Exception.class)
    void editPictureByBatch(PictureEditByBatchRequest pictureEditByBatchRequest, User loginUser);

    //    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public void batchEditPictureMetadata(PictureBatchEditRequest request, Long spaceId, Long loginUserId) {
//        // 参数校验
//        validateBatchEditRequest(request, spaceId, loginUserId);
//
//        // 查询空间下的图片
//        List<Picture> pictureList = this.lambdaQuery()
//                .eq(Picture::getSpaceId, spaceId)
//                .in(Picture::getId, request.getPictureIds())
//                .list();
//
//        if (pictureList.isEmpty()) {
//            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "指定的图片不存在或不属于该空间");
//        }
//
//        // 分批处理避免长事务
//        int batchSize = 100;
//        List<CompletableFuture<Void>> futures = new ArrayList<>();
//        for (int i = 0; i < pictureList.size(); i += batchSize) {
//            List<Picture> batch = pictureList.subList(i, Math.min(i + batchSize, pictureList.size()));
//
//            // 异步处理每批数据
//            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//                batch.forEach(picture -> {
//                    // 编辑分类和标签
//                    if (request.getCategory() != null) {
//                        picture.setCategory(request.getCategory());
//                    }
//                    if (request.getTags() != null) {
//                        picture.setTags(String.join(",", request.getTags()));
//                    }
//                });
//                boolean result = this.updateBatchById(batch);
//                if (!result) {
//                    throw new BusinessException(ErrorCode.OPERATION_ERROR, "批量更新图片失败");
//                }
//            }, customExecutor);
//
//            futures.add(future);
//        }
//
//        // 等待所有任务完成
//        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
//    }

    CreateOutPaintingTaskResponse createPictureOutPaintingTask(CreatePictureOutPaintingTaskRequest createPictureOutPaintingTaskRequest, User loginUser);
}
