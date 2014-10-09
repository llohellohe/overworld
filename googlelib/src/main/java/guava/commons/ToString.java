package guava.commons;

import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import dataobject.Book;

/**
 * Created by yangqi on 9/14/14.
 */
public class ToString {
    public static void main(String[] args) {
        Book book=new Book();
        book.setName2("hello");
    //    book.setAge(100);
        System.out.println(book);

        String[]array=new String[]{"a"," b","c ","d"};
        Splitter splitter=Splitter.on(",").trimResults();
        System.out.println(splitter);

    }
}
