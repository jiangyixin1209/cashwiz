package top.jiangyixin.cashwiz.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.jiangyixin.cashwiz.core.pojo.entity.User;
import top.jiangyixin.cashwiz.core.pojo.param.user.UserRegisterParam;

/**
 * User Service 接口
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/1/2
 */
public interface IUserService extends IService<User> {

  void register(UserRegisterParam userRegisterParam);
}
