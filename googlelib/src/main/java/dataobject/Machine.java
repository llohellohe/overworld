package dataobject;

import lombok.Data;

/**
 * Created by yangqi on 9/27/14.
 */
@Data
public class Machine {
    private String name;
    private String color;

    private Book book;
}
