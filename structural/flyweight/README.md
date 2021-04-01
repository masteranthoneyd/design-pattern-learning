与单例, 缓存, 对象池的区别

与单例的区别:
单例指的是一个类只能有一个实例, 而享元模式可以有多个实例.

与缓存的区别:
一般我们所说的缓存是指 CPU, 内存缓存这些, 只要是为了提高访问速度, 而非复用.

与对象池的区别:
对象池类似的地方就是对象的复用, 开辟一片空间将对象放在里面, 需要的时候取出来. 但是对象池的复用是因为创建对象的代价比较昂贵, 比如线程池, 连接池这些, 同时每个对象只能被一个线程所有拥有. 而享元模式的对象可以被所有线程共享, 是为了节省内存或者避免重复计算.