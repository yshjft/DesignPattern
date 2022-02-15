package d7_facade;

public class FacadeService {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    public FacadeService() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
    }

    public void operate(String name) {
        subSystem1.doSomething(name);
        subSystem2.doSomething(name);
        subSystem3.doSomething(name);
    }
}
