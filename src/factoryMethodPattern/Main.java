package factoryMethodPattern;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-22        koiw1       최초 생성
 */
public class Main {
    public static void main(String args[]) {
        UserFactory userFactory = new NaverUserFactory();
        User user = userFactory.newInstance();

        UserFactory kakaoUserFactory = new KakaoUserFactory();
        User kakaoUser = kakaoUserFactory.newInstance();
    }
}
