
### 优化思想
1、暴力解决
2、升维，一维数据要加速，需要升级为二维等

### 数学归纳法
程序大体上只能执行简单逻辑（if else /for while/ recursion）
1、找最简单数据的解
2、泛化（最近重复子问题）


### 跳表
只能用于元素有序的情况
对标二叉树和二分查找树
是一种 插入/删除/搜索都是O(log^n)的数据结构
原理简单、容易实现、方便扩展、效率更好


### 夹逼定理
适合数据慢慢收敛的场景（代表：双指针实现）

### Queue源码分析
Queue队列继承Collection接口，除了提供有关Collection的基础操作外，还增加了额外的添加、删除和查询操作，这些方法存在两种形式：
1、操作失败抛出异常: add(e)、remove()、element()
2、操作失败返回特定值（null或者false）: offer(e)、poll()、peek()
后者中的插入接口主要应用于那些容量有限的一些队列实现.

Queue数据算法：
1、使用FIFO先进先出组织元素数据（优先队列PriorityQueue除外）
2、LIFO后入先出（栈）

以上数据进出队列算法，由具体实现维护，用户只需要调用相应的方法即可，例如remove方法，在不同实现上是移除队尾元素还是队首元素，均参考对应实现的数据排列规则


### PriorityQueue源码分析
优先级队列是机遇优先堆实现的，按照自然序（实现Comparable）或在构造初始化时提供的Comparator进行排序比较元素大小。
优先队列不接受null值，如果按照自然序（初始化时，未提供Comparator实现），队列元素必须实现Comparable接口

PriorityQueue是非线程安全的，方法未提供synchronized同步，不支持多线程并发访问、修改，可使用PriorityBlockingQueue替代

offer、poll、remove()、add等入队出队的方法时间复杂度为 O(log(n)) ，remove(Object)、contains(Object)方法是线性复杂度，而对于peek、element、size等方法是O(1)的常数时间复杂度


