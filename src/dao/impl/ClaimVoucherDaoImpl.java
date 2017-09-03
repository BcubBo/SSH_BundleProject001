package dao.impl;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ClaimVoucherDao;
import po.BizClaimVoucher;

public class ClaimVoucherDaoImpl extends HibernateDaoSupport implements ClaimVoucherDao {

	@Override
	public void save(BizClaimVoucher claimVoucher) {
		
		this.getHibernateTemplate().save(claimVoucher);
		
	}
	//save方法
	
	public void show(int i ,String...values) {
		
		this.getHibernateTemplate().bulkUpdate("queryString ? ? ?",1,"a","b");
		this.getHibernateTemplate().clear();
		//清除对象，使对象处于脱机状态 
		this.getHibernateTemplate().delete(null);
		//删除对象
		this.getHibernateTemplate().deleteAll(null);
		//删除所有对象
		this.getHibernateTemplate().evict(null);
		//evacuate也是清除对象
		this.getHibernateTemplate().find("from ? ? ?",1,"bac",new Date());
		//查找方法
		this.getHibernateTemplate().findByCriteria(null,1,1);
		//通过Criteria查询
		this.getHibernateTemplate().findByExample(null);
		//通过简单对象查询，提取对象中的包含值的属性，但是不考虑主键和外键，而且条件运算符有限制。只能为==或者为like大于或者小于不适用
		
	}

}
