package com.yupi.yupicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicommon.model.entity.UserInterfaceInfo;

/**
* @author pale
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-02-18 11:09:44
*/
public interface InnerUserInterfaceInfoService{
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
