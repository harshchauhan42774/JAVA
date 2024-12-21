 class pre11
 {
   double r;
   int l;
   int w;
   void area(double r)
   {
     double ans;
     ans=3.14*r*r;
     System.out.println("area of circle is::"+ans);
   }
   void area(int l,int w)
   {
     int ans;
     ans=l*w;
     System.out.println("area of rectangle::"+ans);
   }
   public static void main(String args[]) {
     pre11 s=new pre11();
     s.area(5.0f);
     s.area(5,9);
   }

 }
