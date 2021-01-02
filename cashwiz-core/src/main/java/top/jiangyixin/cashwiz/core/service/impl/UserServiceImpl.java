package top.jiangyixin.cashwiz.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.jiangyixin.cashwiz.core.mapper.UserMapper;
import top.jiangyixin.cashwiz.core.pojo.entity.User;
import top.jiangyixin.cashwiz.core.pojo.param.user.UserRegisterParam;
import top.jiangyixin.cashwiz.core.service.IUserService;

/**
 * User Service实现类
 *
 * @author jiangyixin
 * @version 1.0
 * @date 2021/1/2
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
  public void register(UserRegisterParam userRegisterParam) {

  }
}
