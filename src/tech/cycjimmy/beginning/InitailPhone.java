package tech.cycjimmy.beginning;

public class InitailPhone {
    public static void main(String[] args) {
        PhoneClass phone = new PhoneClass();
        phone.sengMessage();
        phone.setScreen(5.0f);
        phone.setCpu(1.2f);
        phone.setMem(4.0f);
        phone.check();
    }
}
