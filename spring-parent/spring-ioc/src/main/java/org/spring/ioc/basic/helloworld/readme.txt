Instantiating a Spring IoC container is straightforward. 
The location path or paths supplied to an ApplicationContext constructor are actually 
resource strings that allow the container to load configuration metadata 
from a variety of external resources such as the local file system, 
from the Java CLASSPATH, and so on.

ApplicationContext context =
    new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});