# CountingRod
[English](./README.md)  
CountingRod 是一个数学库，它允许客户使用LaTeX来进行运算，当然，它还能
做得更多！

CountingRod 由 Java 和 C++ 混合编写，我们没在开玩笑！它是模块化的以便
能够使用不同语言来编写每个模块，这样能够充分利用不同语言的特性和优势。

**警告：如果你看到这条信息，说明本项目还没有使用 Java 和 C++ 混合编写，
所以不要在意为什么在项目中看不到两种或两种以上的语言。XD**

### 构建、使用

* **普通用户**  
WIP

* **开发者**  
run `./gradlew idea` or `./gradlew eclipse` to prepare workspace.

### 模块

CountingRod 试图保持本身的轻量化，所以本身没有提供多少东西在主库中，事实上 
CountingRod 只提供了一个连接不同模块的工具和一个 Gui 界面.

**如何使用**  
如果你在终端，运行 `counting -link 你的模块名` 。这条命令会在根据
`module.json`来查找模块，您可以提前写入模块名和寻找目录。当然也可以运行
`counting -link 路径`  来寻找模块。  
如果你在GUI界面，太棒了！打开 `file->Modules/Plugins->Import...`
然后跟随里面的所有步骤，这样就完成了！

**我们的模块**  
这张表格是我们开发的模块以及它们的描述。
模块 | 描述 | 使用的语言（"No"表示还没有写）
:-:  | :-:  | :-:
latex | 这个模块将LaTeX翻译成 CountingRod 的命令 | No
