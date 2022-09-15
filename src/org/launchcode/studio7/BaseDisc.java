package org.launchcode.studio7;

public abstract class BaseDisc{
    private int spinSpeed;
    private String dataType;
    private String name;
    private int storageCapacity;
    private String contents; //description
    private String discType;

    public BaseDisc(int spinSpeed, String dataType, String name, int storageCapacity, String contents, String discType) {
        this.spinSpeed = spinSpeed;
        this.dataType = dataType;
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void reportInfo(){
        System.out.println("DISC NAME: " + name);
        System.out.println("STORAGE CAPACITY: " + storageCapacity);
        System.out.println("CONTENTS: " + contents);
        System.out.println("DISC TYPE: " + discType);
    }
}
