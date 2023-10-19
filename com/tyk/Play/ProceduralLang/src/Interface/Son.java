package Interface;

public interface Son extends Grandfather, Father {
    @Override
    public void method1();

    @Override
    public int method2(String msg);
}