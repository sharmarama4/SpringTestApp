package testapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testapp.data.Test;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String returnHi(){
        return "hi!";
    }

    @RequestMapping("/")
    public String returnHello(){
        return "hello!";
    }

    @RequestMapping("/Test")
    public Test returnTest(){
        return new Test(1, "Test1", true);
    }

    @RequestMapping("/tests")
    public List<Test> returnTests(){

        List<Test> tests = new ArrayList<>();
        tests.add(new Test(1, "Test1", true));
        tests.add(new Test(2, "Test2", false));
        tests.add(new Test(3, "Test3", true));
        tests.add(new Test(4, "Test4", false));

        return tests;
    }

}
