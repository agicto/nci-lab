package com.test.product.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.test.product.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService  extends IService<UserEntity> {

    UserEntity getInfo(Long id);

    /**
     * 获取信息
     * @param id id
     * @return {@link UserEntity}
     */
    List<UserEntity> getListInfo();

    /**
     * 保存信息
     * @param template
     * @return id
     */
    boolean saveInfo(UserEntity template);

    /**
     * 保存信息
     * @param template
     * @return id
     */
    boolean editInfo(UserEntity template);

    /**
     * 删除信息
     * @param id
     * @return id
     */
    boolean deleteInfo(Long id);
}