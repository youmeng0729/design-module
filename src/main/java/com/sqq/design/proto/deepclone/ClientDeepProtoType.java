package com.sqq.design.proto.deepclone;

public class ClientDeepProtoType {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "Song Jiang";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("Tom", "Tom Class");

        DeepProtoType c1 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType c2 = (DeepProtoType) deepProtoType.clone();
        System.out.println(c1.hashCode() + ";" + c1.deepCloneableTarget.hashCode());
        System.out.println(c2.hashCode() + ";" + c2.deepCloneableTarget.hashCode());

        DeepProtoType c3 = (DeepProtoType) deepProtoType.deepClone();
        DeepProtoType c4 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(c1.hashCode() + ";" + c3.deepCloneableTarget.hashCode());
        System.out.println(c2.hashCode() + ";" + c4.deepCloneableTarget.hashCode());
    }
}
