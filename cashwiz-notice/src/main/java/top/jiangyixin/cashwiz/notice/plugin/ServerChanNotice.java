package top.jiangyixin.cashwiz.notice.plugin;

import top.jiangyixin.cashwiz.notice.NoticeAble;
import top.jiangyixin.cashwiz.notice.NoticeResult;

/**
 * Server 酱通知
 * @author mickle
 */
public class ServerChanNotice implements NoticeAble {
  public NoticeResult notice(String body) {
    return null;
  }

  public String register() {
    return "server_chan";
  }
}
