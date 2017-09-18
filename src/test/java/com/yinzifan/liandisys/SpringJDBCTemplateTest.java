package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0918_spring03_JDBCDemo.bean.Customer;
import com.yinzifan.liandisys._0918_spring03_JDBCDemo.dao.CustomerDAO;

/**
 * @author yinzf2
 * 2017/09/18	16:48:42
 */
public class SpringJDBCTemplateTest {
	@Test
	public void testSpringJDBCTemplate() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-Customer2.xml");

		CustomerDAO dao = (CustomerDAO) ac.getBean("customerDAO");
		Customer customer = dao.findByCustomerId(1);
		if (customer != null) {
			System.out.println(customer.toString());
		}
	}
}
