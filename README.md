# API开放平台
提供 API 接口供开发者调用的平台，基于 Spring Boot 后端 + React 前端的全栈微服务项目。管理员可以接入并发布接口、统计分析各接口调用情况;用户可以注册登录并开通接口调用权限、浏览接口、在线调试，还能使用客户端 SDK 轻松在代码中调用接口。



## 项目亮点
- 根据业务流程将整个项目后端划分为 web 系统、模拟接口、公共模块、客户端 SDK、API 网关这 5 个子项目，并使用 Maven 进行多模块依赖管理和打包
- 基于 MyBatis Plus 框架的 QueryWrapper 实现对 MySQL 数据库的灵活査询，并配合 MyBatis X 插件自动生成后端 CRUD 基础代码，减少重复工作
- 后端使用 Swagger +Knife4j 自动生成 OpenAPI 规范的接口文档，前端在此基础上使用插件自动生成接口请求代码，降低前后端协作成本
- 为防止接口被恶意调用，使用 SHA256 加密算法对用户信息进行加密鉴权，为用户分配唯一的 ak/sk 以鉴权，并添加随机数和时间戳防止重放攻击
- 为解决开发者调用成本过高的问题：需自己使用 HTTP + 封装签名去调用接口从而过于复杂，基于 Spring Boot Starter 开发了客户端 SDK，两行代码即可调用接口，提高开发体验
- 选用 Spring Cloud Gateway 作为 API 网关，实现了路由转发、访问控制、流量染色，并集中处理签名校验、请求参数校验、接口调用统计等业务逻辑，提高安全性的同时、便于系统开发维护
- 为解决多个子系统内代码大量重复的问题：抽象模型层和业务层代码为公共模块，并使用 Dubbo RPC 框架实现子系统间的高性能接口调用，大幅减少重复代码  

## 系统架构

![image](https://github.com/PALE13/api-backend/assets/77827436/b280db9a-af52-4be6-b1f7-3c284730f00a)




## 技术栈
**后端**  
- Java Spring Boot
- MySQL 数据库
- MyBatis-Plus 及 MyBatis X 自动生成
- API 签名认证（Http 调用）
- Spring Boot Starter（SDK 开发）
- Dubbo 分布式（RPC、Nacos）
- Swagger + Knife4j 接口文档生成
- Spring Cloud Gateway 微服务网关
- Hutool、Apache Common Utils、Gson 等工具库
 
**前端**
- React 18
- Ant Design Pro 5.x 脚手架
- Ant Design & Procomponents 组件库
- Umi 4 前端框架
- OpenAPI 前端代码生成  
