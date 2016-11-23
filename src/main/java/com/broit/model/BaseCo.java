package com.broit.model;

public class BaseCo  implements IBaseModel{
    private String id;

    private String coname;

    private String sysname;

    private String uiLogo;

    private String uiLogin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getConame() {
        return coname;
    }

    public void setConame(String coname) {
        this.coname = coname == null ? null : coname.trim();
    }

    public String getSysname() {
        return sysname;
    }

    public void setSysname(String sysname) {
        this.sysname = sysname == null ? null : sysname.trim();
    }

    public String getUiLogo() {
        return uiLogo;
    }

    public void setUiLogo(String uiLogo) {
        this.uiLogo = uiLogo == null ? null : uiLogo.trim();
    }

    public String getUiLogin() {
        return uiLogin;
    }

    public void setUiLogin(String uiLogin) {
        this.uiLogin = uiLogin == null ? null : uiLogin.trim();
    }
}