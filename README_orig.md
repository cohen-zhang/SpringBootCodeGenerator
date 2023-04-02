# SpringBootCodeGenerator
----
又名`JAVA在线代码生成平台`、`sql转java`、`大狼狗代码生成器`、`mybatis在线生成器`、`SQL转Java JPA、MYBATIS实现类代码生成平台`<br>
![image](https://img.shields.io/badge/SpringBoot2-%E2%98%85%E2%98%85%E2%98%85%E2%98%85%E2%98%85-blue.svg)
![image](https://img.shields.io/badge/Freemarker-%E2%98%85%E2%98%85%E2%98%85%E2%98%85%E2%98%85-blue.svg)
![image](https://img.shields.io/badge/CodeGenerator-%E2%98%85%E2%98%85%E2%98%85%E2%98%85%E2%98%85-blue.svg)
[![Build Status](https://travis-ci.org/moshowgame/SpringBootCodeGenerator.svg?branch=master)](https://travis-ci.org/moshowgame/SpringBootCodeGenerator)


# Description
>Based on SpringBoot2+Freemarker<br>
>          #基于`SpringBoot2`和`Freemarker`的代码生成平台
> 
>For reducing the repetitive CRUD work<br>
>          #以解放双手为目的，减少大量的`重复CRUD工作`
>
>mainly support mysql, support oracle and pgsql as well<br>
>          #支持`MySQL`、Oracle、PgSQL三大主流数据库
>
>generate to many popular templates by ddl-sql/insert-sql/simple json<br>
>   可通过`建表SQL语句`或`INSERT语句`或者`简单JSON`生成`JPA/JdbcTemplate/Mybatis/MybatisPlus/BeetlSQL/CommonMapper`相关模板代码.
>


# Tips or Features
- 支持DDL SQL/INSERT SQL/SIMPLE JSON三种生成模式
- `自动记忆`最近生成的内容，最多保留9个
- 提供众多`通用模板`，易于使用，复制粘贴加简单修改即可完成CRUD操作
- 支持`特殊字符`模板(`#`请用`井`代替;`$`请用`￥`代替)
- `Util集合`提供一些基本对象的使用方法供方便COPY，如对应的CRUD SQL语句、setMap、getMap、get属性等等
- 关于`类名注释`，可根据`comment=(mysql)`或者`comment on table(pgsql/oracle)`生成
- 可设置是否`自动引包`(java中的import)及`引入包路径`(java类中的package)，建议取消并配合IDEA的自动引包更智能(Settings→Editor→General→Auto Import,勾选Add unambiguous imports on the fly以及Optimize imports on the fly)。
- 可设置`表名前缀`，例如sys_user前缀为sys_之后可以正确生成user类
- 可在`applicaltion.yml`中的`OEM.mode`设置`js/css引入模式`为`local`(本地模式，默认)/`CDN`(云CDN模式，在线网站推荐，省流量)
- OEM信息可以在`applicaltion.yml`中的`OEM`中更改

# Url


Thanks for `JetBrains` providing us the `Licenses for Open Source Development` ，[Get free access to all JetBrains tools for developing your open source project!](https://www.jetbrains.com/community/opensource/#support) .<br>

| 访问地址          | http://localhost:1234/generator                               |
|:--------------|:--------------------------------------------------------------|
| BEJSON 在线地址   | https://java.bejson.com/generator                             |
| DEVTOOLS 在线地址 | https://java.devtools.cn                                      |
| CSDN BLOG     | https://zz                                |
| GITEE仓库       | https://gitee.com/moshowgame/SpringBootCodeGenerator/releases |
| GITHUB仓库      | https://github.com/moshowgame/SpringBootCodeGenerator         |


# Update Logs
| 更新日期       | 更新内容                                                                                                                                                                                                                                                              |
|:-----------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 2023.02.10 | 更新springboot、fastjson、lombok依赖（感谢@Abbykawai的建议）。                                                                                                                                                                                                                  |  

## 生成表结构和数据字典

# ClassInfo/TableInfo
|名称|说明|
|:----|:----|
|packageName|自定义的包名|
|authorName|自定义的作者名|
|tableName|sql中的表名|
|className|java类名|
|classComment|sql表备注/java类备注|
|fieldName|字段名|
|fieldComment|字段备注|

# Options
|名称|说明|默认值|
|:----|:----|:----|
|作者 |authorName|zz|
|包名 |packageName|cn.devtools|
|返回(成功)|returnUtilSuccess|Return.SUCCESS|
|返回(失败)|returnUtilFailure|Return.ERROR|
|忽略前缀|ignorePrefix |sys_|
|输入类型 |dataType|DDL SQL|
|TinyInt转换 |tinyintTransType|int|
|时间类型 |timeTransType|Date|
|命名类型 |nameCaseType|CamelCase/驼峰|
|是否包装类型 |isPackageType|true|
|是否swaggerUI|isSwagger|false|
|是否字段注释|isComment|true|
|是否自动引包|isAutoImport||
|是否带包路径|isWithPackage||
|是否Lombok|isLombok|true|


# How to add a new template
1. `resources/templates/code-generator`中找到对应类型
2. COPY并编写freemarker模板文件`.ftl`
3. 修改`template.json`文件，新增模板信息，页面可动态加载

<img src="./codegenerator1.png">
<img src="./codegenerator2.png">


