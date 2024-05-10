package templateMethodPattern;

class ImplementationA extends AbstractTemplate {

    @Override
    protected void step1() {
        System.out.println("AbstractTemplate1 - step1 실행");
    }

    @Override
    protected void step2() {
        System.out.println("AbstractTemplate1 - step2 실행");
    }

    @Override
    protected void step3() {
        System.out.println("AbstractTemplate1 - step3 실행");
    }
}