# soa-services


微服务架构测试项目 dubbox 版！

## 必备环境：
  zookeeper-3.4.6（建议版本）
  
  apache-tomcat-8.5.8（建议版本）
  
  dubbo-admin-2.8.4.zip（建议版本）
  
  maven3（apache-maven-3.3.9-bin 建议版本）
  
  git
  
## 启动：
   安装git环境（可不需要）
   
   安装maven3环境
   
   启动zookeeper，执行zookeeper-3.4.6\bin\zkServer.cmd
   
   启动apache-tomcat-8.5.8，首先配置Tomcat用户，启动Tomcat即可，登录密码：tomcat/tomcat
   
   启动dubbo-admin-2.8.4，扔进Tomcat即可（需要配置dubbo.properties），登录密码：root/root
   
   基础环境结束。
   
## 启动服务：
   git拉取代码，或下载压缩包
   
   执行mvn命名,根目录执行 mvn clean install package  会下载相关包，至此项目编译完成
   
   启动提供者服务 wf-ptestdbx-providers，项目集成了jetty插件，在wf-ptestdbx-providers目录执行mvn jetty:run 即可，执行成功
   dubbo-admin-2.8.4的界面会显示注册成功的服务
   
   启动客户端服务 wf-ptestdbx-proxy，项目集成了jetty插件，在wf-ptestdbx-proxy目录执行mvn jetty:run 即可，执行成功
   dubbo-admin-2.8.4的界面会显示注册成功的服务及消费情况
  
  启动成功后服务访问地址为：ip:8088/services/fileTpl/say/张三
  
  
