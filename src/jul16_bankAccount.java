public class jul16_bankAccount {

    public static void main(String[] args) {
            bankaccount example = new bankaccount( 20);
            System.out.println(example.publicvar);
            example.publicmethod();

            System.out.println(example.defaultvar);
            example.protectmethod();

            example.defaultmethod();

            example.setPrivatevar(50);
            System.out.println(example.getPrivatevar());

    }

    static class bankaccount {
        private int privatevar;
        public bankaccount(int privatevar){
            this.privatevar = privatevar;
        }

        public int getPrivatevar(){
            return  privatevar;
        }

        public void setPrivatevar(int privatevar){

            this.privatevar = privatevar;
        }

        public int publicvar = 10;
        protected int protectedvar = 20;
        int defaultvar = 30;

        public void publicmethod(){
            System.out.println("public method");
        }
        protected void protectmethod(){
            System.out.println("protected method");
        }
        void defaultmethod(){
            System.out.println("default method");
        }
    }
}
