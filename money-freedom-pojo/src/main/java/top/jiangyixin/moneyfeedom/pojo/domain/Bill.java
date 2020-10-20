package top.jiangyixin.moneyfeedom.pojo.domain;

import java.util.Date;
import java.util.List;

/**
 * @author mickle
 */
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
