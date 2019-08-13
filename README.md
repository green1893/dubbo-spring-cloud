# dubbo-spring-cloud
Spring Cloud与Dubbo服务集成示例，通过代码兼容方式将已有的服务实现（dubbo实现）注册到Spring Cloud环境中，可用于项目架构迁移

## 模块说明
- dubbo-registry: 服务注册与发现
- dubbo-api: 公共服务接口
- dubbo-provider: dubbo服务发布
- dubbo-consumer：dubbo服务消费&Spring Cloud服务注册

## 版本说明
- spring-boot [ 2.1.7.RELEASE ]
- spring-cloud [ Greenwich.SR2 ]
- dubbo [ 2.7.3 ]
- eureka [ 2.1.2.RELEASE ]