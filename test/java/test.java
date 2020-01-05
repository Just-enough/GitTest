import org.junit.Test;

import java.net.URL;

/**
 * @author lg
 * @version 1.0
 * @since 1.8
 */
public class test {
    @Test
    public void test(){
        URL url= this.getClass().getClassLoader().getResource(".");
        String classpath = url.getPath();
        System.out.println(classpath);
    }
}
