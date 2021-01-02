package top.jiangyixin.cashwiz.core.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 分类表
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/1/2
 */
@Data
public class Category {

  private Long id;
  private String name;
  private Boolean active;
  private Long parentId;
  private User user;
  private Date gmtCreate;
  private Date gmtModified;
}
