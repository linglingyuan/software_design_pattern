package edu;

public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void call(){
        super.call();
        System.out.println("正常式");
    }
}
