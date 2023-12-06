package com.solution.array;

public class TwoMedium {


    public static double medium(int a[],int b[])
    {
      //  int c[]=new int[a.length+b.length];
        int c[] =new int[a.length+b.length];
        float min= 0.0F;

            for (int i=0;i<a.length;i++){
                c[i]=a[i];
            }
            for(int j=0;j<b.length;j++){
                 c[a.length+j]=b[j];
            }
            sort(c);
           // Arrays.sort(c);
            if(c.length%2==0)
            {
                int mid= c[c.length/2];
                int mid1= c[(c.length/2)-1];

                min=Float.valueOf(mid+mid1)/2;

            }else {
                min=c[c.length/2];
            }
        System.out.println("joined :::"+min);

        return Double.valueOf(min);
    }
    private static void sort(int array[]){
        for(int i=0;i<array.length-1;i++) {
            for(int j=i+1 ;j <array.length; j++){
                if(array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
//        int j=i;
//        int firstInd=array[i];
//        while (j>0&&array[j-1]<firstInd){
//         int temp= array[j-1];
//
//         array[i]=temp;
//          j--;
//        }
//            array[j]=firstInd;
//        }

    }
    public static void main(String[] args) {
       int[] nums1= {1,2};
       int[] nums2 = {3,4};
       TwoMedium tm= new TwoMedium();
        double medium = medium(nums2, nums1);
        System.out.println("medium :::::"+medium);

    }
    }
