package hello.core.sigleton;

public class SingletonService {

    //static으로 하면 딱 클래스 하나에만 존재하는거
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){
    };

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
