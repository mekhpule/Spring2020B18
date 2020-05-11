package day37_Constructors;

public class InstanceBlock {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        InstanceBlock obj1 = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();

    }

    {
        System.out.println("Instance block2");
    }
}
