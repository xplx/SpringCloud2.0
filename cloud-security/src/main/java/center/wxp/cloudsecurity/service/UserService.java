package center.wxp.cloudsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2020/3/24 9:36
 */
@Service
public class UserService implements UserDetailsService {
    private static List<User> userList;

    @Resource
    private PasswordEncoder passwordEncoder;

    public void initData() {
        String password = passwordEncoder.encode("123456");
        userList = new ArrayList<>();

        userList.add(new User("mall",password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin")));
        userList.add(new User("andy",password, AuthorityUtils.commaSeparatedStringToAuthorityList("client")));
        userList.add(new User("mark",password, AuthorityUtils.commaSeparatedStringToAuthorityList("client")));
    }

    /**
     * 用户信息认证
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        initData();
        List<User> findUserList = userList.stream().filter(user -> user.getUsername().equals(username)).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(findUserList)) {
            return findUserList.get(0);
        } else {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
    }
}
