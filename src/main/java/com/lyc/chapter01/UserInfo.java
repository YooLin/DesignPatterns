package com.lyc.chapter01;

public class UserInfo implements IUserInfo {

    private IUserBo userBo;
    public void setUserId(String userId) {
        IUserInfo userInfo = new UserInfo();
        IUserBo userBo = userInfo;
    }

    public String getUserId() {
        return null;
    }

    public void setPassword(String password) {

    }

    public String getPassword() {
        return null;
    }

    public void setUserName(String userName) {

    }

    public String getUserName() {
        return null;
    }

    public boolean changePassword(String oldPwd, String newPwd) {
        return false;
    }

    public boolean deleteUser(IUserBo userBo) {
        return false;
    }

    public void mapUser(IUserBo userBo) {

    }

    public boolean addOrg(IUserBo userBo, int orgId) {
        return false;
    }

    public boolean addRole(IUserBo userBo, int roleId) {
        return false;
    }
}
