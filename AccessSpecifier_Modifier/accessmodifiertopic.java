package AccessSpecifier_Modifier;

public class accessmodifiertopic {

    public void publictopic(){

        System.out.println("* Using public method we can access in all packages and classes " +
                "and can use extends and objects to call any method ");
    }

    private void privatetopic(){

        System.out.println("* Using private method we can only access inside a class and " +
                "unable use in another class or package");
    }

    void defaulttopic(){

        System.out.println("* Using default method we can access inside a package in different classes but unable to" +
                "use in other packages and unable to use extends or objects to call in other package too");
    }

    protected void protectedtopic(){

        System.out.println("* Using protected method we can access in all packages and to access in other packages we can use " +
                "only extends for other packages but unable to use object to call in other packages");
    }

    public static void main(String[] args) {
        accessmodifiertopic am = new accessmodifiertopic();
        am.publictopic();
        am.privatetopic();
        am.defaulttopic();
        am.protectedtopic();
        System.out.println("* This rules applies same to all variables when using datatypes like int, float, char, string");
    }
}
