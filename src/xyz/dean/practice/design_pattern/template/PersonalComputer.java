package xyz.dean.practice.design_pattern.template;

public class PersonalComputer extends AbstractComputer {
    @Override
    protected boolean login() {
        System.out.println("验证登陆口令……");
        return true;
    }
}
