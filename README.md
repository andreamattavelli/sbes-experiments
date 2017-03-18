# Structure of the Experimental Environment [![Build Status](https://travis-ci.com/andreamattavelli/synthesis-experiments.svg?token=Ur9HUsDar1wFwVPGCRdM&branch=master)](https://travis-ci.org/andreamattavelli/synthesis-experiments)
At the top level there are three folders and one file:

* `common.mk` file containing all the framework-wide configurations;
* `experiments` folder containing experiment-specific files;
* `libraries` folder that contains the libraries subjects of the experiments;
* `tools` all the tools, binaries, and scripts needed by SBES are in this folder.

The file `common.mk` lists all the configurations that need to be set before running SBES the first time. In particular, the setting of the variable `JAVAROOT` needs to be updated according to your specific system configuration. In some cases, also the variable `ANT` may need to be updated to reflect your system configuration.

Each experimental subject (i.e., each target system) has its own directory in the folder experiments. For example, the target systems Guava and GraphStream have their own folders in experiments. Each subject class (i.e., each target class), has its own directory in the folder `experiments/<system-name>`. For example, all the input/intermediate/output files for the class Stack of the Java library are in `experiments/java/stack`. In each system-specific folder (e.g., `experiments/stack`) there is a file called `conf.mk` that contains the definition of the variable `JARNAME`, i.e., the jar file of the system the system-specific folder is referring to.

The folder experiments also contains the Makefile that handles the entire experimental process. 

#Running the Experiments
This step-by-step tutorial focuses on how to run the experiments used to evaluate our technique. All the commands presented in the tutorial will refer to the base directory of the experimental environment.

Please notice that a make command can be parallelized using the `-j` option (for further information, please refer to GNU make documentation).

1. Go to the experiments folder: `$ cd experiments`
2. Now you can run different types of experiments:
  * one single method at a time;

   ```bash
   $ make PROJECT=java CLASS=java/stack TARGET_METHODS=stack.util.Stack.addElement\(Object\)
   ```

  * one single class at a time (with all its methods);

   ```bash
   $ make PROJECT=java CLASS=java/stack
   ```

  * the whole set of experiments.
    
   ```bash
   $ make
   ```
  
  The execution of the whole set of experiments depends on the content of the `targets.txt` file. The `targets.txt` file contains a list of classes to run. For each of those classes, the experimental infrastructure will execute all their methods. For example, a valid entry for the `targets.txt` file may be the following:

  ```bash
  $ cat targets.txt
    guava/arraylistmultimap
    guava/concurrenthashmultiset
    guava/hashbasedtable
    guava/hashmultimap
    guava/hashmultiset
  ```

  The infrastructure will automatically retrieve the method list and execute all of them, either sequentially or in parallel (make `-j` option).
  
  Regardless of the way you decide to run the experiment, each experiment on a method will be performed `ITER` times. This configuration allows a better understanding of the real capabilities of the overall synthesis process in identifying equivalent method sequences. If you want to limit the number of iterations, you can run all the aforementioned commands with the option `ITER`.
  
  `$ make ITER =10`

  Currently, the experimental infrastructure is shipped with `ITER=1`.
  
  The execution of the current experimental process requires several hours (for example, it requires up to 20 hours on a server with 16 parallel jobs, that is with `-j16` option).
3. To clean the experiments you can either erase all data `$ make veryveryclean` or erase the data of all the classes of a particular project `$ make veryclean PROJECT=java`

#Examining the Results of the Experiments
During the execution of the experiments, SBES stores two types of data:
1. data on the effectiveness of the approach, that is the equivalent sequences found within the given search budget (to answer RQ1, RQ2, RQ4 in our FSE 2014 paper);
2. data on the efficiency of the approach, that is the time spent in the synthesis and the counterexample phases (to answer RQ3 in our FSE 2014 paper).
  
  To compute all the experiments data run the following command in the experiments directory:
  
  ```bash
  $ make data
  ```
  
  Notice that the command requires more than one minute, depending on the disk speed.
  
  At the end of the computation there should be several new files in the `experiments` directory: one `_es.txt` and some `.csv` files.

