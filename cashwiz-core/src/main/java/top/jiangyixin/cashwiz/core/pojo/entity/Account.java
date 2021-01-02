package top.jiangyixin.cashwiz.core.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 账户表
 * @author jiangyixin
 */
@Data
public class Account {
  private Long id;
  private String name;
  private User user;
  private Date gmtCreate;
  private Date gmtModified;
}
