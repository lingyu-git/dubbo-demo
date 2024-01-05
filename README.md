# dubbo-demo
dubbo学习项目

## grpc

grpc项目是grpc的原生使用

执行`protobuf-maven-plugin`插件的`compile`和`compile-custom`编译proto文件

执行`HelloWorldServer`的main方法开启服务

执行`HelloWorldClient`的main方法消费服务

## protocol-triple

protocol-triple项目是使用了dubbo的triple协议，需要注意版本，如果版本不适配，会导致程序跑不起来

版本号
- dubbo:3.0.0
- grpc:1.36.0
- dubbo-serialization-protobuf:2.7.12
- os-maven-plugin:1.6.1
- protobuf-maven-plugin:0.6.1
- protoc:3.7.1
- protoc-gen-grpc-java:1.36.0
- dubbo-compiler:0.0.2

执行`mvn clean install`编译proto文件并打包

执行`TripleProvider`的main方法开启Dubbo服务

执行`TripleConsumer`的main方法消费Dubbo服务
