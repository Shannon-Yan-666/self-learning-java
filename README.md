# self-learning-java
A beginner learning Java on my own, doing basic exercises.

## 📌 仓库说明
- 学习目标： 掌握Java基础语法、面向对象、常用API等
            掌握Java SE 进阶：集合、IO、多线程、Lambda、异常等
- 后续扩展：JavaWeb、Spring Boot、项目实战等
- 练习内容：基础语法题、小项目
- 适合零基础转行、系统复盘、求职复习使用。

## 📂 目录结构

### `javase-basic`（Java SE 基础）
- `/basics`：基础语法练习（HelloWorld、变量、循环、数组等）
- `/oop`：面向对象练习（类、继承、接口、多态等）
- `/api`：常用API练习（String、Math、System等）

### `javase-advanced`（Java SE 进阶）
- `/api`：进阶工具API
  - `/regex`：正则表达式
  - `/math-api`：Math、BigInteger、BigDecimal
  - `/system-runtime`：System、Runtime
  - `/object-api`：Object、Objects
  - `/immutable`：不可变集合
- `/collection`：集合框架
  - `/core`：Collection、Map体系核心
  - `/list`：List接口实现类（ArrayList、LinkedList）
  - `/set`：Set接口实现类（HashSet、TreeSet）
  - `/map`：Map接口实现类（HashMap、LinkedHashMap、TreeMap）
  - `/collections-api`：Collections工具类
- `/functional`：函数式编程
  - `/lambda`：Lambda表达式
  - `/stream`：Stream流
  - `/function-interface`：函数式接口
- `/exception`：异常处理
  - `/throwable`：Throwable体系
  - `/custom-exception`：自定义异常
- `/file`：File文件操作
  - 文件路径、创建删除、遍历目录、文件筛选
- `/io`：IO字节流/字符流、缓冲流、转换流、对象流、压缩流、工具类
- `/thread`：多线程并发编程
  - 线程三种创建方式、线程常用方法
  - synchronized同步锁、Lock锁
  - wait/notify等待唤醒机制
  - 阻塞队列、线程池（内置线程池+自定义线程池）
 
## 🛠 环境与工具
- JDK：Java 8+
- IDE：IntelliJ IDEA
- 版本控制：Git + GitHub

## 🚀 如何运行
1.  确保已安装JDK 8+
2.  进入对应目录，执行 `javac 文件名.java` 编译
3.  执行 `java 类名` 运行程序

## 📅 更新日志
- 2026-05-28：创建仓库，完善README
- 2026-07-06：新增File文件操作、IO流全套练习；新增多线程并发完整案例
