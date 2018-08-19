package firstTest.dto;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer id;

	private String userAccount;

	private String userPassword;
	
	private String userOldPassword;

	private String userIcon;

	private String userGender;

	private String userBirthDate;

	private String userRealName;

	private BigDecimal userCash;

	private String userPhone;

	private String userAlipayAccount;

	private String userWechatAccount;

	private Date createTime;

	private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount == null ? null : userAccount.trim();
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}
	
	public String getUserOldPassword() {
		return userOldPassword;
	}

	public void setUserOldPassword(String userOldPassword) {
		this.userOldPassword = userOldPassword;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon == null ? null : userIcon.trim();
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender == null ? null : userGender.trim();
	}

	public String getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(String userBirthDate) {
		this.userBirthDate = userBirthDate == null ? null : userBirthDate.trim();
	}

	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName == null ? null : userRealName.trim();
	}

	public BigDecimal getUserCash() {
		return userCash;
	}

	public void setUserCash(BigDecimal userCash) {
		this.userCash = userCash;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone == null ? null : userPhone.trim();
	}

	public String getUserAlipayAccount() {
		return userAlipayAccount;
	}

	public void setUserAlipayAccount(String userAlipayAccount) {
		this.userAlipayAccount = userAlipayAccount == null ? null : userAlipayAccount.trim();
	}

	public String getUserWechatAccount() {
		return userWechatAccount;
	}

	public void setUserWechatAccount(String userWechatAccount) {
		this.userWechatAccount = userWechatAccount == null ? null : userWechatAccount.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}


}