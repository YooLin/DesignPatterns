package com.lyc.chapter01;

public interface IUserBo {
    boolean changePassword(String oldPwd, String newPwd);

    boolean deleteUser(IUserBo userBo);

    void mapUser(IUserBo userBo);

    boolean addOrg(IUserBo userBo, int orgId);

    boolean addRole(IUserBo userBo, int roleId);
}
