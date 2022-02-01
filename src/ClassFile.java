public class ClassFile {
    int magic;
    short minorVersion;
    short majorVersion;
    short constantPoolCount;
    ConstantPoolInfo constantPool;
    short accessFlags;
    short thisClass;
    short superClass;
    short interfacesCount;
    short interfaces;
    short fieldsCount;
    FieldInfo fields;
    short methodsCount;
    MethodInfo methods;
    short attributesCount;
    AttributeInfo attributes;

    public ClassFile() {}

    public static ClassFile parse() {
        ClassFile cf = new ClassFile();

        return cf;
    }
}

class ConstantPoolInfo {
    int size;
}

class FieldInfo {
    int size;
}

class MethodInfo {
    int size;
}

class AttributeInfo {
    int size;
}