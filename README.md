# CountingRod
[简体中文](./README_CN.md)  
CountingRod is a math lib which allows users to do calculations
by LaTeX,and...and it can do more!

CountingRod is written by Java and C++,we are not joking! It is 
modular in design to ensure that each module can be written in 
a different language so that the features and benefits of 
different languages can be exploited.

**Warning:if you see this massage,that 's mean the project has 
*not yet* been written in a mix of Java and C++. So never mind why 
there aren't two or more languages in the project.XD**

#### Build and Use

* **for common users**  
WIP

* **for developers**  
run `./gradlew idea` or `./gradlew eclipse` to prepare workspace.

#### Modules

CountingRod is trying to keep lightweight,so it is few thing in 
main library.In fact,CountingRod only has a tool to link modules 
and a gui.

**How to use**  
If you are in shell,run `counting -link your_module_name`.
This command will find module with `module.json`.You can also run 
`counting -link path` to do this work.  
If you are in gui,that great!Go to the file->Modules/Plugins->Import...
and following all the steps,then done.

**Our Module**  
This form is our modules and their use description.  
Module | Description | Used Languages("No" is meaning it still not been written)
:-:  | :-:  | :-:
latex | This module is translation LaTex to CountingRod's commands. | No
