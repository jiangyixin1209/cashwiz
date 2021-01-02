package top.jiangyixin.moneyfeedom.notice.plugin;

import top.jiangyixin.moneyfeedom.notice.NoticeAble;
import top.jiangyixin.moneyfeedom.notice.NoticeResult;

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
