# stocks_analyzer_commonsとは（Overview）
各stocks-analyzer関連アプリケーションからの参照を想定しており、
共通的に利用可能な機能、オブジェクトのチェック、日付操作、フィールド操作、リスト操作、数値操作、文字列操作等、ユーティリティ機能を提供します。



## インストール（Install）
利用方法は、build.sbtに下記依存性の定義を記述いただくことで利用可能です。
```
libraryDependencies ++= Seq(
  "com.stocks_analyzer" % "stocks_analyzer_commons_2.11" % "1.0.0"
)

resolvers += "Maven Repository on Github" at "https://chotto-martini.github.io/stocks_analyzer_commons/repository"
```

### ローカル環境構築、コンパイル方法
- cloneしたプロジェクトのコンパイル方法です。
```
$ cd ./stocks_analyzer_commons/
$ activator compile

・・・※中略

[success] Total time: 0 s, completed 2018/05/06 16:58:23
```

- cloneしたプロジェクトの公開方法です。
```
$ cd ./stocks_analyzer_commons/
$ activator publish

・・・※中略

[success] Total time: 2 s, completed 2018/05/06 17:00:42
```

- cloneしたプロジェクトの開発環境構築方法です。
```
$ cd ./stocks_analyzer_commons/
$ activator eclipse

・・・※中略

[info] Successfully created Eclipse project files for project(s):
[info] stocks_analyzer_commons
```



## ドキュメント（Document）

* [stocks_analyzer_commons（1.0.0） アプリケーション API仕様](https://chotto-martini.github.io/stocks_analyzer_commons/doc/javadoc/stocks_analyzer_commons/1.0.0/)



## 更新履歴（Version history）

* [1.0.0](https://github.com/chotto-martini/stocks_analyzer_commons/releases/tag/1.0.0) リリース 2018/05/06



## ライセンス（License）
Copyright 2018 chotto-martini This software is licensed under the Apache 2 license, quoted below.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
