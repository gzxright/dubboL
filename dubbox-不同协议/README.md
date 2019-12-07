##dubbox示例

**演示dubbo/thrift/avro/rest协议各种服务provider/consumer的基本示例**

1. 运行前，先在本机安装zookeeper，并修改项目中的相关配置文件
2. 基于dubbox 2.8.4a版本，请先git clone https://github.com/yjmyzz/dubbox.git , 然后本机mvn install -Dmaven.test.skip=true
3. 编译：demo-service-provider下执行gradle pack即可，会在build/install生成打包好的文件及启动脚本；demo-service-consumer类似处理

---
by [菩提树下的杨过](http://www.cnblogs.com/yjmyzz/tag/dubbox/)