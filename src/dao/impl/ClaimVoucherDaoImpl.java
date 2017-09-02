package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ClaimVoucherDao;
import po.BizClaimVoucher;

public class ClaimVoucherDaoImpl extends HibernateDaoSupport implements ClaimVoucherDao {

	@Override
	public void save(BizClaimVoucher claimVoucher) {
		
		this.getHibernateTemplate().save(claimVoucher);
	}

}
