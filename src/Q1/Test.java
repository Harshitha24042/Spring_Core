package Q1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Test {
	ApplicationContext context=new FileSystemXmlApplicationContext("src/Q1/q1.xml");

	Customer c1=(Customer) context.getBean("cust");
	 c1.displaycust();



}
