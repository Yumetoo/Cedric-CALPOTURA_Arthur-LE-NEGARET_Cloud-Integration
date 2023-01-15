package test;

public class MyCharacter {
    private String name;
    private String className;
    private String area;
    private int level;

    public MyCharacter() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getArea() {
        return this.area;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String toString() {
        return "My Character [name=" + this.name + ", className=" + this.className + ", area=" + this.area + ", level=" + this.level + "]";
    }
}