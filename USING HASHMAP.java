import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        HashMap<Integer,String>m=new HashMap<>();
        m.put(10,"ten");
        m.put(5,"five");
        m.put(102,"alice");
        System.out.println("size:"+m.size());
        System.out.println(m);
    }
}
