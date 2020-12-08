package jar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWorld obj = (HelloWorld)context.getBean("hellobean");
        System.out.println(obj.getName());
    }
}
