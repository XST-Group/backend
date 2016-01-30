* 配置好了基本的Spring和Hibernate环境，具体参考WEB-INF下的config文件夹。  
* 需要注意的是，mysql的配置文件被ignore了，所以需要自己加入本地的配置。    
比如：  
jdbc.user=root   
jdbc.password=root    
jdbc.driverClass=com.mysql.jdbc.Driver    
jdbc.jdbcUrl=jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8     
jdbc.initPoolSize=20    
jdbc.maxPoolSize=50    
* Spring MVC测试过了,能访问 http://localhost:8080/XST/index 就算成功了。 
* 其他没有测试，但是依赖加入了，问题不大。
* 其他问题可能需要后续再修改。