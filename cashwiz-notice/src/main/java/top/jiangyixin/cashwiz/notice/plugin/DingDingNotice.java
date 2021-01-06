package top.jiangyixin.cashwiz.notice.plugin;

import top.jiangyixin.cashwiz.notice.NoticeAble;
import top.jiangyixin.cashwiz.notice.NoticeResult;

/**
 * @author mickle
 */
public class DingDingNotice implements NoticeAble {

  public NoticeResult notice(String body) {
    return null;
  }

  public String register() {
    return "dingding";
  }
}
