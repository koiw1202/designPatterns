package abstractFactoryPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-19        koiw1       최초 생성
 */
public class KeyboardFactory {

    Map<String, Keyboard> keyboardMap = new HashMap<>(){{
        put("LG", new LGKeyboard()) ;
        put("Samsung", new SamsungKeyboard()) ;
    }} ;

    public Keyboard createKeyboard(String type){

        return keyboardMap.get(type) ;

    }
}
