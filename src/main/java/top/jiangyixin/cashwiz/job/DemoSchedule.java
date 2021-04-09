package top.jiangyixin.cashwiz.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * TODO
 * @version 1.0
 * @author jiangyixin
 * @date 2021/1/5 下午4:33
 */
@Component
public class DemoSchedule {
	
	@Scheduled(cron = "*/60 * * * * ?")
	private void hello() {
//		System.out.println("hello");
	}
}
