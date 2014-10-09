package dataobject;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by yangqi on 8/20/14.
 */
public class Book {
    private String name2;
    private Integer age;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
               "name2='" + name2 + '\'' +
               ", age=" + age +
               '}';
    }
}
