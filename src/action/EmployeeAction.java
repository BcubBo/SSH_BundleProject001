package action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;

import biz.EmployeeBiz;
import biz.impl.EmployeeBizImpl;
import po.SysEmployee;

public class EmployeeAction {
	
	private EmployeeBiz employeeBiz;
	private SysEmployee employee;
	private String message;
	public String login() {
		ApplicationContext acptx= new ClassPathXmlApplicationContext("applicationContext.xml");
		employeeBiz = (EmployeeBizImpl) acptx.getBean("employeeBiz");
		System.out.println(employeeBiz);
		System.out.println("sn:"+employee.getSn());
		System.out.println("pasword:"+employee.getPassword());
		SysEmployee result = employeeBiz.checkLogin(employee);
		if(result ==null) {
			this.message="用户名和密码错误!";
			return "input";
		}else {
			System.out.println("返回值:"+ActionContext.getContext().getSession().get("employee"));
			ActionContext.getContext().getSession().put("employee", result);
			ActionContext.getContext().getSession().put("employee_position",result.getSysPosition().getNameCn());
			return "success";
		}
		
		
		
	}
	
	
	
	
	
	
	
	//setter getter

	public SysEmployee getEmployee() {
		return employee;
	}
	public EmployeeBiz getEmployeeBiz() {
		return employeeBiz;
	}

	public void setEmployeeBiz(EmployeeBiz employeeBiz) {
		this.employeeBiz = employeeBiz;
	}



	public void setEmployee(SysEmployee employee) {
		this.employee = employee;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
