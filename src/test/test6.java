package test;

class Class6{
    public int numberOfinstances;
    protected Class6(int numberOfinstances){
        this.numberOfinstances=numberOfinstances;
    }
}
class ExtendsA extends Class6{
    private ExtendsA(int numberOfinstances){
        super(numberOfinstances);
    }
    public static void main(String[] args){
        ExtendsA ext=new ExtendsA(420);
        System.out.println(ext.numberOfinstances);
    }
}
