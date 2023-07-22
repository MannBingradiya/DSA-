class language{
    String lang = "frontend";
    void contein(){
        System.out.println("which language contain inhetritance?");
    }
    public language(){}
    public language(String lang) {
        this.lang = lang;
    }
}

class java extends language{
    String lang = "backend";
    void inheritancetype(){
        System.out.println("Java contain single, multilevel, heirarchical inheritance");
        System.out.println(lang);
        System.out.println(super.lang);
    }
    void contaoining(){
        super.contein();
    }
    void contein(){
        System.out.println("Java contain single, multilevel, heirarchical inheritance");
    }

    public java(String lang,String lang1) {
        super(lang);
        this.lang = lang1;
    }
    public java(){}


//    public java(String lang, String lang1) {
//        super(lang);
//        this.lang = lang1;
//    }
}

class c extends language{
    void inheritanceContian(){
        System.out.println("C does not contain inheritance");
    }
}
class version extends java{

    void containInheritance(){
        System.out.println("java version 8.0 contaions inheritance");
    }
}

public class inheritences{
    public static void main(String[] args) {
        new version().contein();
        version v1 = new version();
        v1.inheritancetype();
        new c().inheritanceContian();
        java j1 = new java("frontend","backend");
        j1.contein();
        j1.contaoining();
    }
}
