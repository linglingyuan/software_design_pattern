public class SchoolApprover extends Approver{
    public SchoolApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >= 30000){
            System.out.println(purchaseRequest.getId() + "被" + this.name + "处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
