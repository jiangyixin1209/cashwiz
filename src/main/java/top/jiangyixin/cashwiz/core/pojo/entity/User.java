package top.jiangyixin.cashwiz.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * 用户表
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/1/2
 */
@Data
public class User {
  @TableId(type = IdType.AUTO)
  private Long id;
  private String nickname;
  private String password;
  private String mobile;
  private Integer level;
  private Boolean active;
  private Date gmtCreate;
  private Date gmtModified;
}
