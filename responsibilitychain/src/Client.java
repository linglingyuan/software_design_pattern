public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,4000,1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        ColledgeApprover colledgeApprover = new ColledgeApprover("李院长");
        SchoolApprover schoolApprover = new SchoolApprover("王校长");
        //构成一个环
        departmentApprover.setApprover(colledgeApprover);
        colledgeApprover.setApprover(schoolApprover);
        schoolApprover.setApprover(departmentApprover);
        schoolApprover.processRequest(purchaseRequest);
    }
}

