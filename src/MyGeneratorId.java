public class MyGeneratorId {
    public static long id = 0;

    public static long generator(){
        return (++id);
    }
}
