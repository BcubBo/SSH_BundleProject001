package po;

/**
 * BizClaimVoucherDetail entity. @author MyEclipse Persistence Tools
 */

public class BizClaimVoucherDetail implements java.io.Serializable {

	// Fields

	private Long id;
	private BizClaimVoucher bizClaimVoucher;
	private String item;
	private Double account;
	private String desc;

	// Constructors

	/** default constructor */
	public BizClaimVoucherDetail() {
	}

	/** full constructor */
	public BizClaimVoucherDetail(BizClaimVoucher bizClaimVoucher, String item,
			Double account, String des) {
		this.bizClaimVoucher = bizClaimVoucher;
		this.item = item;
		this.account = account;
		this.desc = des;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BizClaimVoucher getBizClaimVoucher() {
		return this.bizClaimVoucher;
	}

	public void setBizClaimVoucher(BizClaimVoucher bizClaimVoucher) {
		this.bizClaimVoucher = bizClaimVoucher;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getAccount() {
		return this.account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String des) {
		this.desc = des;
	}

}