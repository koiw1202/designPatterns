package templateMethodPattern;

abstract class AbstractTemplate {

    // 템플릿 메소드 : 메서드 앞에 final 키워드를 붙이면 자식 클래스에서 오버라이딩이 불가능함.
    // 자식 클래스에서 상위 템플릿을 오버라이딩해서 자기마음대로 바꾸도록 하는 행위를 원천 봉쇄
    public final void templateMethod() {
        // 상속하여 구현되면 실행될 메소드들
        System.out.println("공통으로 실행되는 메소드");
    }

    boolean hook() {
        return true;
    }

    // 상속하여 사용할 것이기 때문에 protected 접근제어자 설정
    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();
}