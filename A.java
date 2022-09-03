class A{
    public int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
    
    public static void main(String[] args) {
       A o=new A();
       int n=5;
       
       
       System.out.println(o.fib(n));
         
    }
}
 