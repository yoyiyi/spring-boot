package com.yoyiyi.springboot.yo2.yi1;

/**
 * 类名：Person
 * 描述：TODO
 * 时间：2017/12/19 10:13
 *
 * @author <a href="2455676683@qq.com">zzq</a>
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
      super();
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
