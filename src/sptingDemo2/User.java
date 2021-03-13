package sptingDemo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("user")
public class User {

//    @Value("xinran")
    public String name;

    @Resource(name = "dog")
    public Dog dog;

    @Value("xinxinxran")//只能注入基本类型
    public void setName(String name) {
        this.name = name;
    }
}
