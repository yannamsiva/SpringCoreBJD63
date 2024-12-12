package com.shiva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

   // BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("spring.xml"));
    
//SpringBean obj=(SpringBean)ctx.getBean("sb");
    

//System.out.println(obj);
ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");



    }
}
