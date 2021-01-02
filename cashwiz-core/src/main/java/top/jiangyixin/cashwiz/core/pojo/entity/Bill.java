package top.jiangyixin.cashwiz.core.pojo.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author mickle
 */
@Data
public class Bill {
  private Long id;
  private Double amount;
  private Account account;
  private Category category;
  private List<Tag> tags;
  private Date billTime;
  private Date gmtCreate;
  private Date gmtModified;
}
