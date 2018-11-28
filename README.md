# Sample-HelloWorldTest

A Sample framework for running selenium tests with gradle and TestNg.

And Added support of Allure-Reports and Zalenium

To run tests in local - gradle clean build sample -Dmode=local -Dbrowser=<browserName> -Dtags=<category> 

To run tests in zalenium container - gradle clean build sample -Dmode=cloud -Dbrowser=<browserName> -Dtags=<category>

Note: By default browser and tags are set to chrome and sanity.
