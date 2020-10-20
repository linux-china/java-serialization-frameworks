@0xe9e172ef0f0049f6;

using Java = import "/java.capnp";

$Java.package("org.expretio");
$Java.outerClassname("Foo");

struct PersonStruct
{
    id  @0 :Int32;
    name @1 :Text;
}