package com.yupi.project.service;

import com.yupi.project.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author pale
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-02-18 11:09:44
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId, long userId);
}
