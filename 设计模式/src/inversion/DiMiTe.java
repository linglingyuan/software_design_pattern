package inversion;

public class DiMiTe {
}
class AA{
    private AA aa;
    public BB m1(int num){
        BB bb = new BB();
        return num > 0 ? null : bb;
    }
    public void m2(BB bb){
        System.out.println("");
    }
    public void m3(){
        BB bb;
    }
}
class BB{}