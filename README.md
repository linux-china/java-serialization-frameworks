Java Serialization Frameworks
==============================

Benefits of Serialization:

- Persistence: Store objects in a file or database.
- Communication: Send objects over a network.
- Caching: Store objects in memory for later retrieval.

### Frameworks

* Protobuf: native and protostuff  https://developers.google.com/protocol-buffers/
* FlatBuffers: https://google.github.io/flatbuffers/
* Json: https://www.json.org/
* Kryo: https://github.com/EsotericSoftware/kryo
* Hessian: http://hessian.caucho.com/
* Avro: https://avro.apache.org/     Kafka Schema
* CBOR: http://cbor.io/
* MessagePack: https://msgpack.org/
* Thrift: http://thrift.apache.org/ https://github.com/apache/thrift/blob/master/doc/specs/thrift-compact-protocol.md
* SBE: https://github.com/real-logic/simple-binary-encoding
* Jackson binary format backends: avro, cbor, protobuf, smile: https://github.com/FasterXML/jackson-dataformats-binary
* capnproto: https://capnproto.org/   https://dwrensha.github.io/capnproto-java/index.html
* fury: https://github.com/alipay/fury
* Eclipse Serializer: https://github.com/eclipse-serializer/serializer

### Assistant libraries

* mapstruct
* lombok

### WebAssembly Friendly

* Avor
* Json

### Data Formats

* Apache Parquet(storage): column-oriented data file format designed for efficient data storage and retrieval
* Apache Arrow(memory analysis): Apache Arrow defines a language-independent columnar memory format for flat and hierarchical data, organized for efficient analytic operations on modern hardware like CPUs and GPUs.
* Protocol Buffers(serialization): language-neutral, platform-neutral extensible mechanisms for serializing structured data.
* PlatBuffer(serialization): efficient platform-neutral serialization library, does not need a parsing/ unpacking step to a secondary representation before you can access data, often coupled with per-object memory allocation

### Articles

* Data Serialization with Avro and Protobuf: https://www.slideshare.net/gschmutz/big-data-serialization-with-avro-and-protobuf
* 12 Best Apache Avro Features | Reasons Why Avro is Popular? https://data-flair.training/blogs/apache-avro-features/
* Guide to Simple Binary Encoding: https://www.baeldung.com/java-sbe
* Working with Parquet files in Java using Carpet/Avro/Protobuf/Flatbuffers: https://www.jeronimo.dev/
