package com.juzipi.juyunbackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.juzipi.juyunbackend.domain.dto.spaceuser.SpaceUserAddRequest;
import com.juzipi.juyunbackend.domain.dto.spaceuser.SpaceUserQueryRequest;
import com.juzipi.juyunbackend.domain.entity.SpaceUser;
import com.juzipi.juyunbackend.domain.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 73782
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-01-18 16:40:31
*/
public interface SpaceUserService extends IService<SpaceUser> {

    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);

    void validSpaceUser(SpaceUser spaceUser, boolean add);

    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);

    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
}
