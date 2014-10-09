package dataobject;

import org.junit.Test;

/**
 * Created by yangqi on 9/27/14.
 */
public class MachineTest {
    @Test
    public void testGetName(){
        Machine machine=new Machine();
        machine.setName("hello");
        System.out.println(machine.getName());
        System.out.println(machine);
    }
}
