package top.jiangyixin.cashwiz.notice;

/**
 * @author mickle
 */
public interface NoticeAble {
  /**
   * 通知
   * @param body    通知内容
   * @return        通知结果对象
   */
  NoticeResult notice(String body);

  /**
   * 注册插件
   * @return        插件名称
   */
  String register();
}
