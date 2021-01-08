package edu;

public class Client {
    public static void main(String[] args) {
        FoldPhone foldPhone = new FoldPhone(new MI());
        foldPhone.call();
        UpRightPhone upRightPhone = new UpRightPhone(new MI());
        upRightPhone.call();
    }
}
