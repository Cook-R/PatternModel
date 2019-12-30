package FileOperation.Properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
    private static Properties props;

    synchronized static private void loadprops() {
        System.out.println("开始加载properties文件内容");
        props = new Properties();
        InputStream in = null;

        /*第一种，通过类加载器进行获取properties文件流*/
//        in = PropertyUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");

        /*第二种，通过类进行获取properties文件流*/
        in = PropertyUtil.class.getResourceAsStream("jdbc.properties");

        try {
            props.load(in);
        } catch (IOException e) {
            System.out.println("e.printStackTrace()异常");
        }finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("e.printStackTrace();文件流关闭异常");
                }
            }
        }
        System.out.println("加载properties文件内容完成");
        System.out.println("文件内容为" + props);
    }

    public static String getProperty(String key) {
        if (null == props) {
            loadprops();
        }
        return props.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        if (null != props) {
            loadprops();

        }
        return props.getProperty(key, defaultValue);
    }

    public static void main(String[] args) {
        PropertyUtil.getProperty("test");
    }

}
