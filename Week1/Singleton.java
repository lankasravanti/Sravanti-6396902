class Singleton{
    //1.create private static instance of the calss
    private volatile static Singleton sg;//initially null
    //2.private constructor to prevent or avoid instantiation
    private Singleton(){}
    //3. public staic to get instance method to provoid acess to instance or object
    public static Singleton getInstance(){
        if(sg==null){
            synchronized(Singleton.class){
                if(sg==null){
            sg=new Singleton();
                }
            }
        }
        return sg;
    }
    //individual public method of the class
    public void Displaymsg(){
        System.out.println("Singleton info");
    }
    }