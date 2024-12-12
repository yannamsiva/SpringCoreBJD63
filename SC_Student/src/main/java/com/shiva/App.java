package com.shiva;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shiva.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    BeanFactory ctx=new XmlBeanFactory(new ClassPathResource("spring.xml"));
    Student s=(Student)ctx.getBean("st");
    System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());
    		
    
    
    }
}
