package com.cy.mylibrary;

import android.support.annotation.NonNull;

import java.io.File;

public class SendMailUtil {

    public static void send(SenderEmailInfo senderInfo,String toAdd,String title,String txt,final File file) {
        final MailInfo mailInfo = creatMail(senderInfo,toAdd,title,txt);
        final MailSender sms = new MailSender();
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (file!=null){
                    sms.sendFileMail(mailInfo, file);
                }else {
                    sms.sendTextMail(mailInfo);
                }

            }
        }).start();
    }

    @NonNull
    private static MailInfo creatMail(SenderEmailInfo info,String toAdd,String title,String txt) {
        final MailInfo mailInfo = new MailInfo();
        mailInfo.setMailServerHost(info.getMailServerHost());
        mailInfo.setMailServerPort(info.getMailServerPort());
        mailInfo.setUserName(info.getFromAddress()); // 你的邮箱地址
        mailInfo.setPassword(info.getPassword());// 您的邮箱密码
        mailInfo.setFromAddress(info.getFromAddress()); // 发送的邮箱
        mailInfo.setToAddress(toAdd); // 发到哪个邮件去
        mailInfo.setSubject(title); // 邮件主题
        mailInfo.setContent(txt); // 邮件文本
        return mailInfo;
    }
}
