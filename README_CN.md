# CountingRod
[English](./README.md)  
CountingRod 是一个数学库，它允许客户使用LaTeX来进行运算，当然，它还能
做得更多！

CountingRod 是模块化的，允许用户自定制。为了您的使用体验，我们建议您安装
模块列表里面的全部模块。

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
translater | 这个模块将 LaTeX 或其他语言翻译成 CountingRod 的命令 | No
