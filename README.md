# mailversendala

Application to send out mass emails based on a list of recipients in a CSV file.

## CSV format

The application can be fed with a CSV file (separator is ,). It needs to have a header line and the following naming for columns:

| firstname  | surname | email |
| --------------------- | ----------- | ----------------------- |
| Your | Family | foo@baar.com |

Email needs to be a complete mail address.
An example file is [mailversendala-example.csv](./src/main/resources/mailversendala-example.csv).

## Project Status

[![Stories in Backlog](https://badge.waffle.io/ottlinger/mailversendala.png?label=backlog&title=Backlog)](https://waffle.io/ottlinger/mailversendala)
[![Stories in Ready](https://badge.waffle.io/ottlinger/mailversendala.png?label=ready&title=Ready)](https://waffle.io/ottlinger/mailversendala)
[![Stories in Progress](https://badge.waffle.io/ottlinger/mailversendala.png?label=in%20progress&title=In%20Progress)](https://waffle.io/ottlinger/mailversendala)
[![Average time to resolve an issue](http://isitmaintained.com/badge/resolution/ottlinger/mailversendala.svg)](http://isitmaintained.com/project/ottlinger/mailversendala "Average time to resolve an issue")
[![Percentage of issues still open](http://isitmaintained.com/badge/open/ottlinger/mailversendala.svg)](http://isitmaintained.com/project/ottlinger/mailversendala "Percentage of issues still open")
[![Known Vulnerabilities](https://snyk.io/test/github/ottlinger/mailversendala/badge.svg)](https://snyk.io/test/github/ottlinger/mailversendala)
[![GPL v3.0](https://img.shields.io/github/license/ottlinger/mailversendala.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

## Github integrations
### Travis / CI

In order to just play around with it I've integrated a CI run:

[![Build Status](https://travis-ci.org/ottlinger/mailversendala.svg?branch=master)](https://travis-ci.org/ottlinger/mailversendala)

### Code coverage

[![codecov](https://codecov.io/gh/ottlinger/mailversendala/branch/master/graph/badge.svg)](https://codecov.io/gh/ottlinger/mailversendala)

### Codacy - code quality and static analysis

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/c8fc0c6ef3d14192a2a8f84a670ccb92)](https://www.codacy.com/app/github_25/mailversendala)

## How to run and use the application

You need to checkout the application and build it with the help of [Java](https://java.sun.com) and [Maven](https://maven.apache.org/).

```
$ git clone https://github.com/ottlinger/mailversendala.git
Cloning into 'mailversendala'...
...

$ mvn
....
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 8.864 s
[INFO] Final Memory: 34M/481M
[INFO] ------------------------------------------------------------------------

 $ java -jar target/mailversendala-1.0.0-SNAPSHOT-executable.jar
 ....
 1970-01-01 01:23:45,280 INFO d.a.m.Mailversendala [main] **** MAILVERSENDALA: Application shutdown .... ****

```

In case you want to use the application productively you need to configure it, please continue reading the following paragraph.

## How to configure the application

In order to properly configure the application you need to set some mail-related properties.
Please use the file [javaconfiguration.properties.template](./src/main/resources/META-INF/javaconfiguration.properties.template) and save it as *javaconfiguration.properties*.

### Available configuration modes

If you are running the application as a fat JAR you may want to overwrite each of the configuration key either environment variable or runtime property:
```
$ java -jar target/mailversendala-0.1-executable.jar
// runs with default parameters from within the JAR

$ export csvpath=/tmp/my.csv; java -jar target/mailversendala-0.1-executable.jar
// configuration set as environment variable

$ java -Dcsvpath=/tmp/my.csv -jar target/mailversendala-0.1-executable.jar
// configuration option set as JVM parameter
```

### Configurable program options

The following parameters can be set:

| Configuration option  | Description | Example/default setting |
| --------------------- | ----------- | ----------------------- |
| host | SMTP mail host | smtp.example.com |
| port | SMTP host port | 465 |
| username | SMTP plaintext username | user@example.com |
| password | SMTP plaintext password | chooseMeWisely |
| demomode | boolean, whether to not send mails | true |
| csvpath | fully qualified path to your CSV data input file | /tmp/mailversendala-example.csv |
| templatepath | fully qualified path to your template directory. This directory needs to contain mailtemplate.html and mailtemplate.txt | /tmp/mailversendala |
| subject | full subject line of the example mail | Whatever you want is a subject line |
| from | mail address that is sent from | santa@cruz.com |
| to | mail address that an example mail is sent to **deprecated** | xmas@man.com |

## Copyright

&copy; P. Ottlinger, 2017
