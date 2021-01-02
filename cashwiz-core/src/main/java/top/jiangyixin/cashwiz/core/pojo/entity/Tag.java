package top.jiangyixin.cashwiz.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * 账户表
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/1/2
 */
@Data
public class Tag {
  @TableId(type = IdType.AUTO)
  private Long id;
  private String name;
  private User user;
  private Date gmtCreate;
  private Date gmtModified;
}
