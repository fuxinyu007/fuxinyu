package com.fuxinyu.bean;

import java.util.Set;

/**
 * @author： fuxinyu
 * Date: 2019/9/30
 * Time: 9:58
 * Description:
 */
public class Role {
    private String id;
    private String roleName;

    private Set<Permissions> permissions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permissions> permissions) {
        this.permissions = permissions;
    }
}
