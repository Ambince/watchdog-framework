# 介绍
`watchdog-framework`基于SpringBoot+Shiro+Mybatis+Mybatis-Plus+HikariCP+Redis+Vue+iView开发的基础权限框架，权限可控制到按钮级别，同时角色、用户、资源更新时关联的用户相应的权限也会实时更新，欢迎使用，若对你有帮助请点击上方的star :beers: 。
# 在线演示

[https://wdog-web.licoy.cn](https://wdog-web.licoy.cn)

- 用户名：test
- 密码：test123456

# 部分界面展示

## 用户管理
![用户管理](dist/user.png)
## 用户管理
![角色管理](dist/role.png) 
## 用户管理
![资源管理](dist/resource.png)    
## 更多请查看上方演示
# 技术选型
## 后端技术
技术 | 类型 | 版本 | 官网
----|------|----|----
Spring Boot | 容器 | 1.5.12.RELEASE | [http://start.spring.io/](http://start.spring.io/)
Mybatis-Starter | ORM框架 | 1.3.1 |  [http://www.mybatis.org](http://www.mybatis.org)
Mybatis-Plus | ORM框架 | 1.3.1 |  [http://mp.baomidou.com/](http://mp.baomidou.com/)
Maven | 项目构建管理 | 4.0.0 |  [http://maven.apache.org](http://maven.apache.org/)
Apache Shiro | 安全框架 | 1.3.2 |  [http://shiro.apache.org](http://www.mybatis.org/generator/index.html)
Lombok | 工具 | 1.16.20 |  [https://www.projectlombok.org/](https://www.projectlombok.org/)
HikariCP | 数据库连接池 | 2.7.8 |  [http://brettwooldridge.github.io/HikariCP/](http://brettwooldridge.github.io/HikariCP/)
Shiro-Redis | shiro缓存工具 | 2.8.24 | [https://github.com/alexxiyang/shiro-redis](https://github.com/alexxiyang/shiro-redis)
Springfox-Swagger2 | api文档工具 | 2.7.0 | [https://github.com/springfox/springfox](https://github.com/springfox/springfox)
jedis | redis管理 | 2.9.0 | [https://github.com/xetorthio/jedis](https://github.com/xetorthio/jedis)
## 前端技术
技术 | 类型 | 版本 | 官网
----|------|----|----
Vue | 前端渐进式框架 | 2.5.2 | [https://cn.vuejs.org/](https://cn.vuejs.org/)
Vue-Router | 前端路由 | 3.0.1 | [https://router.vuejs.org/](https://router.vuejs.org/)
Vuex | 前端状态管理 | 3.0.1 | [https://vuex.vuejs.org/](https://vuex.vuejs.org/)
Axios | HTTP库 | 0.18.0 | [https://github.com/axios/axios](https://github.com/axios/axios)
iView | UI框架 | 2.13.0 | [https://www.iviewui.com/](https://www.iviewui.com/)
dayjs | JS时间操作库 | 1.5.14 | [https://github.com/xx45/dayjs](https://github.com/xx45/dayjs)
String-Format | 字符串格式化 | 1.0.0 | [https://github.com/davidchambers/string-format](https://github.com/davidchambers/string-format)
Vue-table-with-tree-grid | iview-树表格 | 0.2.4 | [https://github.com/MisterTaki/vue-table-with-tree-grid](https://github.com/MisterTaki/vue-table-with-tree-grid)
js-md5 | js-md5库 | 0.7.3 | [https://github.com/emn178/js-md5](https://github.com/emn178/js-md5)
js-cookie | js-cookie操作库 | 2.2.0 | [https://github.com/js-cookie/js-cookie](https://github.com/js-cookie/js-cookie)

# 使用方法
## 软件需求
    JDK1.8+
    MySQL5.6+
    Maven4.0+
## 服务端
- 克隆到本地
```git
git clone git@github.com:watchdog-framework/watchdog-framework.git
```
- 导入SQL

    将项目根目录下的`wdog.sql`导入至数据库信息
- 修改数据库信息
```yml
# application.yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/wdog?useUnicode=yes&characterEncoding=UTF8
    password: root
    username: root
    driver-class-name: com.mysql.jdbc.Driver
```
- 启动
    
    运行`WatchDogApplication.java`，默认端口为1000
    
 ## 客户端

- [点击此处进入“watchdog-framework-web”项目部署说明](https://github.com/watchdog-framework/watchdog-framework-web)

# 讨论

 - QQ群：30261540  &nbsp; [点我加入QQ群讨论](https://shang.qq.com/wpa/qunwpa?idkey=c3541f1d0dbe443456228e3aebf23f6795b614a94d5df6a32f0b2b1c759bb99b)

- 作者博客：[https://www.licoy.cn](https://www.licoy.cn)

# 项目地址

- Github：[https://github.com/watchdog-framework/watchdog-framework](https://github.com/watchdog-framework/watchdog-framework)

- 码云：[https://gitee.com/licoy/watchdog-framework](https://gitee.com/licoy/watchdog-framework)

# TODO

- [ ] 支持容器化
- [ ] 字典
- [ ] 日志记录
- [ ] More...


# 开源协议
MIT
    