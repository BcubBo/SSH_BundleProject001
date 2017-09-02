package action;

import com.opensymphony.xwork2.ActionContext;

import biz.EmployeeBiz;
import po.SysEmployee;

public class EmployeeAction {
	
	private EmployeeBiz employeeBiz;
	private SysEmployee employee;
	private String message;








	public String login() {
		
		SysEmployee result = employeeBiz.checkLogin(employee);
		if(result ==null) {
			this.message="用户名和密码错误!";
			return "input";
		}else {
			
			ActionContext.getContext().getSession().put("employee", result);
			ActionContext.getContext().getSession().put("employee_position",result.getSysPosition().getNameCn());
			return "success";
		}
		
		
		
	}
	
	
	
	
	
	
	
	//setter getter
	public void setEmployeeBiz(EmployeeBiz employeeBiz) {
		this.employeeBiz = employeeBiz;
	}
	public SysEmployee getEmployee() {
		return employee;
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
