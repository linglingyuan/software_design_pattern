public abstract class Approver {
    Approver approver;//下一个处理者
    String name;
    public Approver(String name){
        this.name = name;
    }
    //下一个处理者
    public void setApprover(Approver approver){
        this.approver = approver;
    }
    //交给子类完成该请求
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
