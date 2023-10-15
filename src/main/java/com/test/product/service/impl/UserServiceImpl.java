package com.test.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.product.entity.UserEntity;
import com.test.product.mapper.UserMapper;
import com.test.product.service.ProductService;
import com.test.product.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author
 * @version v1.0.0
 * @date 2023/10/7 16:36
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    private static final Map<String, String> stockMap = new HashMap<>();

    static {
        stockMap.put("1001", "iphone 13");
        stockMap.put("1002", "iphone 14");
        stockMap.put("1003", "iphone 15");
        stockMap.put("1004", "iphone 16");
    }

    @Override
    public UserEntity getInfo(Long id) {
        return this.getById(id);
    }

    @Override
    public List<UserEntity> getListInfo() {
        return this.list();
    }

//    public Page<UserEntity> getPageListInfo(PageRequestDTO<BookDTO> requestDto) {
//        QueryWrapper<UserEntity> querySysAppWrapper = new QueryWrapper<>();
//        System.out.println(querySysAppWrapper);
//
//        querySysAppWrapper.eq("deleted", 0);
////        querySysAppWrapper.orderByDesc("create_time");
//        BookDTO condition = requestDto.getCondition();
//
//        if (condition != null) {
//            if (Objects.nonNull(condition.getId())) {
//                querySysAppWrapper.eq("id", condition.getId());
//            }
//            if (StringUtils.isNotBlank(condition.getBookTitle())) {
//                querySysAppWrapper.like("book_title", condition.getBookTitle());
//            }
//            if (Objects.nonNull(condition.getStatus())) {
//                querySysAppWrapper.eq("status", condition.getStatus());
//            }
//        }
//        System.out.println(querySysAppWrapper);
//
//        return page(new Page<>(requestDto.getCurrent(), requestDto.getSize()), querySysAppWrapper);
//    }

    @Override
    public boolean saveInfo(UserEntity template) {
        this.save(template);
        System.out.println(template.getId());
        return true;
    }

    @Override
    public boolean editInfo(UserEntity template) {
        return this.updateById(template);
//        return  false;
    }

    @Override
    public boolean deleteInfo(Long id) {
        return this.removeById(id);
    }

}
