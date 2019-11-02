# cncc System
中国人民银行清算总中心(人行清算中心)管理系统
1. 系统管理后台，包括用户管理，角色管理，资源链接管理模块，可以动态分配权限和角色。
2. 使用springboot、springdata jpa、shiro等服务端技术，使用freemarker模版渲染页面。
3. 系统中对springdata的查询条件Specification做了简单的封装，更加方便查询条件的灵活使用。
4. 系统启动后，访问：http://39.103.137.119/admin/会自动跳转到后台登录页面。
5. 初始用户名和密码为：admin/cncc。
