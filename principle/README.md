### 单一职责原则

> A class or module should have a single responsibility.

单一职责原则(`Single Responsibility Principle`,SRP): 就一个类而言, 应该仅有一个引起它变化的原因. 即一个类应该**只负责一个功能领域中的相应职责**.

**理解**:

一个类只负责完成一个职责或者功能. 不要设计大而全的类, 要设计粒度小, 功能单一的类. 单一职责原则是为了实现代码高内聚, 低耦合, 提高代码的复用性, 可读性, 可维护性.

**如何判断是否足够单一**?

不同的**应用场景**, 不同阶段的**需求背景**, 不同的**业务层面**, 对同一个类的职责是否单一, 可能会有不同的判定结果.

实际上, 一些侧面的判断指标更具有指导意义和可执行性, 比如, 出现下面这些情况就有可能说明这类的设计不满足单一职责原则:

* 类中的代码行数, 函数或者属性过多.
* 类依赖的其他类过多, 或者依赖类的其他类过多.
* 私有方法过多.
* 比较难给类起一个合适的名字(说明类的职责定义得可能不够清晰).
* 类中大量的方法都是集中操作类中的某几个属性.

**类的职责是否设计得越单一越好**?

单一职责原则通过避免设计大而全的类, 避免将不相关的功能耦合在一起, 来提高类的内聚性. 同时, 类职责单一, 类依赖的和被依赖的其他类也会变少, 减少了代码的耦合性, 以此来实现代码的高内聚, 低耦合. 但是, 如果拆分得过细, 实际上会适得其反, 反倒会降低内聚性, 也会影响代码的可维护性.

### 开闭原则

> Software entities (modules, classes, functions, etc.) should be open for extension, but closed for modification.

开闭原则(`Open-Closed Principle`,OCP): 是指软件实体(类, 模块, 函数等等)应该**可以扩展**, 但是**不可修改**.

**如何理解对扩展开放, 对修改关闭**?

添加一个新的功能, 应该是通过在已有代码基础上扩展代码(新增模块/类/方法/属性等), 而非修改已有代码(修改模块/类/方法/属性等)的方式来完成. 关于定义, 我们有两点要注意:

* 第一点是, 开闭原则并不是说完全杜绝修改, 而是以最小的修改代码的代价来完成新功能的开发.
* 第二点是, 同样的代码改动, 在粗代码粒度下, 可能被认定为"修改"; 在细代码粒度下, 可能又被认定为"扩展".

**如何做**?

我们要时刻具备扩展意识, 抽象意识, 封装意识. 在写代码的时候, 我们要多花点时间思考一下, 这段代码未来可能有哪些需求变更, 如何设计代码结构, 事先留好扩展点, 以便在未来需求变更的时候, 在不改动代码整体结构, 做到最小代码改动的情况下, 将新的代码灵活地插入到扩展点上.

### 里氏替换原则

> If S is a subtype of T, then objects of type T may be replaced with objects of type S, without breaking the program.
>
> Functions that use pointers of references to base classes must be able to use objects of derived classes without knowing it.

里氏替换原则(`Liskov Substitution Principle`,LSP): 子类对象(object of subtype/derived class)能够替换程序(program)中父类对象(object of base/parent class)出现的任何地方, 并且保证原来程序的逻辑行为(behavior)不变及正确性不被破坏.

与多态的区别: 多态是面向对象的一大特性, 而里氏替换原则是设计原则. LSP 更关注的是对象行为, 用来指导继承关系中子类该如何设计, 子类的设计要保证在替换父类的时候, 不改变原有程序的逻辑及不破坏原有程序的正确性, 举个例子就是父类定义了一个方法, 不存在则返回 null, 子类重写(多态)了这个方法, 不存在则抛出异常, 这就违反了里氏替换原则.

> PS: ***[Liskov](https://en.wikipedia.org/wiki/Barbara_Liskov)*** 是美国历史上第一个女计算机博士, 曾获得过**图灵奖**.

### 接口隔离原则

> Clients should not be forced to depend upon interfaces that they do not use.

接口隔离原则(`Interface Segregation Principle`,ISP): 使用专门的接口, 而不使用单一的总接口, 即客户端不应该依赖那些它不需要的接口.

根据接口隔离原则, 当一个接口太大时, 我们需要将它分割成一些更细小的接口, 使用该接口的客户端仅需知道与之相关的方法即可. 每一个接口应该承担一种相对独立的角色, 不干不该干的事, 该干的事都要干.

### 依赖倒置原则

> High-level modules shouldn’t depend on low-level modules. Both modules should depend on abstractions. In addition, abstractions shouldn’t depend on details. Details depend on abstractions.

依赖倒置原则(`Dependency Inversion Principle`,DIP): 抽象不应该依赖细节, 细节应该依赖于抽象. 即应该**针对接口编程**, 而不是针对实现编程.

看起来这个原则跟多态类似, 但实际上, 多态是 JAVA 语言的特性, DIP 是指导思想. 而且 DIP 强调的是 **Design By Contract**, 即契约编程. 这个契约包括函数的功能定义, 入参出参以及异常输出等行为, 子类替换了父类不能改变这些行为.

举个例子就是, 一个函数, 对输入的数字不做校验, 而子类则校验数字不能小于零, 这样就改了父类原有的行为, 违反了 DIP.

### 迪米特法则
迪米特法则(`Law of Demeter`,LoD): 一个软件实体应当尽可能少地与其它实体发生相互作用.

迪米特法则又称为**最少知识原则**(`LeastKnowledge Principle`,LIP).
如果一个系统符合迪米特法则, 那么当其中某一个模块发生修改时, 就会尽量少地影响其他模块, 扩展会相对容易, 这是对软件实体之间通信的限制, 迪米特法则要求限制软件实体之间通信的宽度和深度. 迪米特法则可降低系统的耦合度, 使类与类之间保持松散的耦合关系. 