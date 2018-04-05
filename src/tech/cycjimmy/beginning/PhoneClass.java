package tech.cycjimmy.beginning;

public class PhoneClass {
    // 属性
    private float screen;
    private float cpu;
    private float mem;

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }

    // 方法
    void call() {
        System.out.println("打电话");
    }

    void sengMessage() {
        System.out.println("发短信");
    }

    void check() {
        System.out.println("screen: " + screen + "; cpu: " + cpu + "; memory: " + mem + ";");
    }
}
