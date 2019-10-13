package xy.standard.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xy.standard.dao.entity.AdminUser;
import xy.standard.service.MysqlService;

@RestController
@RequestMapping("/site")
public class SiteController {
    @Autowired
    private MysqlService mysqlService;

    @RequestMapping(value = "/index",consumes = "application/json")
    public String index(@RequestBody String req) {
        AdminUser adminUser =  mysqlService.test(1);
        return JSON.toJSONString(adminUser);
    }
}
