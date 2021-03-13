package sptingDemo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {

    @Value("wangcai")
    public String name;
}
