## TL;DR

To run analyzier, type:

    source env && sbt
    run ../tracking-logs-analyzer/var/spool/tracking-logs/2014-02-11_11-40_akotnik2.events


## TODO

    - find a good command-line arguments parser 
    - define mysql sink
    - try parsing large (> 1G) file and make sure memory consuption stays low
    - use http://www.grison.me/scalocco for documentation generation
    - make Logging usable (with different loggers)
    - make generators for all possible log cases (for bogus entries too)

Using [ScalaCheck][1] for testing.

[1]: https://github.com/rickynils/scalacheck/wiki/User-Guide
[2]: http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/ScalacheckTutorial.html
