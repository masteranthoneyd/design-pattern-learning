> Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

定义一族算法类, 将每个算法分别封装起来, 让它们可以互相替换. 策略模式可以使算法的变化独立于使用它们的客户端(这里的客户端代指使用算法的代码).

说白了, 策略模式大部分是用来代替 if else 的, 比如应用有多种登陆方式, 短信验证码登陆、微信登陆、手机一键登录等, 那么为了避免使用过多的 if else 影响代码的可读性以及扩展性, 可以使用策略模式, 那么即使再多加一个登陆方式, 也是只是多加一个策略而已.