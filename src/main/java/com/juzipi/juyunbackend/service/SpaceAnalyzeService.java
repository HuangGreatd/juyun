package com.juzipi.juyunbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.juzipi.juyunbackend.domain.dto.space.analyze.SpaceUsageAnalyzeRequest;
import com.juzipi.juyunbackend.domain.entity.Space;
import com.juzipi.juyunbackend.domain.entity.User;
import com.juzipi.juyunbackend.domain.vo.space.analyze.SpaceUsageAnalyzeResponse;

/**
 * @ClassName SpaceAnalyzeService
 * @Description:
 * @Author: 橘子皮
 * @CreateDate: 2024/12/31 10:33
 */
public interface SpaceAnalyzeService  extends IService<Space> {
    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);
}
