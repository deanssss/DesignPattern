package xyz.dean.practice.design_pattern.chain;

public abstract class Leader {
    protected Leader next;
    public final boolean handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
            return true;
        } else {
            if (next != null) {
                return next.handleRequest(money);
            } else {
                System.out.println("申请报销太多，公司垮掉了！");
                return false;
            }
        }
    }

    protected abstract int limit();
    protected abstract void handle(int money);

    public static Leader buildChain(Leader first, Leader... chain) {
        Leader leader = first;
        for (Leader l : chain) {
            leader.next = l;
            leader = l;
        }
        return first;
    }
}
