package edu;

public class FoldPhone extends Phone{
    public FoldPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void call(){
        super.call();
        System.out.println("折叠式");
    }
}
