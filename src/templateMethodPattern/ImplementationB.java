package templateMethodPattern;

class ImplementationB extends AbstractTemplate {

    @Override
    protected void step1() {
        System.out.println("AbstractTemplate2 - step1 실행");
    }

    @Override
    protected void step2() {
        System.out.println("AbstractTemplate2 - step2 실행");
    }

    @Override
    protected void step3() {
        System.out.println("AbstractTemplate2 - step3 실행");
    }
}