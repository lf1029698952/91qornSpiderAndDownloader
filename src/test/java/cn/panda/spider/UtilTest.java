package cn.panda.spider;

import org.junit.Test;

import java.io.File;

/**
 * @author ZhuYunpeng
 * woscaizi@gmail.com
 * 2018/2/2
 */
public class UtilTest {


        @Test
        public void test1(){

            String fileName = "e:\\91porn\\hello.mp4";
            File file = new File(fileName);
            System.out.println(file.exists());

        }

        @Test
        public void test2(){

            System.out.println((int)Math.ceil((double) (89/100D)));
            System.out.println((int)Math.ceil((double) (189/100D)));
            System.out.println((int)Math.ceil((double) (289/100D)));

        }


}
