import java.util.Arrays;

class mergeTwoSortedArrays {
  
  public static void main(String[] args) {
    int a[] = {1,3,10,0,0,0,0},
      b[] ={2,5,7,8};
     // b[] ={};
   
    int al= a.length - b.length - 1,
      bl = b.length -1;
      
      for(int i = a.length-1; i>=0; i--) 
      {
        if(bl>=0&&al>=0) {
          if(b[bl]>a[al])
            a[i] = b[bl--];
          else
            a[i] = a[al--];
        }
        else if(al<0)
        {
          a[i] = b[bl--];
        }
      }
      
      System.out.println(Arrays.toString(a));
      
      
  }
  
}