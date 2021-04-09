package top.jiangyixin.cashwiz.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 账单表
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/1/2
 */
@Data
public class Bill {
  @TableId(type = IdType.AUTO)
  private Long id;
  private Double amount;
  private Account account;
  private Category category;
  private List<Tag> tags;
  private Date billTime;
  private Date gmtCreate;
  private Date gmtModified;
}
