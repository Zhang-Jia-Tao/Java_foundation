package sdkj.zjt.Initlize;

//初始化顺序
//1.静态属性
//2.静态代码块
//3.普通属性
//4.普通代码块
//5.构造函数
//6.方法
public class ch01 {
    //静态属性
    private static String staicField = getStaicField();

    //静态代码块
    static {
        System.out.println(staicField);
        System.out.println("静态代码块初始化");
    }

    //普通属性
    private String field = getField();

    //普通代码块
    {
        System.out.println(field);
    }

    //构造函数
    public ch01(){
        System.out.println("构造函数初始化");
    }

    public static String getStaicField(){
        String staticField = "Static Field Initial";
        return staticField;
    }

    public static String getField(){
        String Field = "Field Initial";
        return Field;
    }

    public static void main(String[] args) {
        new ch01();
    }
}
