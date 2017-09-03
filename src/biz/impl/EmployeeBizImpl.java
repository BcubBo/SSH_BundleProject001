package biz.impl;

import biz.EmployeeBiz;
import dao.EmployeeDao;
import po.SysEmployee;

public class EmployeeBizImpl  implements EmployeeBiz {
	
	private EmployeeDao employeeDao;
	
	@Override
	public SysEmployee checkLogin(SysEmployee emp) {
		SysEmployee result = employeeDao.findById(emp.getSn());
		if(result!=null && result.getPassword().equals(emp.getPassword())) {
			return result;
		}else {
			
			
			return null;
			
		}
		
		
	}


	
	
	
	
	
	
	//setter 和 getter获取位置
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}//employeeDao获取

}
