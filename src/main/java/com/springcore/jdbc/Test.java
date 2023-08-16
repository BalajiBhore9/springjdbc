package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.entites.Student;

public class Test 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
        
         StudentDao studentdao = context.getBean("studentDao",StudentDao.class);
         
         //Insert Query 
         Student student = new Student();
         student.setId(123);
         student.setName("Manoj");
         student.setCity("Latur");
         
         int result = studentdao.insert(student);
         System.out.println("student added"+result);
         
         //Update Query 
//         Student updatestudent = new Student();
//         updatestudent.setId(122);
//         updatestudent.setName("Raghav");
//         updatestudent.setCity("Barshi");
//         int upresult = studentdao.update(updatestudent);
//         System.out.println("update data.."+upresult);
         
         // Delete query 
//        int re =  studentdao.delete(122);
//        System.out.println(re);
         
    }
}
