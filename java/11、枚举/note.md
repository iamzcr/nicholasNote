枚举类
季节对象是固定的，只需读，不需要修改，这种情况比较适合用枚举类型
枚举是一组常量的集合，一种特定的有限的对象
自定义枚举
构造器私有化
不需要提供set方法，枚举通常为只读
对枚举对象属性使用final+static提高性能
枚举对象名通常大写
对局对象更具需要，也可以有多个属性

enum实现枚举
使用关键字enum替代class,默认继承Enum类，可以用javap反编译查看
如果用enum类来实现枚举，要把常量对象写最前面
有多个常量，用，后分隔
如果使用无参构造方法，实参列表和小括号都可以省略
要区分调用的是哪个构造方法

使用了enum关键字后，就不能继承其他类，因为enum是隐式继承Enum,而java是单继承机制
枚举类可以实现接口，形式如下 ：enum 类名 implements 接口1，接口2{}


注解(Annotation)
三个基本的注解
@Override，限定某个方法，是重写父类的方法，该注解只用于方法（如果写了注解，编译器会去检查是否真的重写了父类的方法，如果没有构成重写，就编译错误）
@Deprecated，用于表示某个程序元素(类，方法等)已过时
@SuppressWarnings：抑制编译器警告
元注解：
@Target:修饰注解的注解
@Retention：指定注解的作用范围
@Documented：指定该注解是否在javadoc体现
@Inherited：子类会继承父类的注解