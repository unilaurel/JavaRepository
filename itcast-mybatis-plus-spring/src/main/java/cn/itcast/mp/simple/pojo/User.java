package cn.itcast.mp.simple.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Package: cn.itcast.mp.simple.pojo
 * Description：
 *
 * @Author :zyp
 * @Create 2023/07/29 14:18
 * @Version 1.0
 */

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @TableName("tb_user")
    public class User {
        private Long id;
        private String userName;
        private String password;
        private String name;
        private Integer age;
        private String email;
    }

