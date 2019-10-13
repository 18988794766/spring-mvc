package xy.standard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xy.standard.dao.entity.AdminUser;
import xy.standard.dao.mapper.AdminUserMapper;

@Service
public class MysqlService {
    @Autowired
    private AdminUserMapper adminUserMapper;

    public AdminUser test(int index) {
        return adminUserMapper.selectByPrimaryKey(index);
    }
}
