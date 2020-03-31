[![Build Status](https://travis-ci.org/yaesey/CountingRod.svg?branch=master)](https://travis-ci.org/yaesey/CountingRod)
# CountingRod
[简体中文](./README_CN.md)  
CountingRod is a math lib which allows users to do calculations
by LaTeX,and...and it can do more!

CountingRod is modular, allowing users to customize. For your 
experience, we recommend that you install ALL modules in the 
module list.

### Build and Use

* **for common users**  
WIP

* **for developers**  
run `./gradlew idea` or `./gradlew eclipse` to prepare workspace.

### Modules

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
This form is our modules and their use description.If "Used Languages" is "No",that mean it still not been written.  
Module | Description | Used Languages
:-:  | :-:  | :-:
translater | This module can translate LaTex or others languages to CountingRod's commands. | No