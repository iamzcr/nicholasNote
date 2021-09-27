集合(单列结合，双列集合)
两大类collection（单列结合） 和map(双列集合,存放k-v)
collection:List Set
List : ArrayList, Vector LinkedList
Set: hashSet,TreeSet

Map: hashMap->LinkedHashMap,HashTable->Properties,TreeMap

collection实现子类可以存放多个元素，每个元素可以是object
collection的实现类，可以存放重复元素，有些不行
collection有些是有序的(list),有些是无序的(set)
collection没有直接的子类，通过子接口list和set实现

collection遍历元素的方式，Iterator(迭代器)
Iterator对象称为迭代器，主要用于遍历collection集合中的元素
所有实现了collection集合类都有一个iterator()方法，用以返回一个实现Iterator接口的对象，就是返回一个迭代器
Iterator仅仅用于遍历集合，Iterator本身不存放对象
快捷键itit

ctrl+j显示所有快捷键

collection遍历元素的方式，增强for循环，和迭代器的本质是一样的，调用Iterator迭代器
快捷键iter

list
list集合元素是有序的(即添加顺序，取出顺序是一致的)，且可以重复
list集合中的每个元素都有对应的顺序索引，即支持索引
list容器中的元素都对应一个整型的序号记载其在容器中的位置，可以更具序号存取容器中的元素
jdk的api中，有大量的类实现了list接口，ArrayList, Vector LinkedList
ArrayList有数组来实现数据存储
ArrayList基本等同于Vector，但是ArrayList线程不安全(执行效率高)，在多线程情况下，不建议使用ArrayList

ArrayList维护了一个object类型的数组，elementData，elementData是一个object类型的数组,
当创建ArrayList对象时，无参构造方法(new ArrayList())会给elementData初始化容量为0，第一次添加，则扩容为10，如果需要再次扩容，则扩容elementData的1.5倍
如果使用指定大小的构造方法(new ArrayList(3))，初始容量就是指定的容量，后面需要扩容，直接扩容为elementData的1.5倍
用transient关键词 transient Object[] elementData，属性不会被序列化

Vector底层也是一个对象数组，protected Object[] elementData
Vector是线程同步的，操作方法带有synchronized关键词，所以如果开发中要考虑线程同步安全的时候(多个线程操作一个集合)，考虑用Vector
如果是无参构造方法，默认10个容量，满了之后，按2倍扩容
如果是有参构造方法，指定大小，每次按2倍扩容

LinkedList底层实现了双向链表和双端队列的特点
可以添加任意元素(元素可以重复)，包括null
线程不安全，没有实现同步
LinkedList中维护了两个属性first和last分别指向首节点和尾节点
每个节点(node对象)里面维护了prev，next，item三个属性，其中通过prev指向前一个，通过next指向后一个节点，最终实现双向链表
所以LinkedList的元素的增加和删除，不是通过数组完成(通过指向)，相对效率较高

如果我们改查操作比较多，选择ArrayList
如果增删操作比较多选择LinkedList

Set

Set接口的实现类的对象(Set接口对象)，不能存放重复的元素
Set接口的实现类的对象(Set接口对象)，存放的数据是无序的，添加的顺序和取出的顺序不一致
Set接口的实现类的对象(Set接口对象)，取出的顺序是固定的，也就是第一次取出的顺序和后面第n次的顺序是固定的，不管后面怎么添加

HashSet
HashSet实际上是HaseMap
HashSet不能添加相同的元素或者数据(相同的对象)
添加一个元素时候，先得到hash值，会转成索引值
找到存储数据表table，看这个由hash值索引位置是否已经存放的有元素，如果没有(也就是新加的值的hash值在table里面找不到)，直接加入
，如果有，调用equals比较，如果相同，就放弃添加，如果不相同，则添加到最后
java8中，如果一个链表的元素个数超过了TREEIFY_THRESHOLD(默认是8)，并且table的大小>=MIN_TREEIFY_CAPACITY(默认64),就会进化成红黑树

HashSet扩容机制
haseSet底层是hashMap，第一次添加时，table数组扩容到16，临界值(threshold)是16*加载因子（loadFactor）是0.75=12
如果table数组使用到了临界值12，就扩容到16*2=32，新的临界值就是32*0.75=24，以此类推
java8中，如果一个链表的元素个数超过了TREEIFY_THRESHOLD(默认是8)，并且table的大小>=MIN_TREEIFY_CAPACITY(默认64),就会进化成红黑树

hashCode和equals
如果hashCode相同，值不同，会加在haseSet的table的链表上
如果hashCode相同，值相同，不会加入haseSet的table上
如果hashCode不同，值不同，会直接加在haseSet的table上


LinkedHashSet
LinkedHashSet的底层是一linkedHashMap，维护了一个数组加双向链表
LinkedHashSet根据元素的hashCode值来决定元素的存储位置，同时使用链表维护元素的次序(也就是插进去的数据和取出来的数据的顺序看起来是一样的)，这使得元素看起来是以插入顺序来保存的

map接口
Map
Map和中的key和value可以是任何引用类型的数据，会封装到HashMap&Node中
Map的key不能重复，原因和hashSet一样，value可以重复，可以为null
常用String类型作为key
key和value之间存在单向一对一关系，可以通过指定的key找到value
key和value存在Node对象中，而Node对象实现了entry接口

hashMap
hashMap是Map接口使用频率最高的实现类
hashMap没有实现同步，因此线程不安全
hashMap底层是数组+链表+红黑树
hashMap的扩容机制和hashSet完全一样，因为hashSet底层就是一个hashMap

剪枝：树化后删除了某些key，会删除节点重现变成链表

hashTable
hashTable实现了Map接口
hashTable的键和值都不能为null
hashTable使用方法和hashMap一样
hashTable是线程安全的，hashMap线程不安全
