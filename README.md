# catch-bad-unit-tests

A tiny test repository to exercise different methods to detect
incorrectly written Clojure unit tests.

## Usage

To run the unit test in `test/catchme/core_test.clj` from the shell
using Leiningen:

```
$ lein test
```

To run the unit tests with multiple versions of Clojure that have been
specified as profiles in `project.clj`, and listed in the `test-all`
alias defined there:

```
$ lein test-all
```

To run the Eastwood linter:

```
$ lein eastwood
```

## Results

Below are the results I get when trying these commands on my system, a
MacBook Pro running macOS 10.12.6 with these versions of the JVM and
Leiningen installed:

```
$ java -version
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)

$ lein version
Leiningen 2.8.1 on Java 1.8.0_181 Java HotSpot(TM) 64-Bit Server VM
```

The results show no errors caught when running `lein test` with any of
Clojure 1.9.0, 1.10.0-alpha6, or 1.10.0-alpha7.  Eastwood 0.2.8 does
catch it, as it has caught similar problems for several versions
before that, too.

```
$ lein test

lein test catchme.core-test
Running deftest b-test with Clojure 1.10.0-alpha7

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.

$ lein test-all
Performing task 'test' with profile(s): 'test,1.9,dev'

lein test catchme.core-test
Running deftest b-test with Clojure 1.9.0

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
Performing task 'test' with profile(s): 'test,1.10a6,dev'

lein test catchme.core-test
Running deftest b-test with Clojure 1.10.0-alpha6

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
Performing task 'test' with profile(s): 'test,1.10a7,dev'

lein test catchme.core-test
Running deftest b-test with Clojure 1.10.0-alpha7

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.

$ lein eastwood
== Eastwood 0.2.8 Clojure 1.10.0-alpha7 JVM 1.8.0_181
Directories scanned for source files:
  src test
== Linting catchme.core ==
== Linting catchme.core-test ==
Entering directory `/Users/jafinger/clj/catch-bad-unit-test'
test/catchme/core_test.clj:7:7: suspicious-expression: = called with 1 args.  (= x) always returns true.  Perhaps there are misplaced parentheses?
== Warnings: 1 (not including reflection warnings)  Exceptions thrown: 0
Subprocess failed
```


## License

Copyright © 2018 Andy Fingerhut

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
