package com.test.product.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.test.product.dto.ApiResponseDTO;
import com.test.product.entity.User;
import com.test.product.entity.UserEntity;
import com.test.product.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.beans.BeanUtils;

/**
 * @author
 * @version v1.0.0
 * @date 2023/10/7 17:38
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Resource
    private final UserService userService;

    private final User user;

    @GetMapping("/getUserName")
    public String getUserName() {
        return user.getUserName();
    }


    @PostMapping("/")
    public ApiResponseDTO<Long> saveBookInfo(@RequestBody UserEntity userRequestDTO) {
        UserEntity newBook = new UserEntity();
        BeanUtils.copyProperties(userRequestDTO,newBook);
        log.info(JSON.toJSONString(newBook));
        boolean result = userService.saveInfo(newBook);
        return new ApiResponseDTO(result);
    }

    @GetMapping("/list")
    public ApiResponseDTO<List<UserEntity>> getUserName2() {
        List<UserEntity> list = userService.list();
        System.out.println(list);

        return  new ApiResponseDTO(list);

//           return userService.list();
    }

    @GetMapping("/{id}")
    public ApiResponseDTO<UserEntity> getUserInfo(@PathVariable("id")Long id) {
        UserEntity user = userService.getInfo(id);
//        TemplateResponseDTO responseDTO = new TemplateResponseDTO();
//        if (book != null) {
//            BeanUtils.copyProperties(book,responseDTO);
//        }
        return new ApiResponseDTO(user);
    }


    @PutMapping ("/{id}")
    public ApiResponseDTO<Long> editUserInfo(@PathVariable("id")Long id, @RequestBody UserEntity userRequestDTO) {
        UserEntity newUser = new UserEntity();



        if(userRequestDTO.getStatus() != null) {
            newUser.setStatus(userRequestDTO.getStatus());
        }
        System.out.println(userRequestDTO);
        BeanUtils.copyProperties(userRequestDTO, newUser);
        if(id != null) {
            newUser.setId(id);
        }
        System.out.println(newUser);
        boolean result = userService.editInfo(newUser);
        return new ApiResponseDTO(result);
    }

    @DeleteMapping("/{id}")
    public  ApiResponseDTO<Long> removeUser (@PathVariable("id")Long id) {
        UserEntity user = userService.getInfo(id);
        UserEntity responseDTO = new UserEntity();
        if (user != null) {
            userService.deleteInfo(id);
            BeanUtils.copyProperties(user, responseDTO);
        }
        return new ApiResponseDTO(responseDTO);
    }


}
