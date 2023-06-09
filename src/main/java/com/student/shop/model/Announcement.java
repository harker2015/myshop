/**
 *
 */
package com.student.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 公告
 *
 * @author Student
 * @email student@test.com
 * @date 2023-3-18
 */
@Entity
@Setter
@Getter
@Table(name = "tbl_announcement")
public class Announcement extends AbstractEntity {

    @Column(columnDefinition="VARCHAR(512) NOT NULL COMMENT '公告内容'")
    private String content;

    @ManyToOne
    @JoinColumn(columnDefinition="BIGINT(20) NOT NULL COMMENT '创建管理员ID'")
    private Admin createAdmin;

}
