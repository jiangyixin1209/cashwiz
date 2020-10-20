package top.jiangyixin.moneyfeedom.notice.plugin;

import top.jiangyixin.moneyfeedom.notice.NoticeAble;
import top.jiangyixin.moneyfeedom.notice.NoticeResult;

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
