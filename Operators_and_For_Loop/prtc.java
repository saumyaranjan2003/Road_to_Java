public class prtc{
    public static void main (String[] args) {
    int a=10,b=50;
    a++;
    --b;
    int c=a--+b--;
    System.out.print(++c);
}

}

/*a++,a=11.   --b,b=49.    
    c=a--+b--=11+49=60  
      a=10
      b=48
      print(++c)->print(61) */
