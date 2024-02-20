package com.yupi.yupicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicommon.model.entity.User;


/**
 * 用户服务
 *
 * @author pale
 */
public interface InnerUserService {


    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);


}
