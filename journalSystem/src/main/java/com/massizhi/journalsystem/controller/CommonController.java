package com.massizhi.journalsystem.controller;

import com.massizhi.journalsystem.entity.SubmitJournal;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@CrossOrigin
public class CommonController {
    @RequestMapping(value = "/verificationcode", method = RequestMethod.GET)
    private Map<String, Object> getVerificationCode(String emailCode) throws EmailException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        //生成6位数字随机数
        Random r = new Random();
        int random=r.nextInt(899999)+100000;

        HtmlEmail email=new HtmlEmail();//创建一个HtmlEmail实例对象
        email.setHostName("smtp.163.com");//邮箱的SMTP服务器，一般123邮箱的是smtp.123.com,qq邮箱为smtp.qq.com,163...
        email.setCharset("utf-8");//设置发送的字符类型

        //邮件发送部署在云服务器上时，不要使用默认的端口（25），一般默认是禁掉的，除非解禁。通常改为465端口;
        //如果使用465端口，一定要采用SSL加密方式，否则同样失败。email.setSSLOnConnect(true);
        email.setSmtpPort(465);
        email.setSSLOnConnect(true);

        email.addTo(emailCode);//设置收件人
        email.setFrom("mkxfzu@163.com","EasyPaper Team");//发送人的邮箱为自己的，用户名可以随便填

        //设置发送人到的邮箱和用户名和授权码(授权码是自己设置的)
        email.setAuthentication("mkxfzu@163.com","JPNKWKGYIUNPZVSM");

        email.setSubject("EasyPaper account security verification code");//设置发送主题
        email.setMsg("EasyPaper account security verification code\n\nPlease use the following verification code: \n"+random+
                "\nfor your account: "+emailCode+"\n\nThank you!\nEasyPaper Team");//设置发送内容
        email.send();//进行发送
        modelMap.put("verificationCode", random);
        return modelMap;
    }
}
