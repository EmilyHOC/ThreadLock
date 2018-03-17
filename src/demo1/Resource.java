package demo1;

/*定义一个资源类,有鲁昂个变量name,sex
* 同事有2个线程对资源中的变量操作,
* 1个对name,age赋值
* 2个对变量的输出打印
*
* */
public class Resource {
    public String name;
    public String sex;
    public boolean flag=false;
}
