package com.yinzifan.liandisys;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yinzifan.liandisys._0926_SpringBean07PropertyPlaceholderConfigurer_Demo.JdbcCustomerDAO;
import com.yinzifan.liandisys._0926_SpringBean08RequiredAnno_Demo.bean.Customer;

/**
 * @author yinzf2
 * 2017/09/26	10:24:12
 */
public class _05_SpringBean08_Demo {
	@Test
	public void testSpringBean08() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("_0926_SpringBean08_ApplicationContext.xml");
		Customer customer = ac.getBean("customer", Customer.class);
		System.out.println(customer.toString());
	}
}
