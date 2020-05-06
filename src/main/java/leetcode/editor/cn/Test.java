package leetcode.editor.cn;

/**
 * @author ：xinze
 * @date ：Created by 2020/4/23 09:23
 * @description：
 * @modified By：
 * @version:
 */

public class Test {

    public static void main(String[] args) {
        float a = 0.125f;
        double b = 0.125d;
        //1、true
        System.out.println((a - b) == 0.0);

        double c = 0.8;
        double d = 0.7;
        double e = 0.6;
        //2、false
        System.out.println((c-d));
        System.out.println((d-e));
        System.out.println((c-d) == (d-e));

        //3、Infinity
        System.out.println(1.0 / 0);
        //System.out.println(1.0 / 0);

        //4、NaN
        System.out.println(0.0 / 0.0);
        System.out.println(1 / 0);

        //5、D.正整数一定没有区别

        Test test = new Test();

        //6、D编译出错
        //test.f(null);

        //7、前者
        test.g(1);

        //8、D.直接抛出异常
        //String s = null;
        ////s=null;
        //switch (s){
        //    //case null : break;
        //    case "c": {
        //        System.out.println("null");
        //        break;
        //    }
        //    default:{
        //        System.out.println("default");
        //    }
        //}

        //9. 编译正确
        //10. HashMap 初始容量 10000 即 new HashMap(10000)，
        // 当往里 put 10000 个元素时，需要 resize 几次？
        // 0次


    }

    <String, T, Alibaba> String get(String string, T t) {
        return string;
    }

    void g(Integer i){
        System.out.println("I");
    }
    void g(double d){
        System.out.println("D");
    }

    void f(Integer i){
        System.out.println("FI");
    }
    void f(String s){
        System.out.println("FS");
    }
}
