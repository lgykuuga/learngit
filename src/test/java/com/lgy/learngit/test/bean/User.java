package com.lgy.learngit.test.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class User {

    private static final long serialVersionUID = -6535396025047047790L;

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("userLoginId,只做关联")
    private String userLoginId;

    @ApiModelProperty("用户登录账号名")
    private String userLoginName;

    @ApiModelProperty("用户名/userName")
    private String userName;

    @ApiModelProperty("昵称")
    private String nickname;


    @ApiModelProperty("联系电话")
    private String contactNumber;

    @ApiModelProperty("电话号码")
    private String cellphone;

    @ApiModelProperty("email")
    private String email;

    @ApiModelProperty("qq")
    private String qq;

    @ApiModelProperty("客户经理")
    private String customerManager;

    @ApiModelProperty("注册来源")
    private String registerSource;

    @ApiModelProperty("性别, 0:男,1:女")
    private String gender;

    @ApiModelProperty("主账号ID")
    private String userParentId;

    @ApiModelProperty("是否可用")
    private Boolean enabled;

    @ApiModelProperty("是否绑定 cellphone")
    private Boolean bindPhone;

    @ApiModelProperty("是否 虚拟")
    private Boolean virtual;

    @ApiModelProperty("是否需要修改密码")
    private Boolean needChangePassword;

    @ApiModelProperty("登录失败次数")
    private Integer loginFailedTimes;

    @ApiModelProperty("类型      COMMON(普通用户)/TEST(测试用户)")
    private String functionType;

    @ApiModelProperty("用户图像Url")
    private String portraitUrl;

    @ApiModelProperty("创建时间")
    private Date createdStamp;

    @ApiModelProperty("主账号name")
    private String userParentName;

    @ApiModelProperty("用户类型: PERSON/PARTY_GROUP,兼容之前的主账号查询逻辑")
    private String userTypeId;

    @ApiModelProperty("当前密码")
    private String currentPassword;

    @ApiModelProperty("全名")
    private String fullname;

    @ApiModelProperty("认证 Y/N")
    @Deprecated
    private String authenticated;

    @ApiModelProperty("使用邀请码注册   所来自的用户  的UserLoginId")
    private String inviteUserLoginId;

    @ApiModelProperty("使用邀请码注册   所来自的用户  的UserName")
    private String inviteUserName;

    @ApiModelProperty("注册流程是否完整    移动端需补全信息后转为true")
    private Boolean registerCompleted = true;

    @ApiModelProperty("是否处于待入职申请中")
    private Boolean entryApplied = false;

    @ApiModelProperty("待入职的公司ID")
    private String entryCompanyId;

    @Deprecated
    @ApiModelProperty("已废弃--（是否是app用户，为之前的app临时用户）")
    private boolean appUser;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("集团用户默认登录公司ID")
    private String defaultCompanyId;

    @ApiModelProperty("员工状态")
    private String status;

    @ApiModelProperty("申请、离职时间")
    private Date applicationStamp;

    @ApiModelProperty("是否加入公司")
    private Boolean joinParty;

    @ApiModelProperty("userLoginName修改次数")
    private Integer updateTimes;

    @ApiModelProperty("入司时间")
    private Date joinStamp;

    @ApiModelProperty("客户经理已验证")
    private Boolean customerManagerValidated;

    @ApiModelProperty("客服热线")
    private String customerHotline;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getCustomerManager() {
        return customerManager;
    }

    public void setCustomerManager(String customerManager) {
        this.customerManager = customerManager;
    }

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserParentId() {
        return userParentId;
    }

    public void setUserParentId(String userParentId) {
        this.userParentId = userParentId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(Boolean bindPhone) {
        this.bindPhone = bindPhone;
    }

    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    public Boolean getNeedChangePassword() {
        return needChangePassword;
    }

    public void setNeedChangePassword(Boolean needChangePassword) {
        this.needChangePassword = needChangePassword;
    }

    public Integer getLoginFailedTimes() {
        return loginFailedTimes;
    }

    public void setLoginFailedTimes(Integer loginFailedTimes) {
        this.loginFailedTimes = loginFailedTimes;
    }

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public String getUserParentName() {
        return userParentName;
    }

    public void setUserParentName(String userParentName) {
        this.userParentName = userParentName;
    }

    public String getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(String authenticated) {
        this.authenticated = authenticated;
    }

    public String getInviteUserLoginId() {
        return inviteUserLoginId;
    }

    public void setInviteUserLoginId(String inviteUserLoginId) {
        this.inviteUserLoginId = inviteUserLoginId;
    }

    public String getInviteUserName() {
        return inviteUserName;
    }

    public void setInviteUserName(String inviteUserName) {
        this.inviteUserName = inviteUserName;
    }

    public Boolean getRegisterCompleted() {
        return registerCompleted;
    }

    public void setRegisterCompleted(Boolean registerCompleted) {
        this.registerCompleted = registerCompleted;
    }

    public Boolean getEntryApplied() {
        return entryApplied;
    }

    public void setEntryApplied(Boolean entryApplied) {
        this.entryApplied = entryApplied;
    }

    public String getEntryCompanyId() {
        return entryCompanyId;
    }

    public void setEntryCompanyId(String entryCompanyId) {
        this.entryCompanyId = entryCompanyId;
    }

    public boolean isAppUser() {
        return appUser;
    }

    public void setAppUser(boolean appUser) {
        this.appUser = appUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDefaultCompanyId() {
        return defaultCompanyId;
    }

    public void setDefaultCompanyId(String defaultCompanyId) {
        this.defaultCompanyId = defaultCompanyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getApplicationStamp() {
        return applicationStamp;
    }

    public void setApplicationStamp(Date applicationStamp) {
        this.applicationStamp = applicationStamp;
    }

    public Boolean getJoinParty() {
        return joinParty;
    }

    public void setJoinParty(Boolean joinParty) {
        this.joinParty = joinParty;
    }

    public Integer getUpdateTimes() {
        return updateTimes;
    }

    public void setUpdateTimes(Integer updateTimes) {
        this.updateTimes = updateTimes;
    }

    public Date getJoinStamp() {
        return joinStamp;
    }

    public void setJoinStamp(Date joinStamp) {
        this.joinStamp = joinStamp;
    }

    public Boolean getCustomerManagerValidated() {
        return customerManagerValidated;
    }

    public void setCustomerManagerValidated(Boolean customerManagerValidated) {
        this.customerManagerValidated = customerManagerValidated;
    }

    public String getCustomerHotline() {
        return customerHotline;
    }

    public void setCustomerHotline(String customerHotline) {
        this.customerHotline = customerHotline;
    }
}
