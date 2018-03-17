package demo1;

/*输入线程,对资源对象Resource中的成员变量赋值
一次赋值张三,男
下一次赋值李四,女
* */
public class Input implements  Runnable {
    private Resource r;
    public Input(Resource r){
        this.r=r;
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (r) {
                if (r.flag) {
                    try {
                        r.wait();
                    } catch (Exception ex) {
                    }
                }
                if (i % 2 == 0) {
                    r.name = "张三";
                    r.sex = "男";
                } else {

                    r.name = "李四";
                    r.sex = "女";
                }
                //将对方线程唤醒,标记改为true
                r.flag = true;
                r.notify();
            }
                i++;
            }
        }
    }

