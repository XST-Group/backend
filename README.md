* 配置好了基本的Spring和Hibernate环境，具体参考WEB-INF下的config文件夹。  
* 需要注意的是，mysql的配置文件被ignore了，所以需要自己加入本地的配置。    
比如：  
jdbc.user=root   
jdbc.password=root    
jdbc.driverClass=com.mysql.jdbc.Driver    
jdbc.jdbcUrl=jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8     
jdbc.initPoolSize=20    
jdbc.maxPoolSize=50
* Spring MVC测试过了，能访问 http://localhost:8080/XST/index 就算成功了。   

* 我将hibernate版本降低回来了，因为hibernate5和spring4的整合有点不一样。
* 对于hibernate，由于数据库的engine是myisam，不支持外键，所以对于一对多等关系，需要我们手动修改bean并且写注解，参考com.xst.bean下的两个例子。例子仅供参考，至于具体怎么写看需求。还有，推荐使用注解，方便，不要用配置文件了。
* 表很多，bean（或者叫entity）可以用hibernate  tools生成，使用这个插件的时候，选择hibernate配置文件去选择config文件夹下的hibernate.cfg.tools.xml，这个里面的数据库、用户名、密码改成自己本机的。而这个配置文件hibernate.cfg.xml是系统用的，里面没有数据库配置，数据库配置交给spring了。当然，自动生成的bean是需要修改的，参考那两个例子。
* Dao我也写了一个很简单的例子，在com.xst.dao下，就继承了一个BaseDao，大家具体实现的时候，可以自己想一下怎么设计接口、抽象类什么的。
* 能访问 http://localhost:8080/XST/index，并且控制台可以打印出mysql语句以及“超级管理员”，说明成功了。
* 其他问题可能需要后续再修改。
