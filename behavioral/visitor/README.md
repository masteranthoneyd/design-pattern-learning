对于一组相同类型的对象(继承了相同的父类), 不同的子类对同一操作的实现都不一样, 并且后期可能会新增更多的操作, 那么这时候可以将操作域对象分离, 比如一个文件解工具类:

```
class Extractor {

    extract(Zip zip);
    
    extract(Rar rar);
    
    extract(Bar bar);
}
```

而 Zip, Rar, Bar 这三个类都继承了统一父类 CompressedFile, 那么解压文件伪代码可能会是这样的:

```
class App {
    
    void main() {
        CompressedFile zip = new Zip(PathToZip);
        CompressedFile rar = new Rar(PathToRar);
        CompressedFile bar = new Bar(PathToBar);
        List<CompressedFile> files = Arrays.asList(zip, rar, bar);
        
        Extractor extractor = new ExtractorImpl();
        for(CompressedFile cf : files) {
            extractor.extract(cf);  // 这里会编译报错
        }
    }
}
```

上面的 `extractor.extract(cf)` 编译的时候就已经报错了, 这是由于 Java 的语言特性导致的, 多态是一种动态绑定, 可以在运行时获取对象的实际类型, 来运行实际类型对应的方法. 而函数重载是一种静态绑定, 在编译时并不能获取对象的实际类型, 而是根据声明类型执行声明类型对应的方法. 