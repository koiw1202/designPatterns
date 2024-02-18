package factoryMethodPattern;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-18        koiw1       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        UserFactory userFactory = new NaverUserFactory();
        User user = userFactory.newInstance();

// 위 클라이언트 코드 수정 없이 다른 곳에서 사용 가능
        UserFactory kakaoUserFactory = new KakaoUserFactory();
        User kakaoUser = kakaoUserFactory.newInstance();

    }
}