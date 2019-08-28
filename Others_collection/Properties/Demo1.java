package Others_collection.Properties;

import java.io.*;
import java.util.Properties;
/**
  * @author:  Zhang
  * @description:
  * 利用 properties 存储资源配置文件
 *       store（）进行存储
  *
 **/
public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("**********    测试Properties类，存储资源   *********");
        Properties pro = new Properties();
        pro.setProperty("Head","Chrome");
        pro.setProperty("url","www.4399.com");
        pro.setProperty("psd","zhang");
        //存在对应资源则返回，不存在，则返回后面的默认值。
        System.out.println("读取url对应的资源，不存在返回默认值");
        System.out.println(pro.getProperty("url","www.baidu.com"));


        System.out.println("\n\n***********************************************************");
        //生成资源文件  分别用pro.store   和  pro.storeToXml保存成不同格式的资源文件
        System.out.println("生成资源文件  分别用pro.store   和  pro.storeToXml保存成不同格式的资源文件");
        pro.store(new FileOutputStream(new File("src/pro.properties")),"asldkhalskdhalksdhlaskdhlashk");
        pro.storeToXML(new FileOutputStream(new File("pro.xml")),"asldkhalskdhalksdhlaskdhlashk");



        System.out.println("\n\n***********************************************************");
        //读取资源文件
        System.out.println("用pro.load 读取.properties 格式资源文件");
        Properties pro2 = new Properties();
        pro2.load(new FileInputStream(new File("pro.properties")));
        System.out.println(pro2.getProperty("url"));


        System.out.println("\n\n***********************************************************");
        System.out.println("用pro.loadFromXML 读取.xml 格式资源文件");
        pro2.loadFromXML(new FileInputStream(new File("pro.xml")));
        System.out.println(pro2.getProperty("url"));

        System.out.println("\n\n***********************************************************");
        //使用类相对路径读取资源文件
        System.out.println("使用类相对路径读取资源文件");
        pro2.load(Demo1.class.getResourceAsStream("/pro.properties"));
        System.out.println(Demo1.class.getName());
        System.out.println(pro2.getProperty("psd"));

        System.out.println("\n\n***********************************************************");
        //使用类绝对路径读取资源文件
        System.out.println("使用类绝对路径读取资源文件");
        pro2.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("pro.properties"));
        String s = Thread.currentThread().getContextClassLoader().getName();
        System.out.println(s);
        System.out.println(pro2.getProperty("psd"));
    }
}
