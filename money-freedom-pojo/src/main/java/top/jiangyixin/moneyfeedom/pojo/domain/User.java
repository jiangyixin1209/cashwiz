package top.jiangyixin.moneyfeedom.pojo.domain;

import lombok.Data;

import java.util.Date;

/**
 * 用户
 * @author mickle
 */
@Data
public class User {
  private Long id;
  private String nickname;
  private String password;
  private String mobile;
  private Integer level;
  private Boolean active;
  private Date gmtCreate;
  private Date gmtModified;
}
