####通过javac把test.java=>编译成test.class
####通过java运行test.class
####test.class 要运行在JVM(java虚拟机)上实现跨平台(windows,linux，mac)，而JVM包含在JDK里面，每个平台需要安装对应的JDK(也就是拥有对应的JVM)才能运行
####JDK(java开发工具包) = JRE+java开发工具(java编译工具,javac)
####JRE(java运行环境) = JVM+java核心类库
####JDK下载
https://www.oracle.com/java/technologies/javase-downloads.html

环境配置
1、添加名字为JAVA_HOME环境变量，指向JDK安装目录D:\Java\jdk-11.0.11
2、修改PATH变量%JAVE_HOME%\bin

注意事项：
1、一个源文件中最多只能有一个public类，其他类的个数不限, demo/Test.java,编译后会生成对应的.class文件
2、如果源文件中包含了一个public类，则文件名必须按该类名命名
3、一个源文件中最多只有一个public类，其他类的个数不限，也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法, demo/My.java,编译后会生成对应的.class文件

代码规范：
1、类、方法的注释，要以javadoc的方式来写
2、使用tab操作，实现缩进
3、运算符习惯性加空格
4、行宽度不要超过80字符
5、源文件使用utf-8格式

jdk=》包=》接口，类，异常=>字段，构造方法，成员方法