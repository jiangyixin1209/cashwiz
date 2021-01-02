package top.jiangyixin.moneyfeedom.pojo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author mickle
 */
@Data
public class Tag {

  private Long id;
  private String name;
  private User user;
  private Date gmtCreate;
  private Date gmtModified;
}
