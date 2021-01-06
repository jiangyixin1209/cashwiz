package top.jiangyixin.cashwiz.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * TODO
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/1/2
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan({"top.jiangyixin.cashwiz.job"})
public class CashWizApplication {

  public static void main(String[] args) {
    SpringApplication.run(CashWizApplication.class);
  }
}
