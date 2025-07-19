public class jul16_Inheritance {
    public static void main(String[] args) {
        bankaccount example = new bankaccount(20);

        example.defaultmethod();
        example.setPrivatevar(45);
        System.out.println(example.getPrivatevar());

    }

}

  class bankaccount {
    private int privatevar;
    public bankaccount(int privatevar){
        this.privatevar=privatevar;
    }
    public int getPrivatevar(){
        return privatevar;

    }
    public void setPrivatevar(int privatevar){
        this.privatevar = privatevar;
    }
    public void publicmethod(){
        System.out.println("public method ");
    }
    protected void protectedmethod(){
        System.out.println("protected method");
    }
    void defaultmethod(){
        System.out.println("default method");
    }


  }
