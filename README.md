<p align="center">
  <img alt="Nimble logo" src="https://assets.nimblehq.co/logo/light/logo-light-text-320.png" />
</p>

---

A collection of templates:

* **[CoroutineTemplate](https://github.com/nimblehq/android-templates/tree/kotlin/CoroutineTemplate)**
* **[RxJavaTemplate[DEPRECATED]](https://github.com/nimblehq/android-templates/tree/kotlin/RxJavaTemplate)**

## Setup

1. Clone or download this repository to your local machine, then extract and open the folder
2. Run `newproject.sh` script to create a new project with the following inputs:

```
  -h, --help                         Display this usage message and exit
  -t, --template [TEMPLATE]          Select template: "rx" - RxJavaTemplate or "crt" - CoroutineTemplate (i.e. rx)
  -p, --package-name [PACKAGE_NAME]  New package name (i.e. com.example.package)
  -n, --app-name [APP_NAME]          New app name (i.e. MyApp, "My App")
```

Example:
- Init a new project with `RxJavaTemplate`
  `./newproject.sh -t rx -p co.myproject.example -n "My Project"`

- Init a new project with `CoroutineTemplate`
  `./newproject.sh -t crt -p co.myproject.example -n "My Project"`

3. Update `android_version_code` and `android_version_name`
  - `RxJavaTemplate[DEPRECATED]/build.gradle`
  - `CoroutineTemplate/build.gradle`

## About

![Nimble](https://assets.nimblehq.co/logo/dark/logo-dark-text-160.png)

This project is maintained and funded by Nimble.

Learn more about our Android templates on the [Wiki](https://github.com/nimblehq/android-templates/wiki).
