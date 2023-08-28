public class Second {
    public static void main(String[] args) {
        StudentImpl myStu = new StudentImpl();
        System.out.println(myStu.graduationyear);
        System.out.println(myStu.fname);
        System.out.println(myStu.age);
        myStu.study();
    }
}
