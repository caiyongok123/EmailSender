package com.cy.mylibrary;

public class SenderEmailInfo {
    private String mailServerHost;// 发送邮件的服务器的IP
    private String mailServerPort;// 发送邮件的服务器的端口
    private String fromAddress;// 邮件发送者的地址
    private String password;// 登陆邮件发送服务器的密码

    public String getMailServerHost() {
        return mailServerHost;
    }

    public void setMailServerHost(String mailServerHost) {
        this.mailServerHost = mailServerHost;
    }

    public String getMailServerPort() {
        return mailServerPort;
    }

    public void setMailServerPort(String mailServerPort) {
        this.mailServerPort = mailServerPort;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SenderEmailInfo(String mailServerHost, String mailServerPort, String fromAddress, String password) {
        this.mailServerHost = mailServerHost;
        this.mailServerPort = mailServerPort;

        this.fromAddress = fromAddress;
        this.password = password;
    }
}
