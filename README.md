组件及作用：
- user: 用户应用
- MySpringBoot: springboot组件，用于启动用户进程

主要工作原理：
SpringBoot有一个注解@SpringBootApplication，是一个复合或者派生注解。当SpringBoot调用run方法的时候，
SpringBoot会通过@EnableAutoConfiguration注解从方法getCandidateConfigurations找到所有需要自动配置类的集合，
以List集合返回，自动配置类存储在META-INF/spring.factories配置文件中，
文件中以AutoConfiguration命名结尾的类向spring容器中添加组件，
通过以Properties结尾命名的类中取得在全局配置文件中配置的属性。
XxxxProperties和@ConfigurationProperties注解与全局配置文件中对应的属性进行绑定，
所以我们在项目中全局配置文件application.yml中可以修改server.port :8081等等。