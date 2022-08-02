package xyz.dean.practice.design_pattern.template;

public class HighSecurityComputer extends AbstractComputer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙……");
    }

    @Override
    protected boolean login() {
        System.out.println("生物识别……");
        return true;
    }
}
