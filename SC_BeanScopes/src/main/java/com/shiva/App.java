package com.shiva;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shiva.pojo.SpringBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("spring.xml"));
    
SpringBean obj=(SpringBean)ctx.getBean("sb");
    
SpringBean obj1=(SpringBean)ctx.getBean("sb");
  
SpringBean obj2=(SpringBean)ctx.getBean("sb");
System.out.println(obj);
System.out.println(obj1);
System.out.println(obj2);




    }
}
