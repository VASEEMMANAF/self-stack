public class parent {
    public void speaking(){
        System.out.println("i am  speaking");
    }
}
class child1 extends parent{
    @Override
    public void speaking(){
        System.out.println(" i am speaking hindi");

    }
}
class child2 extends parent{
    @Override
    public void speaking() {
        System.out.println("i am speaking malayalam");
    }
}