package xyz.dean.practice.design_pattern.template;

abstract public class AbstractComputer {
    protected void powerOn() {
        System.out.println("开启电源……");
    }

    protected void checkHardware() {
        System.out.println("硬件检查……");
    }

    protected void loadOS() {
        System.out.println("加载操作系统……");
    }

    protected boolean login() {
        System.out.println("无安全验证……");
        return true;
    }

    public final void start() {
        System.out.println("------- START UP ---------");
        powerOn();
        checkHardware();
        loadOS();
        if (login()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        System.out.println("------- SHUT DOWN ---------");
    }
}
