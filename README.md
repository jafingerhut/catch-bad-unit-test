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


## License

Copyright © 2018 Andy Fingerhut

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