> Due to a bug present in scripts (we will fix it sooner or later) the Python script will likely launch exceptions for experiments without log runs. Nevertheless, at the end of the execution the files for your experiment should be present in the experiments directory.

##Effectiveness
In the experiments folder there should be one file named `libraryname_es.txt` (where `libraryname` is the actual name of the library where you run the experiments).
Each `libraryname_es.txt` file reports, for each triple of class-method-iteration, the list of synthesized equivalent sequences. For example:

```bash  
$ cat graphstream_es.txt
========== graphstream/edge/org.graphstream.graph.implementations.AbstractEdge. addAttribute(String,Object)/1/log
EqSeq1 clone.setAttribute(p0, p1);
EqSeq2 clone.changeAttribute(p0, p1); [...]
```

The manual inspection of this type of file allows the identification of true and false positives. The inspection also allows the generation of the data to fill both Table 1 and Table 2 (RQ1 and RQ2), and Table 4 (RQ4) in the paper.

##Efficiency
SBES stores the time required to perform each step of the technique in a CSV file named `output.csv`. This file is stored in a directory with the same name as the current method under investigation (for example, `stack.util.Stack.addElement(Object)`) inside the iteration directory.

The CSV file is structured as follows:

* **process** reports the overall computation time (ms)
* **scenario** reports the time spent to parse the execution scenario (ms)
* **synthesis** reports the time spent to synthesize an equivalent sequence (ms)
* **counterexample** reports the time spent to generate a counterexample (ms)
* **iteration** reports the time spent for each iteration, that is the time required to create the stubs, to synthesize an equivalent sequence and to generate a counterexample (ms)

The experimental setup generates two CSV files for each class `XYZ`:

1. `max_synthesis_time_XYZ.csv` contains two different columns: first, an identifier composed of the pair <method name;iteration number>; second, the corresponding maximum time required to synthesize an equivalent sequence (in seconds).
2. `max_counterexample_time_XYZ.csv` contains two different columns: first, an identifier composed of the pair <method name;iteration number>; second, the corresponding maximum time required to generate a counterexample (in seconds).

By inspecting these CSV files it is possible to compute the maximum and the median time of all the reported experiments (to answer RQ3 in our FSE 2014 paper).

#Applying SBES on New Case Studies
Suppose that the new case study is contained in the jar archive `system.jar`.

1. Put `system.jar` in the libraries folder

  ```bash
  $ cp system.jar ~/SBES_Replication_Package/libraries
  ```

2. Create a new folder with a new configuration file for the new case study

  ```bash
  $ cd ~/SBES_Replication_Package/experiments
  $ mkdir system
  $ nano system/conf.mk
    JARNAME=system.jar
  ```

3. For each class that you want to analyze, you need to create a specific folder for that class. For example, if you want to analyze the class `Foo`, which is contained in `system.jar`:

  ```bash
   $ cd ~/SBES_Replication_Package/experiments/system
   $ mkdir foo
  ```

4. Specify the list of methods of Foo that you want to consider:
  ```bash
   $ cd ~/SBES_Replication_Package/experiments/system/foo
   $ nano target_methods.txt 
  ```

  It is necessary to write the complete method signature. However, due to compatibility problems with makefiles, it is necessary to replace parentheses with square brackets. For example:
  
  `system.Foo.method(Object,int,File)` → `system.Foo.method[Object,int,File]`
  
  Please notice that generic types are replaced with the Object class.
  
5. Create a directory in the class folder for each method specified in the `target_method.txt` file. The directory name must match the method name as specified in the file. In this case the parentheses are allowed.

6. Generate an initial test scenario and put it in a directory named initial scenario. To generate an initial scenario you can either invoke your favorite test case generator, or write it manually.
  ```bash
   $ cd ~/SBES_Replication_Package/experiments/system/foo/system.Foo.method\(Object,int,File\)
   $ mkdir initial_scenario ; cd initial_scenario
   $ nano InitialScenario.java
  ```
  ```java
    package system;
    import org.junit.Test;
    public class FooTest {
     @Test
     public void test0 () { [...] }
    }
 ```
 
7. Ultimately, run the experiment:
  ```bash
   $ cd ~/SBES_Replication_Package/experiments/
   $ make PROJECT=system CLASS=system/foo
  ```
