package com.test.product.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 实体类基类
 *
 * @author hanjixin
 * @email_hanjixin@kaikeba.com
 */
@Setter
@Getter
public class BaseEntity implements Serializable {


    /**
     * 创建人
     */
//    protected Integer createdBy;

    /**
     * 创建日期
     */
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime createTime;
    /**
     * 修改人
     */
//    protected Integer updatedBy;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE, update = "now()")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime updateTime;

    /**
     * 状态 1:已删除 0:未删除
     */
    protected Integer deleted;

}
