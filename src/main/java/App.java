public class App {
    public static void main(String[] args) {

        Chrome cTest = new Chrome();
        FireFox ffTest = new FireFox();
        Opera oTest = new Opera();
        System.out.println(cTest.title());
        System.out.println(ffTest.title());
        System.out.println(oTest.title());


    }
}

